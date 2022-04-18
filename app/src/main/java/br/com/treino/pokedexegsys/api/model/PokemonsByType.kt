package br.com.treino.pokedexegsys.api.model

import br.com.treino.pokedexegsys.api.ditto.Pokemon

data class PokemonsByType (
    val pokemon: List<Pokemon>

)