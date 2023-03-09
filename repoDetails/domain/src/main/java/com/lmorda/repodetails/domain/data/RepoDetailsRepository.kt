package com.lmorda.repodetails.domain.data

import com.lmorda.repodetails.domain.RepoDetails

interface RepoDetailsRepository {

    suspend fun getGithubRepo(id: Long): RepoDetails?

}