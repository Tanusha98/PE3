package com.company;

public class MatrixAddition {
    private int noOfRows;
    private int noOfCols;
    private Integer[][] matrix1;
    private Integer[][] matrix2;
    public MatrixAddition(int noOfRows,int noOfCols,Integer[][] matrix1,Integer[][] matrix2){
        this.noOfCols=noOfCols;
        this.noOfRows=noOfRows;
        this.matrix1=matrix1;
        this.matrix2=matrix2;
    }
    public Integer[][] addMatrix(){
        for (int increment = 0; increment <noOfRows ; increment++) {
            for (int increment2 = 0; increment2 < noOfCols; increment2++) {
                matrix1[increment][increment2]+=matrix2[increment][increment2];
            }
        }
        return matrix1;
    }
}
