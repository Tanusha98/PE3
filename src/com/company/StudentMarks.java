package com.company;
import java.util.*;

public class StudentMarks {
    Scanner scanner=new Scanner(System.in);

    public int numOfStudents;
    public Integer[] stuGrades;

    public StudentMarks(){
        System.out.println("Enter number of students: ");
        numOfStudents = scanner.nextInt();
        stuGrades=new Integer[numOfStudents];
        checkGrades();
    }
    public void checkGrades(){
        System.out.println("Enter student grades: ");
        for (int increment = 0; increment <numOfStudents ; increment++) {
            stuGrades[increment]=scanner.nextInt();
            try{
                if(stuGrades[increment]>100 ||stuGrades[increment]<0)
                    throw new GradeOutOfLimits();
            }
            catch (GradeOutOfLimits gradeOutOfLimits){
                gradeOutOfLimits.print();
                increment--;
            }
        }
    }
    public static void main(String args[]){
        StudentMarks studentMarks=new StudentMarks();
        for (int increment = 0; increment <studentMarks.numOfStudents ; increment++)
            System.out.print(studentMarks.stuGrades[increment]+" ");
    }
}
