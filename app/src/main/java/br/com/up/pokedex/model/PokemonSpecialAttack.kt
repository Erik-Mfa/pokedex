package br.com.up.pokedex.model

import com.google.gson.annotations.SerializedName

data class PokemonSpecialAttack(
    @SerializedName("ability")
    val ability: NomeHabilidade
)
