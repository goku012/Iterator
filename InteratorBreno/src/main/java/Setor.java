public class Setor {

    public static int contarProdutosDisponiveis(SetorEstoque setor) {
        int quantidade = 0;
        for (Produto produto : setor) {
            if (produto.getQuantidade() > 0) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static int contarTotalProdutos(SetorEstoque setor) {
        int quantidade = 0;
        for (Produto produto : setor) {
            quantidade++;
        }
        return quantidade;
    }
}