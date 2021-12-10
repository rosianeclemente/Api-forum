package br.com.rosiane.forum.service

import br.com.rosiane.forum.model.Topico
import org.springframework.stereotype.Service

@Service
class TopicoService(private var topicos: List<Topico> = ArrayList()) {

    fun listar(): List<Topico> {
        return topicos
    }

    fun buscarPorId(id: Long): Topico {
        return topicos.stream().filter({ t ->
            t.id == id
        }).findFirst().get()
    }

    fun cadastrar(topico: Topico) {
        topicos.plus(topico)
    }

}