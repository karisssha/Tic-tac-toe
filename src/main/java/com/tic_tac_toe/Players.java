package com.tic_tac_toe;

import java.util.Scanner;

public class  Players {
    private Scanner scanner;
    private Board board;
    private final String purple = "\033[35m";
    private final String green = "\033[32m";
    private final String reset = "\u001B[0m";
  

    public Players(Board board) {
        this.board = board;
        this.scanner = new Scanner(System.in);

    }


    public int getPlayerMove() {
        while (true) {
            String color = (board.getCurrentPlayer() == 'X') ? green : purple;
            System.out.printf("Player "+ color + "%c" + reset + " pick a position (1-9): ", board.getCurrentPlayer());
            board.getCurrentPlayer();
    
            try { 
                int position = scanner.nextInt() - 1 ; 
                if (board.isValidMove(position)){
                    return position;
                }
                System.out.println("Invalid move, try again.");
            } catch(Exception e) { 
                System.out.println("Invalid input, please enter a number");
                scanner.nextLine();
            }
        }
    }
}