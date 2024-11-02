package br.edu.fatecfranca.apibd.service;

import br.edu.fatecfranca.apibd.dto.UsuarioDTO;
import br.edu.fatecfranca.apibd.model.Usuario;
import br.edu.fatecfranca.apibd.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    // injeção de dependência
    @Autowired // usar os métodos da classe sem instanciá-la
    UsuarioRepository usuarioRepository;

    // lista todos os usuários
    public List<Usuario> listaTodos(){
        return usuarioRepository.findAll();
    }
    // lista um usuário por ID
    public Optional<Usuario> buscaPorId(Long id){
        return usuarioRepository.findById(id);
    }
    // salvar um usuário
    public Usuario salva(UsuarioDTO usuario){
        Usuario newUser = new Usuario();
        newUser.setNome(usuario.getNome());
        newUser.setPassword(usuario.getPassword());
        newUser.setUsername(usuario.getUsername());
        return usuarioRepository.save(newUser); // insere pois não tem id
    }

    // remove usuário
    public void excluir(Long id){
        if (usuarioRepository.existsById(id)){
            usuarioRepository.deleteById(id);
        }
        else {
            throw new IllegalArgumentException("Usuário não encontrado ");
        }
    }

    public Usuario atualiza(UsuarioDTO usuario){
        if (usuarioRepository.existsById(usuario.getId())) {
            Usuario newUser = new Usuario();
            newUser.setNome(usuario.getNome());
            newUser.setPassword(usuario.getPassword());
            newUser.setUsername(usuario.getUsername());
            newUser.setId(usuario.getId());
            // o save serve também para atualizar
            return usuarioRepository.save(newUser); // atualização, pois tem id
        }
        else {
            throw new IllegalArgumentException("Usuário não encontado");
        }
    }

}
