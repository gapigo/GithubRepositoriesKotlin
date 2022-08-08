package com.gapigo.repositories.data.repositories

import com.gapigo.repositories.data.model.Repo
import com.gapigo.repositories.data.services.GitHubService
import kotlinx.coroutines.flow.flow

class RepoRepositoryImpl(private val service: GitHubService) : RepoRepository {
    override suspend fun listRepositories(user: String) = flow {
        val repoList = service.listRepositories(user)
        emit(repoList)
    }

}