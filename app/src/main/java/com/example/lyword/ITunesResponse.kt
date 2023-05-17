package com.example.lyword

import com.google.gson.annotations.SerializedName

data class ITunesResponse(
    @SerializedName(value = "resultCount") val resultCount : Int,
    @SerializedName(value = "results") val results : List<ITunesResult>
)

data class ITunesResult(
    @SerializedName(value = "wrapperType") val wrapperType : String,
    @SerializedName(value = "kind") val kind : String,
    @SerializedName(value = "artistName") val artistName : String,
    @SerializedName(value = "trackName") val trackName : String,
    @SerializedName(value = "previewUrl") val previewUrl : String,
    @SerializedName(value = "artworkUrl100") val artworkUrl100 : String,
    @SerializedName(value = "trackTimeMillis") val trackTimeMillis : Long,
    @SerializedName(value = "country") val country : String,
    @SerializedName(value = "primaryGenreName") val primaryGenreName : String
)
