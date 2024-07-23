package Java_básico.Métodos.projetinho_SmartTV;
public class Usuário {
    public static void main(String[] args) throws Exception {
       
        SmartTV smartTV = new SmartTV();

            smartTV.ligar();
                System.out.println("Novo Status -> TV Ligada? " + smartTV.ligada);
           
            smartTV.diminuirVolume();
            smartTV.diminuirVolume();
            smartTV.diminuirVolume();
            smartTV.aumentarVolume();
                System.out.println("Volume atual : " + smartTV.volume);

            System.out.println("Canal atual : " + smartTV.canal);
                smartTV.mudarCanal(13);
                    System.out.println("Canal atual : " + smartTV.canal);

            System.out.println("TV Ligada? " + smartTV.ligada);
            System.out.println("Canal atual : " + smartTV.canal);
            System.out.println("Volume atual : " + smartTV.volume);
        
            smartTV.desligar();
                System.out.println("Novo Status -> TV Ligada? " + smartTV.ligada);
    }
}
