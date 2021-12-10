package br.com.rosiane.forum.controller

import br.com.rosiane.forum.model.Secretaria
import br.com.rosiane.forum.model.Topico
import br.com.rosiane.forum.model.Usuario
import br.com.rosiane.forum.service.TopicoService
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/topicos")
class TopicoController(private val service: TopicoService) {

    @GetMapping()
    fun listar(): List<Topico>{
        return service.listar()
    }
    @GetMapping("/{id}")
    fun buscarPorId(@PathVariable id: Long): Topico{
        return service.buscarPorId(id)
    }
    @PostMapping
    fun cadastrar(topico: Topico){
        return service.cadastrar(topico)
    }
}