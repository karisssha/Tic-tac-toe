public class Board {
    private static void printBoard(char[] board) {
        System.out.println();
        System.out.printf(" %s | %s | %s %n", board[0], board[1], board[2]);
        System.out.println("---+---+---");
        System.out.printf(" %s | %s | %s %n", board[3], board[4], board[5]);
        System.out.println("---+---+---");
        System.out.printf(" %s | %s | %s %n", board[6], board[7], board[8]);
        System.out.println();
    }
       
    private static boolean checkWinner(char[] board, char player) {
        return (board[0] == player && board[1] == player && board[2] == player) ||
               (board[3] == player && board[4] == player && board[5] == player) ||
               (board[6] == player && board[7] == player && board[8] == player) ||
               (board[0] == player && board[3] == player && board[6] == player) ||
               (board[1] == player && board[4] == player && board[7] == player) ||
               (board[2] == player && board[5] == player && board[8] == player) ||
               (board[0] == player && board[4] == player && board[8] == player) ||
               (board[2] == player && board[4] == player && board[6] == player);
    }
 }
 
