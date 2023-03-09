package com.lmorda.repolist.data.repository

import com.lmorda.coredata.api.mapper.RepoListMapper
import com.lmorda.coredomain.model.RepoList
import com.lmorda.repolist.data.api.RepoListApiService
import com.lmorda.repolist.domain.repository.RepoListRepository
import javax.inject.Inject

class RepoListRepositoryImpl @Inject constructor(
    private val apiService: RepoListApiService,
    private val repoListMapper: RepoListMapper,
): RepoListRepository {

    override suspend fun getGithubRepos(): RepoList? =
        apiService.getGithubRepos()?.let {
            repoListMapper.map(it)
        }
}