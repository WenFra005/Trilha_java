public class Operadores {

    public static void main(String[] args) {
    
    boolean condição1 = true;
    boolean condição2 = true;
        if(condição1 && condição2){
            System.out.println("As duas condições são verdadeiras");
        }
        condição2=false;
        if (condição1 && condição2) {
            System.out.println("As duas condições são verdadeiras");
        }
        else{
            System.out.println("Uma das condições é falsa");
        }
            
        if (condição1 || condição2){
            System.out.println("Uma das condições é verdadeira");
        } 
    }
}