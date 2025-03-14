package com.tic_tac_toe;

import java.util.Scanner;

public class  Players {
    private Scanner scanner;
    private Board board;

    public Players(Board board) {
        this.board = board;
        this.scanner = new Scanner(System.in);

    }


    public int getPlayerMove() {
        while (true) {
            System.out.printf("Player %c, pick a position (1-9): ",
                            board.getCurrentPlayer());
    
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