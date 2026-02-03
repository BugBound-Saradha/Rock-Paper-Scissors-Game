Rock Paper Scissors Game (Java)
📌 Description

This is a simple console-based Rock, Paper, Scissors game written in Java.
The user selects an option (Rock, Paper, or Scissors), and the computer randomly generates its own choice. The program then compares both choices and displays the result: Win, Lose, or Draw.

This project is great for practicing:

Java control flow (if, switch)

User input with Scanner

Random number generation

Basic game logic

🛠️ Technologies Used

Java

java.util.Scanner for user input

java.util.Random for system-generated choices

▶️ How to Run the Program

Make sure Java is installed on your system.

Clone or download this repository.

Open the project in your IDE (Eclipse, IntelliJ, VS Code, etc.).

Navigate to:

day4Package/RockPaperScissorsGame.java


Run the main method.

🎮 How to Play

When the program starts, you’ll see the following options:

1. Rock
2. Paper
3. Scissors

Steps:

Enter a number between 1 and 3.

The system randomly chooses its option.

The result is displayed based on the game rules.

❗ Input Validation

If the user enters a number less than 1 or greater than 3, the program displays an error message:

Invalid option selected, option must be 1, 2 or 3

🧠 Game Rules

Rock beats Scissors

Scissors beats Paper

Paper beats Rock

Same choices result in a DRAW

📂 Project Structure
day4Package/
 └── RockPaperScissorsGame.java

🚀 Possible Improvements

Allow replay without restarting the program

Use enums for cleaner option handling

Add score tracking

Improve user input handling (prevent crashes on non-numeric input)

👤 Author

Created as a Java practice project for learning basic programming concepts.
