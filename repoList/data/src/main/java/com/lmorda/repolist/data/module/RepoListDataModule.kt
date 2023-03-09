package com.lmorda.repolist.data.module

import com.lmorda.repolist.data.api.RepoListApiService
import com.lmorda.repolist.data.repository.RepoListRepositoryImpl
import com.lmorda.repolist.domain.repository.RepoListRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepoListDataModule {

    @Provides
    @Singleton
    fun provideDataRepository(apiService: RepoListApiService): RepoListRepository =
        RepoListRepositoryImpl(apiService)

    @Provides
    @Singleton
    fun provideApiService(retrofit: Retrofit): RepoListApiService =
        retrofit.create(RepoListApiService::class.java)

}