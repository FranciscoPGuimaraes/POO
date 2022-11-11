import java.io.*;
import java.util.ArrayList;

public class Arquivo {

    //metodo para escrever
    public void escrever(Voto voto){
        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;
        String nomeAquivo = voto.getNome() + ".txt";

        try {
            os = new FileOutputStream(nomeAquivo, true); //nome onde será salvo o arquivo
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw); //variavel para escrever

            //Flag que indica onde começa as infos dos Funcionarios
            bw.write("++ VOTO ++\n");

            //Escrevendo os atributos dos filmes
            bw.write(voto.getCpf() + "\n");

        } catch (Exception e) {
            System.out.println("Erro: " + e);
        } finally {
            //fechando a entrada de dados
            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                System.out.println();
            }
        }
    }

    public ArrayList<Voto> ler(String nome, int num){
        //ArrayList que salvar filmes encontrados no arquivo
        ArrayList<Voto> encontreiNoArquivo = new ArrayList<>();

        String nomeAquivo = nome + ".txt";

        InputStream is = null;
        InputStreamReader  isr = null;
        BufferedReader br = null;

        //Flag para o while
        String linhaler;

        try {
            is = new FileInputStream(nomeAquivo); //Nome do arquivo
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr); //Variavel usada para ler

            //Colocando o cursor no inicio
            linhaler = br.readLine();
            while (linhaler != null){
                //Procuando a flag de filmes
                if (linhaler.contains("++ VOTO ++")){
                    //Filmes aux
                    String cpf = br.readLine();
                    Voto voto = new Voto(cpf, num);

                    //Adicionando filme no Array
                    encontreiNoArquivo.add(voto);
                }
                linhaler = br.readLine();
            }
        }catch (Exception e){
            System.out.println("Erro: " + e);
        }finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (Exception e) {
                System.out.println();
            }
        }

        return encontreiNoArquivo;
    }
}

