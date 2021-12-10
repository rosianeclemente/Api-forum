package br.com.rosiane.forum.model

import java.time.LocalDateTime

data class Resposta(
    val id: Long?,
    val mensagem: String,
    val dataCriacao: LocalDateTime = LocalDateTime.now(),
    val usuario: Usuario,
    val topico: Topico,
    val solucao: Boolean
) {

}
