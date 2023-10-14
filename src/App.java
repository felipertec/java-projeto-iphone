public class App {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();
        System.out.println("========================  Iphone Reproduzindo musicas =====================");
        iphone.selecionarMusica("Mais uma vez - Legião Urbana"); //Só adicionar o nome da musica no parametro.
        iphone.tocar();
        iphone.pausar();
        System.out.println("===========================================================================");

        System.out.println("========================  Iphone Reproduzindo Ligacao =====================");
        iphone.ligar(40028922); // inserir numeros para realizar a ligação, porem nao pode ser do tipo texto, nesse casso inserir sem as "".
        iphone.atender();
        iphone.iniciarCorreio("Bom Dia esse é um teste  de  voz enviado pelo meu iphone."); // inserir a mensagem de texto simulando audio.
        System.out.println("===========================================================================");
        
        System.out.println("========================  Iphone Simulando Navegador =====================");
        iphone.exibirPagina("www.dio.me"); // Inserir um site para aparecer na aplicação.
        iphone.adicionarAba();
        iphone.atualizarPagina();
        System.out.println("===========================================================================");

    }
}
