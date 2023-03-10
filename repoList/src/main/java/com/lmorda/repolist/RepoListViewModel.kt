package com.lmorda.repolist

import androidx.lifecycle.ViewModel
import com.lmorda.repolist.domain.repository.RepoListRepository
import javax.inject.Inject

class RepoListViewModel @Inject constructor(
    private val dataRepository: RepoListRepository
) : ViewModel() {

}