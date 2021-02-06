# Java Data Structure VSCode Visualizer
**This project is in progress.** The extension portion is incomplete. The code is able to generate PNG visualizations of singly LinkedLists. After the Java code runs, the Python script must be run manually. 

**Please see the java-datastruc-vscode-viz directory for the project**

This project creates visualizations (as PNG format images) of Java data structures and displays the image in VSCode.

[Link to Demo](https://youtu.be/eI3o2CyS2ug)

This project was featured during the closing ceremony of the 2020 VSCode Hackathon! [Link to demo in livestream recording](https://www.youtube.com/watch?v=qknbai1Dntc&t=3398s)

## What is the user's workflow?

The user will use the Java methods and data structure classes that I provide. After coding operations on a data structure and adding the required convert-data-structure-to-JSON methods (see src/main/java/javaSrc/Runner.java for example usage), the user will run their Java code through their preferred method. Then, they will activate the extension, which will run the python script and display the images of the data structure.

## Motivation

Coding complex data structures is difficult, especially due to the lack of visuals. To make learning data structures and algorithms easier, this extension visualizes data structures before and after they are manipulated. Extension currently only supports Java.

Use case: As a beginner in data structures, I want to write a method to reverse a linked list or perform in order search on a BST. I want to visualize the data structure I’m operating on.

Why? Coding Java is in english, which may be difficult for those who do not know english well. Visuals serve as a universal language. This extension will lower the barrier for learning how to code methods that operate on classic data structures. This will allow a beginner programmer to learn how to work with these data structures faster. Although most software engineers don’t use these data structures, the data structures are fundamental to computer science and many university computer science classes teach them.
