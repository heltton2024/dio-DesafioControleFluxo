import java.util.Scanner;


public class Contador {
    public static void main(String[] args) throws Exception {
        //comando para receber dois parametros
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite um Parâmetro");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite outro Parâmetro");
        int parametroDois = terminal.nextInt();

        // exceção de erro
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


    // funcao com interação for
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








