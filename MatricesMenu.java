package finalProyectJava;
import java.util.Scanner;
public class MatricesMenu {//the object scanner is created    
    //method matrisOne is created in the class fillmatris

    public int[][] fillMatrix(int matrix[][], Scanner read){
        System.out.println("Rellenado de la Matris, indique 16 numeros enteros por favor.");
        for (int row=0; row<4; row++){
            for (int column=0; column<4; column++){
                matrix[row][column]= read.nextInt();
            }
        }
        return matrix;
    }
    //Method to print the elements of the matrix ordered per row and column.
    public void printMatrix(int matrix[][]){
        System.out.println("Impresion de la Matris ingresada por el usuario");
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
        System.out.println("- Diagonal Principal de la Matris dada -");
        for (int row=0; row<4; row++){
            for (int column=0; column<4; column++){//in those lines is printed the main diagonal and calculated the trace of the matrix.
                if (row==column){
                    System.out.print(matrix[row][column]+" ");
                    Diagonaltrace += matrix[row][column];
                }else if (row!=column){
                    System.out.print("0 ");
                }
            }
            System.out.println("\n");
        }
        return Diagonaltrace; // the value of the trace is returned to the main file, and it was called into the SOUT method.
    
    }



















}
