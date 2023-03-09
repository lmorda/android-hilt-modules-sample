package com.lmorda.coredata.api.model

data class RepoDetailsDto(
    val name: String,
    val description: String,
    val author: String,
    val stars: Double,
    val forks: Double,
    val url: String,
)
