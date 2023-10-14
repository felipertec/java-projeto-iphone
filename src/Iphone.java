public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

    @Override
    public void tocar() {
        System.out.println("Iniciando musica...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando musica: " + musica);
    }

    @Override
    public void exibirPagina(String pagina) {
        System.out.println("Acessando: " + pagina);
    }

    @Override
    public void adicionarAba() {
        System.out.println("Abrindo uma nova Aba no navegador...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("A pagina esta sendo atualizada...");
    }

    @Override
    public void ligar(int numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo o telefone...");
    }

    @Override
    public void iniciarCorreio(String msg) {
        System.out.println("Enviado mensagem de voz: " + msg);
    }
    
}
