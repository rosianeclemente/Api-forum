package br.com.rosiane.forum.service

import br.com.rosiane.forum.model.Usuario
import br.com.rosiane.forum.repository.UsuarioRepository
import org.springframework.stereotype.Service

@Service
class UsuarioService (private val repository: UsuarioRepository) {

    fun buscarPorId(id: Long): Usuario {
        return repository.getOne(id)
    }


}