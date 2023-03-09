package com.lmorda.repodetails.data.repository

import com.lmorda.repodetails.data.api.RepoDetailsApiService
import com.lmorda.repodetails.domain.RepoDetails
import com.lmorda.repodetails.domain.data.RepoDetailsRepository
import javax.inject.Inject

class RepoDetailsRepositoryImpl @Inject constructor(
    private val apiService: RepoDetailsApiService
): RepoDetailsRepository {

    override suspend fun getGithubRepo(id: Long): RepoDetails? = apiService.getGithubRepo(id)

}