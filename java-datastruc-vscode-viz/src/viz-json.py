"""

This script:
reads from json files. create visualization in py interface to graphviz. 
render png and save png to pwd

read in after-data-struc.json and before-data-struc.json

JSON format:
{
“nodeID” : {
		"data" : 1 (int)
		"adjList" : [list of node ids]
	}, ...
}

Naive implementation: use dicts, lists, etc. 
then write a python script to timeit

Better implementation: 
Can I use generators to replace lists?
Can I use deque to replace lists?
Change validate_format accordingly

TODO: give option to use gv as Graph or Digraph

If the nested block were to contain a return statement, 
or a continue or break statement, 
the with statement would automatically close the file in those cases, too.

"""

import graphviz as gv
import json

# Raises type error if parsed json field
# has a type different than the expected type
# If all types match, function returns nothing
def valid_format(graph_rep_pyjson, filename) -> None:
	for k,v in graph_rep_pyjson.items():
		if type(k) is not str:
			raise TypeError("in {} nodeID: {} is not str but expected to be of type str".format(filename, str(k)))
		if type(v) is not dict or v["data"] is not int or v["adjList"] is not list:
			raise TypeError("in {} nodeID: {} corresponding value dict has wrong types".format(filename, str(k)))
		# if v["adjList"] is empty, body of for loop doesn't run
		for node_id in v["adjList"]:
			if node_id is not str:
				raise TypeError("in {} nodeID: {} adjList has a non-str element".format(filename, str(k)))

	


"""
Assume:
file names are hard coded
files are in present working directory

Parse json. validate input; if malformed, raise value error
"""
def parse_json(filename):
	try:
		with open(filename, "r") as fp:
			parsed = json.load(fp)
	except FileNotFoundError as err:
		raise err
	except Exception as err:
		raise err
	# format checking causing issues
	# omit for now
	# valid_format(parsed, filename)
	return parsed

def create_graph(graph_rep_pyjson, name):
	# add more parameters? -  file name, png
	dot = gv.Digraph(name = name)
	# edge creation works if endpoints nodes
	# not created yet, I think
	# to be safe, create nodes first then add edges
	for k,v in graph_rep_pyjson.items():
		dot.node(k, label = str(v['data']))
	for k,v in graph_rep_pyjson.items():
		dot.edges([(k, neighborID) for neighborID in v['adjList']])
	return dot

"""
Input: List of gz.Digraph or gz.Graph

TODO: consider specifying directory, cleanup, quiet in render
"""
def render_graphs(dot_list: list):
	for dot in dot_list:
		dot.render(filename = dot.name, format = "png")

def main():
	print("this is main")
	json_files = ["before-data-struc", "after-data-struc"]
	# read in json, convert to python data struc
	# appends .json to name
	graph_pyjson_lst = [(i, parse_json(name + ".json")) for (i, name) in enumerate(json_files)]
	# traverse data struc, add node/edges
	dot_lst = [create_graph(tup[1], json_files[tup[0]]) for tup in graph_pyjson_lst]

	# render
	render_graphs(dot_lst)

	print("done")


if __name__ == "__main__":
	main()