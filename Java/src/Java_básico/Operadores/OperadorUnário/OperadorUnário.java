package Java_básico.Operadores.OperadorUnário;
public class OperadorUnário {
   
    public static void main(String[] args) {
        int numero = 5;
        numero = - numero;
            System.out.println(numero);
            //retornando valor para positivo
        numero =  numero*-1;

    //incrementar valores
        //repetição de valores
        int numerox = 5;
        numerox = numerox + 2;
            System.out.println(numerox ++);
            System.out.println();

    //negar valores booleanos
            boolean variavel = true;
            variavel = !variavel;
                System.out.println(variavel);
    }
}
