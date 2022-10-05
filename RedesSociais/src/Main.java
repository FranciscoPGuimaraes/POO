public class Main {
    public static void main(String[] args) {
        //Criando redes sociais
        RedeSocial[] redeSociais = new RedeSocial[4];
        redeSociais[0] = new Facebook("131321", 23);
        redeSociais[1] = new Instagram("12312", 45);

        //Criando o usuario
        Usuario usuario = new Usuario("Francisco", "francisco@gmail.com", redeSociais);

        Facebook rede1 = ((Facebook)usuario.redesSociais[0]);
        Instagram rede2 = ((Instagram) usuario.redesSociais[1]);

        rede1.postarFoto();
        rede1.fazStreaming();
        rede1.compartilhar();

        rede2.postarComentario();
        rede2.postarVideo();
        rede2.curtirPublicacao();
    }
}
