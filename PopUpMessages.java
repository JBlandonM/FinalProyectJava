package finalProyectJava;
import java.util.Arrays;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class PopUpMessages {
    JFrame window = new JFrame();
    
    //welcome message
    public void welcomeMessage(){
        JOptionPane.showMessageDialog(window,
        "Universidad Católica de Costa Rica \n" +
        "Proyecto de Programación 1 \n" +
        "Jonathan A. Blandón Machado \n" +
        "Brayan Araya Rojas \n" +
        "Agosto 2022.");
    }

    public int showOptionMenu(){
        int optionSelected =Integer.parseInt(JOptionPane.showInputDialog(
            "1: Carga la matriz \n" +
            "2: Imprime la matriz \n" +
            "3: Traza de la matriz \n" +
            "4: Ordenamiento por burbuja \n" +
            "a) Fila \n" +
            "b) Columna \n" +
            "5: Multiplicación por un escalar \n" +
            "a) Fila \n" +
            "b) Columna \n" +
            "6: Salir \n" +
            "¿Cual opcion desea realizar?"));
        return optionSelected;
    }
    public String rowOrColumnSelection(){
        int status= 1;
        //do {
            //here is the question to the user, ¿what do wants to sort, Row or Colum?
            String letterSelection = JOptionPane.showInputDialog("Digite Que Desea Modificar, 'F'= Fila | 'C'= Columna.");
            //if the user select Ff change that string to "Fila", and Cc to "Columna"
            if(letterSelection.equals("F") || letterSelection.equals("f")){
                letterSelection = "Fila";
                status=0;
            }else if(letterSelection.equals("C") || letterSelection.equals("c")){
                letterSelection = "Columna";
                status=0;
            }else{
                System.out.println("Digite un Valor Valido.");
            }        
            return letterSelection;
        //}while(status==1);
    }
    public int rowOrColumnNumber(String letterSelection){
        //in this section is the Question of the ¿number? of Row or Column the user wants to sort
        int finalSelection= Integer.parseInt(JOptionPane.showInputDialog("Digite Una "+letterSelection+" Que Desea Modificar "+" [1-4]"));
        return finalSelection;
    }

























}
