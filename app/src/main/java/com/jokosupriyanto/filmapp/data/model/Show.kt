package com.jokosupriyanto.filmapp.data.model

import android.net.Uri
import java.util.*

data class Show(
    val id: String,
    val url: String,
    val name: String,
    val type: String,
    val language: String,
    val genres: List<String>,
    val status: String,
    val runtime: Int,
    val averageRuntime: Int,
    val premiered: Date,
    val officialSite: String,
    val schedule: Schedule,
    val rating: Rating,
    val weight: Int,
    val network: Network,
    val webChannel: WebChannel,
    // dvdCountry
    val externals: Externals,
    val image: Image,
    val summary: String,
    val updated: Long
    // val _links
    // previousepisode
) {

}

