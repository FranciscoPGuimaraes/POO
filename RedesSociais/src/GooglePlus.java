public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento{
    //Construtor
    public GooglePlus(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    //Metodos
    @Override
    public void postarFoto() {
        System.out.println("postou uma foto no GooglePlus");
    }

    @Override
    public void postarVideo() {
        System.out.println("postou um video no GooglePlus");
    }

    @Override
    public void postarComentario() {
        System.out.println("postou um comentario no GooglePlus");
    }

    @Override
    public void compartilhar() {
        System.out.println("compartilhou uma publicacao no GooglePlus");
    }

    @Override
    public void fazStreaming() {
        System.out.println("realizou uma stream no GooglePlus");
    }
}
