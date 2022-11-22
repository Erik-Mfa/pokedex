package br.com.up.pokedex.model

import com.google.gson.annotations.SerializedName

data class PokeStatus(
    @SerializedName("base_stat")
    val baseStat: Int,
    @SerializedName("stat")
    val stat: StatusName
)
