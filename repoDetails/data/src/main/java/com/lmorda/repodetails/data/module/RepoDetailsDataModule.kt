package com.lmorda.repodetails.data.module

import com.lmorda.repodetails.data.api.RepoDetailsApiService
import com.lmorda.repodetails.data.repository.RepoDetailsRepositoryImpl
import com.lmorda.repodetails.domain.data.RepoDetailsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataModule {

    @Provides
    @Singleton
    fun provideDataRepository(apiService: RepoDetailsApiService): RepoDetailsRepository =
        RepoDetailsRepositoryImpl(apiService)

    @Provides
    @Singleton
    fun provideApiService(retrofit: Retrofit): RepoDetailsApiService =
        retrofit.create(RepoDetailsApiService::class.java)
}