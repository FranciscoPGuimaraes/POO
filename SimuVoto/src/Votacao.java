import br.inatel.exeptions.CPFInvalidException;
import br.inatel.exeptions.CandidatoInvalidException;

import java.util.ArrayList;
import java.util.Scanner;

public class Votacao {
    public static void main(String[] args) throws CPFInvalidException, CandidatoInvalidException {

        //Instanciando objetos
        Scanner sc = new Scanner(System.in);
        Arquivo arquivo = new Arquivo();

        int flag = 1;
        String cpf;
        int candidato;
        Voto voto;

        System.out.println("\n-------------------------------");
        System.out.println("BEM VINDO A VOTACAO");
        System.out.println("-------------------------------\n");

        while (flag == 1){
            System.out.println("-------------------------------");
            System.out.print("Insira seu cpf: ");
            cpf = sc.nextLine();
            System.out.print("Insira seu voto: ");
            candidato = sc.nextInt();
            System.out.println("-------------------------------\n");
            if (cpf.length() != 11){
                throw new CPFInvalidException();
            }else if (candidato != 77 && candidato != 43 && candidato != 51){
                throw new CandidatoInvalidException();
            }else {
                voto = new Voto(cpf, candidato);
                arquivo.escrever(voto);
            }
            System.out.println("Deseja fazer outro voto [1] sim [0] nao: ");
            flag = sc.nextInt();
            sc.nextLine();
            System.out.println(" ");
        }

        ArrayList<Voto> votosPaulinho = arquivo.ler("Paulinho", 77);
        ArrayList<Voto> votosRogerao = arquivo.ler("Rogerao", 51);
        ArrayList<Voto> votosDarth = arquivo.ler("Darth", 43);

        System.out.println("\n-------------------------------");
        System.out.println("Resultado");
        System.out.println("-------------------------------\n");
        System.out.println("Paulinho: " + votosPaulinho.size() + " votos");
        System.out.println("Rogerao: " + votosRogerao.size() + " votos");
        System.out.println("Darth Verde: " + votosDarth.size() + " votos");
    }
}
