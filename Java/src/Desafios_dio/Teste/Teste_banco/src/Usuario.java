/**
 * Classe que representa um usuário do banco.
 */
public class Usuario {
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;

    /**
     * Construtor para inicializar os atributos do usuário.
     * @param nome Nome do usuário
     * @param cpf CPF do usuário
     * @param endereco Endereço do usuário
     * @param telefone Telefone do usuário
     */
    public Usuario(String nome, String cpf, String endereco, String telefone) {
        this.nome = nome;
        this.cpf = formatarCpf(cpf);
        this.endereco = endereco;
        this.telefone = formatarTelefone(telefone);
    }

    // Métodos getters para acessar os atributos do usuário

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    /**
     * Método toString para representar o usuário como uma string.
     * @return Representação em string dos dados do usuário
     */
    @Override
    public String toString() {
        return "Nome: " + nome + ", CPF: " + cpf + ", Endereço: " + endereco + ", Telefone: " + telefone;
    }

    /**
     * Método para formatar o CPF.
     * @param cpf CPF não formatado
     * @return CPF formatado no padrão XXX.XXX.XXX-XX
     */
    private String formatarCpf(String cpf) {
        if (cpf == null || cpf.length() != 11) {
            throw new IllegalArgumentException("CPF inválido. Deve conter 11 dígitos.");
        }
        return cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-" + cpf.substring(9, 11);
    }

    private String formatarTelefone(String telefone) {
        if (telefone == null || telefone.length() != 11) {
            throw new IllegalArgumentException("Telefone inválido. Deve conter 11 dígitos.");
        }
        return telefone.substring(0, 0) + "(" + telefone.substring(0, 2) + ")" + telefone.substring(2, 7) + "-" + telefone.substring(7, 11); 
    }
}
