package br.edu.fatecfranca.apibd.service;

import br.edu.fatecfranca.apibd.dto.ItemPedidoDTO;
import br.edu.fatecfranca.apibd.dto.PedidoDTO;
import br.edu.fatecfranca.apibd.model.ItemPedido;
import br.edu.fatecfranca.apibd.model.Pedido;
import br.edu.fatecfranca.apibd.model.Produto;
import br.edu.fatecfranca.apibd.model.Usuario;
import br.edu.fatecfranca.apibd.repository.PedidoRepository;
import br.edu.fatecfranca.apibd.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private ProdutoService produtoService;

    public Pedido salvar(PedidoDTO pedidoDTO) {
        Pedido pedido = new Pedido();
        pedido.setData(pedidoDTO.getData());
        pedido.setStatus(pedidoDTO.getStatus());
        Usuario usuario = usuarioRepository.findById(pedidoDTO.getIdUsuario()).orElseThrow(
                () -> new IllegalArgumentException("Usuário não encontrado"));
        pedido.setUsuario(usuario);
        // usuário existe
        // salvar os itens do pedido no banco
        for (ItemPedidoDTO itemPedidoDTO : pedidoDTO.getItens()) {
            Produto produto = produtoService.buscaPorId(itemPedidoDTO.getIdProduto()).orElseThrow(
                    () -> new IllegalArgumentException("Produto não encontrado"));
            ItemPedido itemPedido = new ItemPedido();
            itemPedido.setProduto(produto);
            itemPedido.setPreco(itemPedidoDTO.getPreco());
            itemPedido.setQtde(itemPedidoDTO.getQtde());
            pedido.getItens().add(itemPedido); // associa itemPedido ao pedido que será salvo
        }
        // salva pedido no banco
        return pedidoRepository.save(pedido); // salva pedido, juntamente com os itens do pedido

    }

}
