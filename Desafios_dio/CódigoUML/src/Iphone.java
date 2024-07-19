public class Iphone implements NavegadorInternet, Telefone, TocadorMusica{
    
    @Override
    public void abrirPagina(String URL) {
        // TODO Auto-generated method stub
        System.out.println("ABRIR" + URL);
    }

    @Override
    public void adicionarAba() {
        // TODO Auto-generated method stub
    System.out.println("Aba adicionada");    
    }

    @Override
    public void recarregarPagina() {
        // TODO Auto-generated method stub
        System.out.println("PAGINA RECARREGADA");
    }

    @Override
    public void correioVoz() {
        // TODO Auto-generated method stub
        System.out.println("CORREIO DE VOZ ENVIADO");
    }

    @Override
    public void fazerChamada() {
        System.out.println("Fazendo ligação para ");
        // TODO Auto-generated method stub
        
    }

    @Override
    public void receberChamada() {
        System.out.println("Recebendo ligação de ");
        // TODO Auto-generated method stub
        
    }

    @Override
    public void pausarMusica() {
        System.out.println("MUSICA PAUSADA");
        // TODO Auto-generated method stub   
    }

    @Override
    public void selecionarMusica(String Musica) {
        System.out.println(Musica + "SELECIONADA");
        // TODO Auto-generated method stub
        
    }

    @Override
    public void tocarMusica() {
        System.out.println("TOCANDO MUSICA");
        // TODO Auto-generated method stub
        
    }

    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();
        
        meuIphone.abrirPagina("www.exemplo.com");
        meuIphone.adicionarAba();
        meuIphone.recarregarPagina();
        meuIphone.correioVoz();
        meuIphone.fazerChamada();
        meuIphone.receberChamada();
        meuIphone.pausarMusica();
        meuIphone.selecionarMusica("musica exemplo");;
        meuIphone.tocarMusica();
            
        };
        
    }
