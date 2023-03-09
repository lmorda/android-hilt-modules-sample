package com.lmorda.repodetails.data.repository

import com.lmorda.coredata.api.mapper.RepoDetailsMapper
import com.lmorda.coredomain.model.RepoDetails
import com.lmorda.repodetails.data.api.RepoDetailsApiService
import com.lmorda.repodetails.domain.repository.RepoDetailsRepository
import javax.inject.Inject

class RepoDetailsRepositoryImpl @Inject constructor(
    private val apiService: RepoDetailsApiService,
    private val repoDetailsMapper: RepoDetailsMapper,
): RepoDetailsRepository {

    override suspend fun getGithubRepo(id: Long): RepoDetails? =
        apiService.getGithubRepo(id)?.let {
            repoDetailsMapper.map(it)
        }

}