package com.lmorda.coredata.api.mapper

import com.lmorda.coredata.api.model.RepoListDto
import com.lmorda.coredomain.model.RepoList
import javax.inject.Inject

class RepoListMapper @Inject constructor(
    private val repoDetailsMapper: RepoDetailsMapper,
) {

    fun map(repoListDto: RepoListDto): RepoList = with(repoListDto) {
        RepoList(
            githubRepos = this.githubRepos.map {
                repoDetailsMapper.map(it)
            }
        )
    }
}