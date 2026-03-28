public class Main {
    public static void main(String[] args) {

        Veiculo onix = new Veiculo();
        Veiculo up = new Veiculo();
        Veiculo kwid = new Veiculo();
        Veiculo v1 = new Veiculo();
        Veiculo v2 = new Veiculo();

        v1.cor = "Branco";
        v1.marca = "Ford";
        v1.modelo = "EcoSport";

        System.out.println(v1.modelo + " " + v1.marca + " " + v1.cor);

        System.out.println(v2.modelo + " " + v2.marca + " " + v2.cor);

        System.out.println(v1);
        System.out.println(v2);

        v2.marca = "Reunault";
        v2.modelo = "Kwid";
        v2.cor = "Laranja";

        System.out.println(v2.modelo + " " + v2.marca + " " + v2.cor);

        Veiculo v3 = new Veiculo();

        v3 = v1;

        System.out.println(v3.modelo + " " + v3.marca + " " + v3.cor);

        v1.modelo = "Ka";
        System.out.println(v3.modelo + " " + v3.marca + " " + v3.cor);

        String marca = "VW";
        String modelo = "Gol";
        String cor = "Laranja";

        System.out.println( v1.validaQuantidadePortas(1));
        System.out.println( v1.validaQuantidadePortas(4));

        boolean retorno = v1.validaQuantidadePortas(1);
        System.out.println(retorno);

        v1.imprimir();
    }

}