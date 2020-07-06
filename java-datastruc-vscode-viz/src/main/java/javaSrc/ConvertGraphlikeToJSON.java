/*
Takes a graph-like data strucutre and converts it to an adjacency list
representation. Then converts adj list representation to json
string, which is written to disk.

*/

package javaSrc;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class ConvertGraphlikeToJSON{

	// maybe todo?
	public static void convertLinkedListToJSON(LinkedListNode head, String filename){
		try{
			linkedListToJSON(head, filename);
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}

	}



	//writes json rep of string to disk
	public static void linkedListToJSON(LinkedListNode head, String filename) throws Exception{
		JSONObject linkedListJSON = new JSONObject();
		LinkedListNode curr = head;
		//iterate through linked list, construct adj list
		while(curr != null){
			//add to adjlist
			JSONObject nodeData = new JSONObject();
			nodeData.put("data", curr.getData());
			JSONArray adjList = new JSONArray();
			if(curr.getNext() != null){
				adjList.add(curr.getNext().getUID());
			}
			/* 
			let adjlist be null if nothing
			else{
				adjList.add("null");
			}
			*/
			//forgot this line
			nodeData.put("adjList", adjList);
			// issue: put wrong variable
			linkedListJSON.put(curr.getUID(), nodeData);

			curr = curr.getNext();

		}
		// System.out.println(linkedListJSON.toJSONString());
		Files.write(Paths.get(filename), linkedListJSON.toJSONString().getBytes());
	}

	
}