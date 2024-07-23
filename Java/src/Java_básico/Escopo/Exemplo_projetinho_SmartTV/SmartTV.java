package Java_básico.Escopo.Exemplo_projetinho_SmartTV;
public class SmartTV {
    boolean ligada=false;
    int canal=1;
    int volume = 25;

    public void mudarCanal (int novoCanal){
        canal = novoCanal;//^^^^^^^^^^^^^^
                          //Essa variáve, por ser declarada dentro do método,
                          //não fica disponível para os outros.
    }

    public void aumentarCanal(){
        canal++;
    }

    public void dimnuirCanal(){
        canal--;
    }

    public void aumentarVolume(){
        volume++;
            System.out.println("Aumentando o volume para: " + volume);
    }

    public void diminuirVolume(){
        volume--;
            System.out.println("Diminuindo volume para:" + volume);
    }

    public void ligar(){
        ligada=true;
    }

    public void desligar(){
        ligada = false;
    }
    
}