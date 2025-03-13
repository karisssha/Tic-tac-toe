package com.tic_tac_toe;

public class Board {
    private char[] board;
    private int movesPlayed;
    private char currentPlayer;

    public Board() {
        board = new char[9];
        movesPlayed = 0;
        currentPlayer = 'X';

        for(int i = 0; i < 9; i ++) {
            board[i] = (char)('1' + i);
        }
    }
    public char getCurrentPlayer() {
        return currentPlayer;
    }
    public void printBoard() {
        System.out.println();
        System.out.printf(" %s | %s | %s %n", board[0], board[1], board[2]);
        System.out.println("---+---+---");
        System.out.printf(" %s | %s | %s %n", board[3], board[4], board[5]);
        System.out.println("---+---+---");
        System.out.printf(" %s | %s | %s %n", board[6], board[7], board[8]);
        System.out.println();
    }
    public boolean isValidMove(int position) {
        return position >= 0 && position < 9 && 
               (board[position] == '1' || board[position] == '2' || 
                board[position] == '3' || board[position] == '4' || 
                board[position] == '5' || board[position] == '6' || 
                board[position] == '7' || board[position] == '8' || 
                board[position] == '9');
    }
    public void makeMove(int position) {
        board[position] = currentPlayer;
        movesPlayed++;
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }
        
    public boolean checkWinner(char player) {
        return (board[0] == player && board[1] == player && board[2] == player) ||
               (board[3] == player && board[4] == player && board[5] == player) ||
               (board[6] == player && board[7] == player && board[8] == player) ||
               (board[0] == player && board[3] == player && board[6] == player) ||
               (board[1] == player && board[4] == player && board[7] == player) ||
               (board[2] == player && board[5] == player && board[8] == player) ||
               (board[0] == player && board[4] == player && board[8] == player) ||
               (board[2] == player && board[4] == player && board[6] == player);
    }
      public boolean isBoardFull() {
        return movesPlayed == 9;
    }
}