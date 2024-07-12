public class SistemaMedico {
    //Código com condição switch case
    
    public static void main(String[] args) {
        // 1º forma de usar switch
        String sigla = "M";

        switch(sigla){
            
            case "P" -> System.out.println("PEQUENO");
            case "M" ->  System.out.println("MÉDIO");
            case "G" -> System.out.println("GRANDE");
            default -> System.err.println("INDEFINIDO");
        }

        //2º forma de usar switch case
        switch (sigla) {
            case "P" -> {
                System.out.println("5Gb Youtube");
            }
            case "M" ->  { 
                System.out.println("Whats e Instagram grátis");
            }
            case "G" ->  {
                System.out.println("100 minutos de ligação");
                
            }
            
        }
    }
}

