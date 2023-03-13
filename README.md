# LiveFootballScoreBoardApp
The implementation of the Live Football World Cup Score Board


ScoreBoard library is for keeping track of matches and their scores.

#Installation

To use this library in your Java project, simply download the ScoreBoard.java file and add it to your project's source code.

#Usage

To use the ScoreBoard library, create a new instance of the `ScoreBoard` class and call its methods to "add", "update", and "end games", and to "getGames" of games in progress.

Here's an example of how to use:

ScoreBoard sb = new ScoreBoard();

sb.addNewGame("Poland", "Holland");

sb.updateScore("Poland", "Holland", 2, 1);

sb.endGame("Poland", "Holland");

Game[] sum = sb.getGames();
