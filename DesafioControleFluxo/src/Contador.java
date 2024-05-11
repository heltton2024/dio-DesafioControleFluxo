import java.util.Scanner;


public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite um numero");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite outro numero");
        int parametroDois = terminal.nextInt();

        try {

            System.out.println("******* Controle de Fluxo *****************");

            contar(parametroUm, parametroDois);

            System.out.println("*******************************************");
            
            
        }
        catch(ParametrosInvalidosException Exception ){

           
            System.out.println( Exception.getMessage());

            System.out.println("*******************************************");
        }
        

        
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{

        if(parametroUm < parametroDois){

            int contador = parametroDois - parametroUm;

            for (int i = 1; i <= contador;i++) {
                System.out.println(i);  
              }
        }
        else{
            throw new ParametrosInvalidosException("");
        }
  
    }


}








