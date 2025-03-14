package com.tic_tac_toe;

public class TicTacToe { 
    private static final String purple = "\033[35m";
    private static final String green = "\033[32m"; 
    private static final String reset = "\u001B[0m";
    public static void main(String[] args) {
        Board board = new Board();
        Players players = new Players(board);

       
        while(true) {
            board.printBoard();
            int move = players.getPlayerMove(); 
            char currentPlayer = board.getCurrentPlayer();
            board.makeMove(move);

             
           

           if (board.checkWinner(currentPlayer)) {
               board.printBoard();
               String color = (currentPlayer == 'X') ? green : purple;
               System.out.println(color + "Player " + currentPlayer + " wins! Congratulations!" + reset);


                    break;
            }
            if(board.isBoardFull()) {
                board.printBoard();
                String red="\033[31m";
                System.out.println(red+ "Tie!"+ reset);
                break;
            }
        }
    }
}

