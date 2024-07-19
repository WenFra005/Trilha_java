package exemplo;
public class Carro {
    private String chassi;
    public String getChassi() {
        return chassi;
    }
    public void ligar() {
        System.out.println("CARRO LIGANDO");
    }
    private void conferirCombustível() {
        System.out.println("Conferindo combustível");
    }
    private void conferirCambio() {
        System.out.println("Conferindo cambio em P");
    }
    public void setChassi(String string) {
    }
}