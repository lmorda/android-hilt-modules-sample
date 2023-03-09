package com.lmorda.repolist.domain.repository

import com.lmorda.coredomain.model.RepoList

interface RepoListRepository {

    suspend fun getGithubRepos(): RepoList?

}