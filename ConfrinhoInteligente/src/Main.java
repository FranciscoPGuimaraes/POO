public class Main {
    public static void main(String[] args) {
        //Criando cofrinho
        Cofrinho cofrinho = new Cofrinho();

        //Criando moeda
        Moeda moeda = new Moeda(2);
        Moeda moeda1 = new Moeda(4);
        Moeda moeda2 = new Moeda(5);
        Moeda moeda3 = new Moeda(6);
        Moeda moeda4 = new Moeda(10);

        //Adicionando moedas no cofrinho
        cofrinho.addMoeda(moeda4);
        cofrinho.addMoeda(moeda2);
        cofrinho.addMoeda(moeda3);
        cofrinho.addMoeda(moeda);
        cofrinho.addMoeda(moeda1);

        //Mostrando cofrinho
        System.out.println("---- COFRINHO ----");
        for (int i = 0; i < cofrinho.moedas.size(); i++) {
            System.out.println((i+1) + " - R$" + cofrinho.moedas.get(i).getValor());
        }
        System.out.println(" ");

        //Dados do cofrinho
        System.out.println("Valor total do cofrinho: R$" + cofrinho.getValorTotal());
        System.out.println("Moeda de maior valor: R$" + cofrinho.getMoedaMaiorValor().getValor());
        System.out.println("Quantidade de moedas: " + cofrinho.getQuantMoedas());
        System.out.println(" ");

        //Ordenando o cofrinho por valor
        cofrinho.ordenarMoedas();

        //Mostrando cofrinho ordenado
        System.out.println("Cofrinho Ordenado: ");
        for (int i = 0; i < cofrinho.moedas.size(); i++) {
            System.out.println((i+1) + " - R$" + cofrinho.moedas.get(i).getValor());
        }
    }
}
