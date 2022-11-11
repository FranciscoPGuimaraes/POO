public class Voto {
    //Atributos
    private String cpf;
    private int candidato;
    private String nome;

    //Construtor
    public Voto(String cpf, int candidato) {
        this.cpf = cpf;
        this.candidato = candidato;
        if (candidato == 77){
            this.nome = "Paulinho";
        }else if (candidato == 51){
            this.nome = "Rogerao";
        }else if (candidato == 43){
            this.nome = "Darth";
        }
    }

    //Getters
    public String getCpf() {
        return cpf;
    }

    public int getCandidato() {
        return candidato;
    }

    public String getNome() {
        return nome;
    }
}
