package finalProyectJava;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

//this class is implement the methods to show diferents messages un pop-up windows.
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
    //method to show all the posible option that the user can do.
    public int showOptionMenu(){
        int optionSelected =Integer.parseInt(JOptionPane.showInputDialog(
            "1: Carga la matriz \n" +
            "2: Imprime la matriz \n" +
            "3: Traza de la matriz \n" +
            "4: Ordenamiento por burbuja \n" +
            "5: Multiplicación por un escalar \n" +
            "6: Salir \n" +
            "¿Cual opcion desea realizar?"));
        return optionSelected;
    }
    //Pop up window that receive the answer, of what the user wants to modify, been row or column.
    public String rowOrColumnSelection(){
        int status= 1;
        String letterSelection= "";
        do{
            //here is the question to the user, ¿what do wants to modify, Row or Colum?
            letterSelection = JOptionPane.showInputDialog("Digite Que Desea Modificar, 'F'= Fila | 'C'= Columna.");
            //if the user select "F" or "f", that char is changed to the string "Fila", and "C" or "c" to "Columna"
            if(letterSelection.equals("F") || letterSelection.equals("f")){
                letterSelection = "Fila";
                status=0;
            }else if(letterSelection.equals("C") || letterSelection.equals("c")){
                letterSelection = "Columna";
                status=0;
            }else{
                System.out.println(
                "--------------------------------------\n"+
                "- Digite Un Caracter Válido, Ff | Cc -\n"+
                "--------------------------------------");
                JOptionPane.showMessageDialog(window, " Digite Un Caracter Válido, [Ff | Cc] ");
            }
        }while(status==1);
        return letterSelection;      
    }
    //method to do the question of what R/C number wants to be modified and receive the reply.
    public int rowOrColumnNumber(String letterSelection){
        //in this section is the Question of the ¿number? of Row or Column the user wants to sort
        int finalSelection=0;
        int status=1;
        do{
            finalSelection= Integer.parseInt(JOptionPane.showInputDialog("Digite Una "+letterSelection+" Que Desea Modificar "+" [1-4]"));
            if(finalSelection>=1 && finalSelection<=4){
                status=0;
            }else{
                System.out.println(                                
                "------------------------------------\n"+
                "- Digite Una "+ letterSelection+" Válida, [1-4] -\n"+
                "------------------------------------");
                JOptionPane.showMessageDialog(window, " Digite Una "+ letterSelection+" Válida, [1-4] ");

            }
        }while(status==1);
            return finalSelection;
    }

























}
