package br.edu.fatecfranca.apibd.repository;

import br.edu.fatecfranca.apibd.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
