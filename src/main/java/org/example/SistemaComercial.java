package org.example;
import java.util.Collection;
public interface SistemaComercial {
    boolean existeProduto(Produto produto);
    Produto pesquisaProduto(String codigoProduto)
        throws ProdutoNaoExisteException;
    boolean cadastraProduto(Produto produto);
    boolean existeCliente(Cliente cliente);
    Cliente pesquisaCliente (String id) throws clienteNaoExisteException;
    Collection<Produto> pesquisaProdutosDaCategoria (CategoriaProduto categoria );
}
