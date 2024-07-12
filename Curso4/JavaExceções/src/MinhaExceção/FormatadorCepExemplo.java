package MinhaExceção;
public class FormatadorCepExemplo {

    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("237650645");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.err.println("O cep não corresponde com as regras de negócio");;
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if (cep.length() != 8)
            throw new CepInvalidoException();
        
        // Simulando um cep formatado
        return "23.765.-064";
            
        }
    }