package finalProyectJava;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MainFinalProyect{

    public static void main(String[] args) {
        //matrix and vector definition
        int [][]mainMatrix = new int[4][4]; int vectorV1[] = new int[4];
        JFrame window = new JFrame();
        //Llamando al subprograma welcomeMessage
        PopUpMessages MessageDialog = new PopUpMessages();
        MessageDialog.welcomeMessage();

        //call for the class Matrices Menu and create an object
        MatricesMenu matrixOne = new MatricesMenu();
        //option menu controled by do while and switch case
        int menuStatus = 1; Scanner read = new Scanner (System.in);

        do{
            //question to the use ¿what option you wants to run?
            switch(MessageDialog.showOptionMenu()){
                case 1: //fill the matris
                matrixOne.fillMatrix(mainMatrix,read);
                break;
                case 2:
                matrixOne.printMatrix(mainMatrix);
                break;
                case 3:
                int matrixTrace = matrixOne.mainDiagonalTrace(mainMatrix, vectorV1);
                System.out.println("\n- Traza de la Matris -"+matrixTrace);
                //was called the method to print the matrix trace and the main diagonal.
                break;
                case 4:
                //bubble sort
                String letterSelected = MessageDialog.rowOrColumnSelection(); //call of the Row or Column selection Window, and store the return value in a variable.
                int numberSelected = MessageDialog.rowOrColumnNumber(letterSelected); //call of the selection of Number of row or column window and store in a variable.
                matrixOne.bubbleSort(numberSelected, letterSelected, mainMatrix, vectorV1); //using the value of the 2 previous variables, like parameters in the bubble sort method.
                matrixOne.printMatrix(mainMatrix);//print the new martrix modified.
                break;
                case 5:
                letterSelected = MessageDialog.rowOrColumnSelection(); //using the method to select Row or Column, and is stored the return value.
                numberSelected = MessageDialog.rowOrColumnNumber(letterSelected); //using the method to select Number of R/C, and is stored the return value.
                matrixOne.ScalarMultiplication(letterSelected, numberSelected, mainMatrix);//Call of the method to Multiplicate a vector with a number.
                matrixOne.printMatrix(mainMatrix);
                break;
                case 6:
                menuStatus = 0;
                JOptionPane.showMessageDialog(window,"Muchas Gracias Por Usar Nuestro Sistema.");
                break;
            }
        }while(menuStatus==1);
    
        System.out.println("Fin del Algortimo");
        System.exit(0);
    }
}