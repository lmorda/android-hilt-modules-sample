package com.lmorda.repolist.data.api

import com.lmorda.coredata.api.ITEMS_PER_PAGE
import com.lmorda.coredata.api.model.RepoListDto
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.QueryMap
import javax.inject.Singleton

@Singleton
interface RepoListApiService {

    @GET("/search/repositories")
    suspend fun getGithubRepos(
        @QueryMap(encoded = true) q: Map<String, String>? = mapOf(),
        @Query("page") page: Int? = 1,
        @Query("per_page") itemsPerPage: Int? = ITEMS_PER_PAGE
    ): RepoListDto?

}