package com.lmorda.coredata.api.mapper

import com.lmorda.coredata.api.model.RepoDetailsDto
import com.lmorda.coredomain.model.RepoDetails
import javax.inject.Inject

class RepoDetailsMapper @Inject constructor() {

    fun map(repoDetailsDto: RepoDetailsDto): RepoDetails = with(repoDetailsDto) {
        RepoDetails(
            name = this.name,
            description = this.description,
            author = this.author,
            stars = this.stars,
            forks = this.forks,
            url = this.url,
        )
    }

}