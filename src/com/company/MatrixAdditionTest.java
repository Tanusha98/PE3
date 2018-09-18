package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixAdditionTest {
    MatrixAddition matrixAddition;
    Integer[][] sum;
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
        matrixAddition=null;
    }
    @Test
    public void matrixadd(){
        sum=new Integer[][]{ {3,5},{4,6} };
        matrixAddition=new MatrixAddition(2,2,new Integer[][] {{1,2},{3,4}},new Integer[][] {{2,3},{1,2}});
        assertArrayEquals(sum,matrixAddition.addMatrix());
    }
}