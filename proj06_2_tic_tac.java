package project;


import java.util.Random;
import java.util.Scanner;

class TicTacToe {
    private final String[][] board = new String[3][3];

    public String[][] getBoard() {
        return board;
    }

    private static void runGame(String[][] board) {
        //to randomize who goes first
        Random random = new Random();
        int turn = random.nextInt(2);
        //display the board to the user
        printCurrentBoard(board);
        String winner = "";
        while (!isBoardFull(board)) {
            int[] coordinates = getUserInput(board, turn++);
            int row = coordinates[0];
            int col = coordinates[1];
            board[row][col] = (turn % 2 == 0) ? "X" : "O";
            if (winStatus(board, row, col) == true) {
                System.out.println(board[row][col] + " has won the game");
                break;
            }
            printCurrentBoard(board);
        }
    }

    public static void initializeGame(String[][] board) {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col] = "";
            }
        }
        runGame(board);
    }

    private static void printCurrentBoard(String[][] board) {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(board[row][col] + " | ");
            }
            System.out.println();
            System.out.print(" --- --- ");
            System.out.println();
        }
    }

    private static int[] getUserInput(String[][] board, int turn) {
        String ticortac;
        if (turn % 2 == 0) {
            ticortac = "O";
        } else {
            ticortac = "X";
        }
        int[] coordinates = new int[2];
        while (true) {
            System.out.println("Enter row number for " + ticortac);
            Scanner sc = new Scanner(System.in);
            int row = sc.nextInt();
            System.out.println("Enter column number for " + ticortac);
            int col = sc.nextInt();
            if (!cellAlreadyOccupied(row, col, board)) {
                coordinates[0] = row;
                coordinates[1] = col;
                return coordinates;
            }
            System.out.println("Cell already occupied");
        }
    }

    private static boolean cellAlreadyOccupied(int row, int col, String[][] board) {
        return board[row][col].equals("X") || board[row][col].equals("O");
    }


    private static boolean checkRow(String[][] board, int row, int col) {
        String ticortac = board[row][col];
        for (int i = col - 1; i >= 0; i--) {
            if (!board[row][i].equals(ticortac)) {
                return false;
            }
        }

        for (int i = col + 1; i < 3; i++) {
            if (!board[row][i].equals(ticortac)) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkCol(String[][] board, int row, int col) {
        String ticortac = board[row][col];

        for (int i = row - 1; i >= 0; i--) {
            if (!board[i][col].equals(ticortac)) {
                return false;
            }
        }

        for (int i = row + 1; i < 3; i++) {
            if (!board[i][col].equals(ticortac)) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkDiagonal(String[][] board, int row, int col) {
        String ticortac = board[row][col];
        if (Math.abs(row - col) == 2) {

            //Top-Right Diagonal
            for (int i = row - 1, j = col + 1; i >= 0 && j < 3; i--, j++) {
                if (!board[i][j].equals(ticortac)) {
                    return false;
                }
            }

            //Bottom-Left Diagonal
            for (int i = row + 1, j = col - 1; i < 3 && j >= 0; i++, j--) {
                if (!board[i][j].equals(ticortac)) {
                    return false;
                }
            }
            return true;
        } else if (row == col && row != 1) {
            //Top-Left Diagonal
            for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
                if (!board[i][j].equals(ticortac)) {
                    return false;
                }
            }

            //Bottom-Right Diagonal
            for (int i = row + 1, j = col + 1; i < 3 && j < 3; i++, j++) {
                if (!board[i][j].equals(ticortac)) {
                    return false;
                }
            }
            return true;
        }
        boolean topRight = true, bottomRight = true, topLeft = true, bottomLeft = true;
        //Top-Right Diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < 3; i--, j++) {
            if (!board[i][j].equals(ticortac)) {
                topRight = false;
                break;
            }
        }

        //Bottom-Right Diagonal
        for (int i = row + 1, j = col + 1; i < 3 && j < 3; i++, j++) {
            if (!board[i][j].equals(ticortac)) {
                bottomRight = false;
                break;
            }
        }

        //Top-Left Diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (!board[i][j].equals(ticortac)) {
                topLeft = false;
                break;
            }
        }

        //Bottom-Left Diagonal
        for (int i = row + 1, j = col - 1; i < 3 && j >= 0; i++, j--) {
            if (!board[i][j].equals(ticortac)) {
                bottomLeft = false;
                break;
            }
        }
        return (topLeft && bottomRight) || (topRight && bottomLeft);
    }

    private static boolean winStatus(String[][] board, int row, int col) {
        if (Math.abs(row - col) == 2 || row == col)
            return checkRow(board, row, col) || checkCol(board, row, col) || checkDiagonal(board, row, col);
        else
            return checkRow(board, row, col) || checkCol(board, row, col);
    }

    private static boolean isBoardFull(String[][] board) {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (board[row][col].equals("")) {
                    return false;
                }
            }
        }
        return true;
    }
}

public class proj06_2_tic_tac {
    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe();
        TicTacToe.initializeGame(ticTacToe.getBoard());
    }
}
