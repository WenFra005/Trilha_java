import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Banco banco = new Banco();

        while (true) {
            System.out.println("1. Adicionar Usuário");
            System.out.println("2. Ver todos os Usuários");
            System.out.println("3. Buscar Usuário por CPF");
            System.out.println("4. Sair");
              int opcao = scanner.nextInt();
              scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Nome: ");
                        String nome = scanner.nextLine();
                    System.out.println("CPF: ");
                        String cpf = scanner.nextLine();
                        
                    System.out.println("Endereço: ");
                        String endereco = scanner.nextLine();
                    System.out.println("Telefone: ");
                        String telefone = scanner.nextLine();
                    
                        try {
                            Usuario usuario = new Usuario(nome, cpf, endereco, telefone);
                            banco.adicionarUsuario(usuario);
                            System.out.println("Usuário adicionado com sucesso!");
                        } catch (IllegalArgumentException e) {
                            System.out.println("Erro ao adicionar usuário: " + e.getMessage());
                        }
                        break;

                case 2:
                    System.out.println("Lista de Usuários:");
                    for (Usuario u : banco.getUsuarios()) {
                        System.out.println(u);
                    }
                    break;
                
                case 3:
                    System.out.println("CPF: ");
                    String cpfBusca = scanner.nextLine();
                    Usuario usuarioEncontrado = banco.buscarUsuarioPorCpf(cpfBusca);
                    if (usuarioEncontrado != null) {
                        System.out.println("Usuário encontrado: " + usuarioEncontrado);
                    } else {
                        System.out.println("Usuario não encontrado.");
                    }
                    break;
                case 4: 
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");    
            }
        }
    }
}

