public class ProdutoDesconto {
    public static void main(String[] args) {
        double precoOriginal = 897.78;
        double percenturalDesconto = 38.76;
        double valorDesconto = precoOriginal* (percenturalDesconto / 100);
        double precoComDesconto = precoOriginal - valorDesconto;
        System.out.println("O valor com desconto fica em: R$" + (int) precoComDesconto);

    }
}