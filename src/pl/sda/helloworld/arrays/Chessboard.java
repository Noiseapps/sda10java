package pl.sda.helloworld.arrays;

import java.util.Arrays;

public class Chessboard {


    public static void main(String[] args) {
        int N = 8;



        String[][] board;
        char letter = 'A';

        board = new String[N][N];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
//                board[j][i] = "" + (char)(letter+i) + (j+1);
                board[j][i] = (i+j) % 2 == 0 ? "B" : "W";
            }
        }
        print(board);
        System.out.println();
        System.out.println(Arrays.deepToString(board));
    }

    static void print(String [][] board) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < board.length; i++) {
            sb.append("|");
            for (int j = 0; j < board[i].length; j++) {
                sb.append(board[j][i]).append("|");
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
