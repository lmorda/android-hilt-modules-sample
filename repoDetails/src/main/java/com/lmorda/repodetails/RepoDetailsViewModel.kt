package com.lmorda.repodetails

import androidx.lifecycle.ViewModel
import com.lmorda.repodetails.domain.repository.RepoDetailsRepository
import javax.inject.Inject

class RepoDetailsViewModel @Inject constructor(
    private val dataRepository: RepoDetailsRepository
) : ViewModel() {

}