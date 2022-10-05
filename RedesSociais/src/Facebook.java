public class Facebook extends RedeSocial implements VideoConferencia, Compartilhamento{
    //Construtor
    public Facebook(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    //Metodos
    @Override
    public void postarFoto() {
        System.out.println("postou uma foto no Facebook");
    }

    @Override
    public void postarVideo() {
        System.out.println("postou um video no Facebook");
    }

    @Override
    public void postarComentario() {
        System.out.println("postou um comentario no Facebook");
    }

    @Override
    public void compartilhar() {
        System.out.println("compartilhou uma publicacao no facebook");
    }

    @Override
    public void fazStreaming() {
        System.out.println("realizou uma stream no facebook");
    }
}
