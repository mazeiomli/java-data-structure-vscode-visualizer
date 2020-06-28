# Visualize Java Data Structures in VSCode

**Project is very incomplete. Pardon my dust.**

Coding complex data structures is difficult, especially due to the lack of visuals. To make learning data structures and algorithms easier, this extension visualizes data structures before and after they are manipulated. Extension currently only supports Java.

Use case: As a beginner in data structures, I want to write a method to reverse a linked list or perform in order search on a BST. I want to visualize the data structure I’m operating on.

Why? Coding Java is in english, which may be difficult for those who do not know english well. Visuals serve as a universal language. This extension will lower the barrier for learning how to code methods that operate on classic data structures. This will allow a beginner programmer to learn how to work with these data structures faster. Although most software engineers don’t use these data structures, the data structures are fundamental to computer science and many university computer science classes teach them.


# Original README from sample repo:Cat Coding — A Webview API Sample

Demonstrates VS Code's [webview API](https://code.visualstudio.com/api/extension-guides/webview). This includes:

- Creating and showing a basic webview.
- Dynamically updating a webview's content.
- Loading local content in a webview.
- Running scripts in a webview.
- Sending message from an extension to a webview.
- Sending messages from a webview to an extension.
- Using a basic content security policy.
- Webview lifecycle and handling dispose.
- Saving and restoring state when the panel goes into the background.
- Serialization and persistence across VS Code reboots.

## Demo

![demo](demo.gif)

## VS Code API

### `vscode` module

- [`window.createWebviewPanel`](https://code.visualstudio.com/api/references/vscode-api#window.createWebviewPanel)
- [`window.registerWebviewPanelSerializer`](https://code.visualstudio.com/api/references/vscode-api#window.registerWebviewPanelSerializer)

## Running the example

- Open this example in VS Code 1.25+
- `npm install`
- `npm run watch` or `npm run compile`
- `F5` to start debugging

Run the `Cat Coding: Start cat coding session` to create the webview.
