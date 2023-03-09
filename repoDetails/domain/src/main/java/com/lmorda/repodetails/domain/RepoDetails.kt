package com.lmorda.repodetails.domain

data class RepoDetails(
    val name: String,
    val description: String,
    val author: String,
    val stars: Double,
    val forks: Double,
    val url: String,
)
