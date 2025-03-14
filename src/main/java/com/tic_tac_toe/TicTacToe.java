package com.tic_tac_toe;

public class TicTacToe { 
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
               System.out.println("Player " + currentPlayer + " wins! Congratulations!");

                    break;
            }
            if(board.isBoardFull()) {
                board.printBoard();
                System.out.println("Tie!");
                break;
            }
        }
    }
}

