package finalProyectJava;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.*;
import javax.swing.JOptionPane;
//method matrisMenu class is created, and the methods, fillMatrix, printMatrix, mainDiagonalTrace, BubbleSort and ScalarMultiplication.
public class MatricesMenu { 
    //the method fill matrix receive the paramer of a empty matrix, and fill that, with the numbers givens of the user.
    public int[][] fillMatrix(int matrix[][], Scanner read){
        System.out.println("\n-Rellenado de Matris, Indique 16 Números Enteros, Por Favor-");
        for (int row=0; row<4; row++){
            for (int column=0; column<4; column++){
                System.out.print("Fila["+(row+1)+"] Columna["+(column+1)+"]: ");
                matrix[row][column]= read.nextInt();
            }
            System.out.println("");
        }
        return matrix;
    }
    //Method to print the elements of a matrix ordered per row and column.
    public void printMatrix(int matrix[][]){
        System.out.println("\n---Impresion De La Matris---");
        for (int row=0; row<4; row++){
            for (int column=0; column<4; column++){
                System.out.print(matrix[row][column]+ " ");
            }
            System.out.println("");
        } 
    }
    //Method to show the main diagonal of the matrix. and calculate the value of the matrix trace.
        public int mainDiagonalTrace(int matrix[][], int vector[]){
        int Diagonaltrace = 0;
        System.out.println("\n---Diagonal Principal de la Matris---");
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
        return Diagonaltrace; // the value of the trace is returned to the main file.
    }
    //method thet receive the parameters of, what Column or row?, the user wants to sort.
    public void bubbleSort(int numberSelected, String letterSelected, int matrix[][], int vector[]){
        //in this lines are used the number selected of the type of vector selected, been Row or Column.
        numberSelected= numberSelected-1;//the user only can use 1,2,3,4, then the number selected is reduced by 1.
        for(int element=0; element<4;element++){
            if(letterSelected.equals("Fila")){ //if the user selectes Ff, that is the same of "Fila"
                vector[element]= matrix[numberSelected][element];
            }else if(letterSelected.equals("Columna")){//if the user selects Cc, that is the same of "Columna"
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
            if(letterSelected.equals("Fila")){//if the user selects Fila, then the loop runs through the columns in the selected Row.
                matrix[numberSelected][column]=vector[column];
            }else if(letterSelected.equals("Columna")){//else if is Columna, the loop runs through the rows in the colmun selected.
                matrix[column][numberSelected]= vector[column];
            }
          }
        }
    }
    //this method is used to multiplicate a row or column vector by an scalar number given by the user.
    public void ScalarMultiplication(String letterSelected,int numberSelected,int matrix[][]){
        //the parameters used are the Row or Column selection, and the number of R/C those selection.
        numberSelected = numberSelected-1;
        int ScalarNumber = Integer.parseInt(JOptionPane.showInputDialog("Por Cual Número Desea Mutiplicar La "+letterSelected+" ?" ));
        //on this lines, if the user choosed  "Fila" option, the for loop runs through the columns in the row choosed. 
        //else if, if the user choosed  "Columna" option, the for loop runs throug the rows in the column choosed.
        for(int element=0; element<4;element++){
            if(letterSelected.equals("Fila")){
                matrix[numberSelected][element]= (matrix[numberSelected][element])*ScalarNumber ;
            }else if(letterSelected.equals("Columna")){
                matrix[element][numberSelected] = (matrix[element][numberSelected])*ScalarNumber ;
            }
        }
    }
}
