public class Iphone implements ReprodutorMusical, NagevadorInternet, AparelhoTelefonico{

    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.ligar("Mãe");
        iphone.iniciarCorreioVoz();
        iphone.exibirPagina(null);
        iphone.atualizarPagina();
        iphone.selecionarMusica("Amazing Grace");
        iphone.pausar();
    }
   
    @Override
    public void ligar(String contato) {
        System.out.println("Ligando para " + contato);
    }

    @Override
    public boolean atender() {
       return true;
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando");
    }

    @Override
    public void pausar() {
        System.out.println("Pausado");
    }

    @Override
    public void selecionarMusica(String musica) {
      System.out.println("Selecione uma nova música");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página");
    }
    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova página adicionada");
    }
    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando...");
    }

   
}
