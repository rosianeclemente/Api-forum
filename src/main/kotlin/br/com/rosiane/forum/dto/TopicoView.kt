package br.com.rosiane.forum.dto

import br.com.rosiane.forum.model.StatusTopico
import java.time.LocalDateTime
data class TopicoView(
    val id: Long?,
    val titulo: String,
    val mensagem: String,
    val status: StatusTopico,
    val dataCriacao: LocalDateTime
) {
}