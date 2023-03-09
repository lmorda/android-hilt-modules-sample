package com.lmorda.repolist.domain.repository

import com.lmorda.repolist.domain.RepoList

interface RepoListRepository {

    suspend fun getGithubRepos(): RepoList?

}