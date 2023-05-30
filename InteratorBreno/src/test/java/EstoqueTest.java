import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetorTest {

    @Test
    void deveContarProdutosDisponiveis() {
        SetorEstoque setor = new SetorEstoque(
                new Produto("Caneta", 10),
                new Produto("Lápis", 0),
                new Produto("Borracha", 5),
                new Produto("Caderno", 3)
        );
        assertEquals(3, Setor.contarProdutosDisponiveis(setor));
    }

    @Test
    void deveContarTotalProdutos() {
        SetorEstoque setor = new SetorEstoque(
                new Produto("Caneta", 10),
                new Produto("Lápis", 0),
                new Produto("Borracha", 5),
                new Produto("Caderno", 3)
        );
        assertEquals(4, Setor.contarTotalProdutos(setor));
    }
}