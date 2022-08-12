package finalProyectJava;

public class MainFinalProyect{

    public static void main(String[] args) {
        //matrix and vector definition
        int [][]matris = new int[4][4]; int vectorV1[] = new int[4];
        //Llamando al subprograma welcomeMessage
        SubPrograms MessageDialog = new SubPrograms();
        MessageDialog.welcomeMessage();

        //option menu controled by do while and switch case
        int menuStatus = 1;
        do{
            switch(){
                case 1:
                break;

                case 2:
                break;

                case 3:
                break;

                case 4:
                break;

                case 5:
                break;
                case 6:
                menuStatus = 0;
                break;

            }


        }while(menuStatus==1);
    
        System.out.println("Fin del Algortimo");
        System.exit(0);
    }
}