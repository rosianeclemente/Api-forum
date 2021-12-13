package br.com.rosiane.forum.exception

import java.lang.RuntimeException

class NotFoundException (message: String?) : RuntimeException(message){
}