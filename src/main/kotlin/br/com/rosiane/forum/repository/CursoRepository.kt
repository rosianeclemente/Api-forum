package br.com.rosiane.forum.repository

import br.com.rosiane.forum.model.Curso
import org.springframework.data.jpa.repository.JpaRepository

interface CursoRepository: JpaRepository<Curso, Long> {
}