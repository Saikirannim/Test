public class Board {
    int [][] board;
    final int BOARD_SIZE = 24;


public Board(){  // constructor makess a new board
    board = new int[BOARD_SIZE][BOARD_SIZE];
}

public void displayBoard(){
    for(int i = 0; i < BOARD_SIZE; i++){
        for(int j = 0; j < BOARD_SIZE; j++){
            System.out.print(board[i][j] + " ");
        }
        System.out.println();
    }
}


}


