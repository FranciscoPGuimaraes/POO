import java.util.ArrayList;
import java.util.Collections;

public class Cofrinho {
    //Lista de moedas
    ArrayList<Moeda> moedas = new ArrayList<>();

    //Metodos
    public void addMoeda(Moeda moeda){
        moedas.add(moeda);
    }

    //Valor total dentro do cofrinho
    public double getValorTotal(){
        double valorTotal = 0;
        for (Moeda moeda:moedas) {
            valorTotal += moeda.getValor();
        }
        return valorTotal;
    }

    //Quantidade de moedas no cofrinho
    public int getQuantMoedas(){
        int valorTotal = 0;
        for (Moeda moeda:moedas) {
            valorTotal++;
        }
        return valorTotal;
    }

    //Moeda de maior valor do cofrinho
    public Moeda getMoedaMaiorValor(){
        float maiorValor = 0;
        Moeda maiorMoeda = null;
        for (Moeda moeda:moedas) {
            if(moeda.getValor() > maiorValor){
                maiorValor = moeda.getValor();
                maiorMoeda = moeda;
            }
        }
        return maiorMoeda;
    }

    //Função para ordeanar as moedas no cofrinho por menor valor
    public void ordenarMoedas(){
        Collections.sort(moedas);
    }
}
