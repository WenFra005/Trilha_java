package OperadorRelacional;
public class OperadorRelacional {
    public static void main(String[] args) {
        
    
        int numeroY = 1;
        int numeroZ = 2;
        
        boolean simNão = numeroY == numeroZ;
            
        if (numeroZ != numeroY){
            System.out.println("A nossa condição é verdadeira");
        }
            System.out.println("numeroY é igual a numeroZ? " + simNão);
        
        simNão = numeroY != numeroZ;
    
            System.out.println("numeroY é diferente de numeroZ? " + simNão);
        
        numeroY = 3;
        simNão = numeroY > numeroZ;
            System.out.println("numeroY é maior que numeroZ? " + simNão);
    
        simNão = numeroZ < numeroY;
        System.out.println("numeroZ é menor que numeroY? " + simNão);
        
        }
}
    