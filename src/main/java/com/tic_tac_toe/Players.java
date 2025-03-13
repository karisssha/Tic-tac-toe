public class Players {
    
    char currentPlayer = 'X';

    while (movesPlayed < 9) {
        printBoard(board); 
        System.out.printf("Juagdor %c, elige una posición (1-9): ", currentPlayer);

        int position = scanner.nextInt() - 1;

        if(position < 0 || position >= 9 || board[position] == "X" || board[position] == "O"){
            System.out.println(null "Movimiento inválido, intenta de nuevo.");
        
            board[position] = currentPlayer;
        }else if(checkWinner(board, currentPlayer)){
            printBoard(board); 
            System.out.println(null "Jugador " + currentPlayer + "gana! Felicidades!!");

            movesPlayed++;
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }else if(movesPlayed == 9){
            printBoard(board);
            System.out.println(null"Empate!");
        };
}
}