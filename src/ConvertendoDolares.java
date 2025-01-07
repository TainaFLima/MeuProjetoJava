public class ConvertendoDolares {
    public static void main(String[] args) {
        double valorEmDolares = 50.0;
        double taxaCambio = 4.94;
        double valorEmReais = valorEmDolares * taxaCambio;
        System.out.println("O valor convertido em reais é: R$" + (int) valorEmReais);



    }
}