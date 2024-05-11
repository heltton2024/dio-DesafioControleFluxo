// classe da exceção customizada
public class ParametrosInvalidosException extends Exception {

    public ParametrosInvalidosException(String message){
        super("O segundo parâmetro deve ser maior que o primeiro");
    }
    
  
}
