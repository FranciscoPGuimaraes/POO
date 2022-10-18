public class Moeda implements Comparable<Moeda>{
    //Atributos
    private float valor;

    //Construtor
    public Moeda(float valor) {
        this.valor = valor;
    }

    //Getters
    public float getValor() {
        return valor;
    }

    @Override
    public int compareTo(Moeda o) {
        if (this.valor > o.getValor()){
            return 1;
        }else if (this.valor < o.getValor()){
            return -1;
        }
        return 0;
    }
}
