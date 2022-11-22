package br.com.up.pokedex.model

import com.google.gson.annotations.SerializedName

data class PokeType(
    @SerializedName("type")
    val type: TypeName
)