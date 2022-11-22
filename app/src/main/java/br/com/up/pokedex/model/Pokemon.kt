package br.com.up.pokedex.model

import com.google.gson.annotations.SerializedName

data class Pokemon(
    val id: Int,
    val url: String,
    val name: String,
    @SerializedName("types")
    val types: List<PokeType>,
    @SerializedName("stats")
    val stats: List<PokeStatus>,
    @SerializedName("abilities")
    val abilities: List<PokemonSpecialAttack>,
    @SerializedName("moves")
    val moves: List<PokeMoves>
)
