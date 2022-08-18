package finalProyectJava;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.*;
import javax.swing.JOptionPane;
public class MatricesMenu {  
    //method matrisMenu class is created, and the methods, fillMatrix, printMatrix, mainDiagonalTrace, BubbleSort,

    public int[][] fillMatrix(int matrix[][], Scanner read){
        System.out.println("\nRellenado de Matris, Indique 16 Números Enteros, Por Favor.");
        for (int row=0; row<4; row++){
            for (int column=0; column<4; column++){
                matrix[row][column]= read.nextInt();
            }
        }
        return matrix;
    }
    //Method to print the elements of the matrix ordered per row and column.
    public void printMatrix(int matrix[][]){
        System.out.println("\n - Impresion De La Matris -");
        for (int row=0; row<4; row++){
            for (int column=0; column<4; column++){
                System.out.print(matrix[row][column]+ " ");
            }
            System.out.println("");
        } 
    }
    //calculate of the main diagonal of the matrix, those numbers are stored in a new vector called vectorV1.
        public int mainDiagonalTrace(int matrix[][], int vector[]){
        int Diagonaltrace = 0;
        System.out.println("\n- Diagonal Principal de la Matris -");
        for (int row=0; row<4; row++){
            for (int column=0; column<4; column++){//in those lines is printed the main diagonal and calculated the trace of the matrix.
                if (row==column){
                    System.out.print(matrix[row][column]+" ");
                    Diagonaltrace += matrix[row][column];
                }else if (row!=column){
                    System.out.print("0 ");
                }
            }
            System.out.println("");
        }
        return Diagonaltrace; // the value of the trace is returned to the main file, and it was called into the SOUT method-
    }
    public void bubbleSort(int numberSelected, String letterSelected, int matrix[][], int vector[]){
        //in this lines are used the number selected of the type of vector selected, Row or Column.
        numberSelected= numberSelected-1;
        for(int element=0; element<4;element++){
            if(letterSelected.equals("Fila")){
                vector[element]= matrix[numberSelected][element];
            }else if(letterSelected.equals("Columna")){
                vector[element]= matrix[element][numberSelected];
            }
        }
        //System.out.println("\nVector copiado: "+Arrays.toString(vector));

        //here is the real bubble sort.
        for(int j=0; j<3;j++){
            for(int i=0; i<3;i++){
                int auxNumber=0;
                if (vector[i]>vector[i+1]){
                    auxNumber = vector[i];
                    vector[i]=vector[i+1];
                    vector[i+1]=auxNumber;
                }
            }
        }
        //System.out.println("\nVector Ordenado "+Arrays.toString(vector));

        //in this lines, the sorted vector is exchanged in the matrix.
        for(int row=0;row<4;row++){
            for(int column=0; column<4;column++){
            if(letterSelected.equals("Fila")){
                matrix[numberSelected][column]=vector[column];
            }else if(letterSelected.equals("Columna")){
                matrix[column][numberSelected]= vector[column];
            }
          }
        }
    }
    
    public void ScalarMultiplication(String letterSelected,int numberSelected,int matrix[][]){
        numberSelected = numberSelected-1;
        int ScalarNumber = Integer.parseInt(JOptionPane.showInputDialog("Por Cual Número Desea Mutiplicar La "+letterSelected+" ?" ));
        for(int element=0; element<4;element++){
            if(letterSelected.equals("Fila")){
                matrix[numberSelected][element]= (matrix[numberSelected][element])*ScalarNumber ;
            }else if(letterSelected.equals("Columna")){
                matrix[element][numberSelected] = (matrix[element][numberSelected])*ScalarNumber ;
            }
        }
    }

    















}
