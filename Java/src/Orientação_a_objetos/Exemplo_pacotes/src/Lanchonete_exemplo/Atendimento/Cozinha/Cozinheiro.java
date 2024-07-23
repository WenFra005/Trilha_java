package Lanchonete_exemplo.Atendimento.Cozinha;

import Lanchonete_exemplo.Atendimento.Atendente;

public class Cozinheiro {

    public void adicionarLancheNoBalcao(){
        System.out.println("Adicionando lanche natural hamburguer no balcao");
    }
    public void adicionarSucoNoBalcao(){
        System.out.println("Adicionando suco no balcao");
    }
    public void adicionarComboNoBalcao(){
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }
    private void prepararLanche() {
        System.out.println("Preparando lanche tipo hamburguer");
    }
    private void prepararVitamina() {
        System.out.println("Preparando suco");
    }
    private void prepararCombo() {
        prepararLanche();
        prepararVitamina();
    }
    private void selecionarIngredientesVitaminas() {
        System.out.println("Lavando ingredientes");
    }
    private void selecionarIngredientesLanche(){
        System.out.println("Selecionado pão, salada, ovo e carne");
    }
    private void lavarIngredientes(){
        System.out.println("Lavando ingredientes");
    }
    private void baterVitaminaLiquidificador() {
        System.out.println("Batendo vitamina liquidificador");
    }
    private void fritarIngredientesLanche () {
        System.out.println("Fritando a carne e ovo para o hambúrguer");
    }
    void pedirTrocarGas(Atendente meuAmigo) {
        meuAmigo.trocarGas();
    }
    void pedirIngredientes(Almoxarife almoxarife){
        almoxarife.entregarIngredientes();
    }


}
