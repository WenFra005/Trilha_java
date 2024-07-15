public class ForArray {
    //Comando 'for' para uma conjunto de alunos
    public static void main(String[] args) {
        String alunos [] = {"FELIPE", "JONAS","JULIA", "MARCOS"};

        for(int x=0; x < alunos.length; x++){

            System.err.println("O aluno no indice x= " + x + " é " + alunos [ x ]);
        }


    //Forma abreviada do código
    String alunosII [] = {"FELIPE", "JONAS","JULIA", "MARCOS"};
    for(String alunoII : alunosII){
        System.out.println("Nome do aluno é: " + alunoII);
    }
    }
}
