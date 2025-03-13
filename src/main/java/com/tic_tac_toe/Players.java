package main.java.com.tic_tac_toe;

import java.util.Scanner;

public class  Players {
    private Scanner scanner;
    private Board board;

    public Players(Board board) {
        this.board = board;
        this scanner = new Scanner(System.in);

    }


    public int getPlayerMove(){
        while (true) {
            System.out.printf("Juagdor %c, elige una posición (1-9): ",
                board.getCurrentPlayer());
    
            try{ int position = scanner.nextInt() - 1 ; 
                if (board.isValidMove(position)){
                    return position;
                }System.out.println("Movimiento inválido, intenta de nuevo.");
            } catch(Exception e){
                System.out.println("Entrada invalida, por favor ingresa un numero");
                scanner.nextLine();
            }
        }
    }

    public void switchPlayer(){
        board.switchPlayer(); 
    }
}