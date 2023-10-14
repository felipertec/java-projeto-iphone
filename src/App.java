public class App {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();
        System.out.println("========================  Iphone Reproduzindo musicas =====================");
        iphone.selecionarMusica("Mais uma vez - Legião Urbana");
        iphone.tocar();
        iphone.pausar();
        System.out.println("===========================================================================");

        System.out.println("========================  Iphone Reproduzindo Ligacao =====================");
        iphone.ligar(40028922);
        iphone.atender();
        iphone.iniciarCorreio("Bom Dia esse é um teste  de  voz enviado pelo meu iphone.");
        System.out.println("===========================================================================");
        
        System.out.println("========================  Iphone Simulando Navegador =====================");
        iphone.exibirPagina("www.dio.me");
        iphone.adicionarAba();
        iphone.atualizarPagina();
        System.out.println("===========================================================================");

    }
}
