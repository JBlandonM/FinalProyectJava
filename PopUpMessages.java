package finalProyectJava;
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

























}
