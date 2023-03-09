package com.lmorda.repolist.data.repository

import com.lmorda.repolist.data.api.RepoListApiService
import com.lmorda.repolist.domain.RepoList
import com.lmorda.repolist.domain.repository.RepoListRepository
import javax.inject.Inject

class RepoListRepositoryImpl @Inject constructor(
    private val apiService: RepoListApiService
): RepoListRepository {

    override suspend fun getGithubRepos(): RepoList? = apiService.getGithubRepos()

}