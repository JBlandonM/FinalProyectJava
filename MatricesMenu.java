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

    public void printMatrix(int matrix[][]){
        System.out.println("Impresion de la Matris ingresada por el usuario");
        for (int row=0; row<4; row++){
            for (int column=0; column<4; column++){
                System.out.print(matrix[row][column]+ " ");
            }
            System.out.println("");
        } 
    }


















}
