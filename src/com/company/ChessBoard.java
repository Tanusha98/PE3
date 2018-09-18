package com.company;

public class ChessBoard {
    public void printChessBoard(){
        for (int increment = 0; increment < 8; increment++) {
            for (int increment2 = 0; increment2 < 8; increment2++) {
                if((increment+increment2)%2==0)
                    System.out.print("WW|");
                else
                    System.out.print("BB|");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        ChessBoard chessBoard=new ChessBoard();
        chessBoard.printChessBoard();
    }
}
