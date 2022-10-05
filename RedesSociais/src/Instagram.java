public class Instagram extends RedeSocial {
    //Construtor
    public Instagram(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    //Metodos
    @Override
    public void postarFoto() {
        System.out.println("postou uma foto no Instagram");
    }

    @Override
    public void postarVideo() {
        System.out.println("postou um video no Instagram");
    }

    @Override
    public void postarComentario() {
        System.out.println("postou um comentario no Instagram");
    }
}
