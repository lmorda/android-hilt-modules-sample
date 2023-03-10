package com.lmorda.listdetails.navigation

interface ListDetailsDestination {
    val route: String
}

object RepoList : ListDetailsDestination {
    override val route = "repo_list"
}

object RepoDetails : ListDetailsDestination {
    override val route = "repo_details"
}