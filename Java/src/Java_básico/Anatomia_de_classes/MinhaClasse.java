package Java_básico.Anatomia_de_classes;

public class MinhaClasse {
    // Primeiros códigos
    public static void main(String[] args) {
            String primeiroNome = "Wendell";
            String segundoNome = "Francisco";
            String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
                System.out.print(nomeCompleto);
       
            }
    
        public static String nomeCompleto (String primeiroNome, String segundoNome) {
            return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    
        }
    
    }