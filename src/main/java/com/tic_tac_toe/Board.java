package com.tic_tac_toe;

public class Board {
    private char[] board;
    private int movesPlayed;
    private char currentPlayer;
    private final String purple = "\033[35m";
    private final String green = "\033[32m";
    private final String reset = "\u001B[0m";
    

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
        System.out.printf(" %s | %s | %s %n", formatSymbol(board[0]), formatSymbol(board[1]), formatSymbol(board[2]));
        System.out.println("---+---+---");
        System.out.printf(" %s | %s | %s %n", formatSymbol(board[3]), formatSymbol(board[4]), formatSymbol(board[5]));
        System.out.println("---+---+---");
        System.out.printf(" %s | %s | %s %n", formatSymbol(board[6]), formatSymbol(board[7]), formatSymbol(board[8]));
        System.out.println();
    }

    private String formatSymbol(char symbol) {
        if (symbol == 'X') {
            return green + symbol + reset;
        } else if (symbol == 'O') {
            return purple + symbol + reset;
        }
        return String.valueOf(symbol);
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