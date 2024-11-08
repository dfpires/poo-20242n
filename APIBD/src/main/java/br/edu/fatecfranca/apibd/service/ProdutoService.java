package br.edu.fatecfranca.apibd.service;

import br.edu.fatecfranca.apibd.dto.ProdutoDTO;
import br.edu.fatecfranca.apibd.model.Produto;
import br.edu.fatecfranca.apibd.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> listaTodos(){
        return produtoRepository.findAll();
    }
    public Optional<Produto> buscaPorId(Long id){
        return produtoRepository.findById(id);
    }
    public Produto salva(ProdutoDTO produtoDTO){
        Produto produto = new Produto();
        produto.setNome(produtoDTO.getNome());
        produto.setDescricao(produtoDTO.getDescricao());
        produto.setPreco(produtoDTO.getPreco());
        return produtoRepository.save(produto);
    }
    public void remover(Long id){
        if (produtoRepository.existsById(id)) {
            produtoRepository.deleteById(id);
        } else {
            throw new IllegalArgumentException("Produto não encontrado");
        }
    }
    public Produto atualiza(ProdutoDTO produtoDTO){
        if (produtoRepository.existsById(produtoDTO.getId())) {
            Produto prodAtualiza = new Produto();
            prodAtualiza.setNome(produtoDTO.getNome());
            prodAtualiza.setDescricao(produtoDTO.getDescricao());
            prodAtualiza.setPreco(produtoDTO.getPreco());
            prodAtualiza.setId(produtoDTO.getId());
            return produtoRepository.save(prodAtualiza);
        }
        else {
            throw new IllegalArgumentException("Não foi possivel atualizar o produto");
        }
    }
}
