package br.com.treino.pokedexegsys.api.ditto

data class PokemonX(
    val name: String,
    val url: String
)

fun PokemonX.toResult(): Result {
    return Result(
        name = name,
        url = url
    )
}