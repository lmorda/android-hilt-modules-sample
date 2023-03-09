package com.lmorda.coredomain.model

data class RepoDetails(
    val name: String,
    val description: String,
    val author: String,
    val stars: Double,
    val forks: Double,
    val url: String,
)