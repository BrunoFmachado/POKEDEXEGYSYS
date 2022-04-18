package br.com.treino.pokedexegsys.api.model

import br.com.treino.pokedexegsys.api.ditto.PokemonDetailResponseDto
import br.com.treino.pokedexegsys.api.ditto.PokemonTypeResponseDto
import br.com.treino.pokedexegsys.api.ditto.PokemonsListResponseDto
import br.com.treino.pokedexegsys.utility.Constants.GET_POKEMONS_END_POINT
import retrofit2.http.GET
import retrofit2.http.Path


interface PokemonService {

    @GET(GET_POKEMONS_END_POINT)
    suspend fun listPokemons(): PokemonsListResponseDto

    @GET("pokemon/{name}")
    suspend fun getPokemon(@Path("name") name:String): PokemonDetailResponseDto

    @GET("type/{typeId}")
    suspend fun getPokemonType(@Path("typeId") typeId: String): PokemonTypeResponseDto

}