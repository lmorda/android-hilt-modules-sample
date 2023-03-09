package com.lmorda.repodetails.domain.repository

import com.lmorda.coredomain.model.RepoDetails

interface RepoDetailsRepository {

    suspend fun getGithubRepo(id: Long): RepoDetails?

}