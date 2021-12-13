package br.com.rosiane.forum.service

import br.com.rosiane.forum.model.Curso
import br.com.rosiane.forum.repository.CursoRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class CursoService(private val repository: CursoRepository) {

    fun buscarPorId(id: Long): Curso {
        return repository.getOne(id)
    }


}
