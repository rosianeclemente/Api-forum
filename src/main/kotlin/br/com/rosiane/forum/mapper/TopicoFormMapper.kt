package br.com.rosiane.forum.mapper

import br.com.rosiane.forum.dto.NovoTopicoForm
import br.com.rosiane.forum.model.Topico
import br.com.rosiane.forum.service.CursoService
import br.com.rosiane.forum.service.UsuarioService

class TopicoFormMapper(
    private val cursoService: CursoService,
    private val usuarioService: UsuarioService
): Mapper<NovoTopicoForm, Topico> {
    override fun map(t: NovoTopicoForm): Topico {
        return Topico(
            titulo = t.titulo,
            mensagem = t.mensagem,
            curso = cursoService.buscarPorId(t.idCurso),
            autor = usuarioService.buscarPorId(t.idAutor)
        )
    }

}