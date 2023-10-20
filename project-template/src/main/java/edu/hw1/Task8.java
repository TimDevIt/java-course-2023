package edu.hw1;


public final class Task8 {
    private static final int[] OFFSET_X_ARRAY = {-1, -1, -2, -2, 1, 1, 2, 2};
    private static final int[] OFFSET_Y_ARRAY = {-2, 2, -1, 1, -2, 2, -1, 1};
    private static final int BOARD_SIZE = 8;
    private static final int OFFSET_COUNT = 8;

    private Task8() {}

    public static boolean knightBoardCapture(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) {
                    for (int k = 0; k < OFFSET_COUNT; k++) {
                        int positionX = j + OFFSET_X_ARRAY[k];
                        int positionY = i + OFFSET_Y_ARRAY[k];
                        if (isValidPosition(positionX, positionY) && board[positionX][positionY] == 1) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    private static boolean isValidPosition(int positionX, int positionY) {
        return positionX >= 0 && positionX < BOARD_SIZE && positionY >= 0 && positionY < BOARD_SIZE;
    }
}
