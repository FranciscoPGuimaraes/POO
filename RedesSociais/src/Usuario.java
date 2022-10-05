public class Usuario {
    private String nome;
    private String email;
    public  RedeSocial[] redesSociais;

    public Usuario(String nome, String email, RedeSocial[] redesSociais) {
        this.nome = nome;
        this.email = email;
        this.redesSociais = redesSociais;
    }

}
