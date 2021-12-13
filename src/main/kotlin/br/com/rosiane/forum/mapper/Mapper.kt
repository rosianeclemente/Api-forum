package br.com.rosiane.forum.mapper

interface Mapper<T, U> {

    fun map(t: T): U

}