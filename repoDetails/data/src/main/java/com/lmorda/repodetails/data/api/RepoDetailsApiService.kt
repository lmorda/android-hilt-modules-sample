package com.lmorda.repodetails.data.api

import com.lmorda.coredata.api.model.RepoDetailsDto
import retrofit2.http.GET
import retrofit2.http.Query
import javax.inject.Singleton

@Singleton
interface RepoDetailsApiService {

    @GET("/search/repositories")
    suspend fun getGithubRepo(
        @Query("id") id: Long
    ): RepoDetailsDto?

}