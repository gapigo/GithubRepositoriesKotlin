package com.gapigo.repositories.data.repositories

import android.app.RemoteAction
import com.gapigo.repositories.core.RemoteException
import com.gapigo.repositories.data.model.Repo
import com.gapigo.repositories.data.services.GitHubService
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException

class RepoRepositoryImpl(private val service: GitHubService) : RepoRepository {
    override suspend fun listRepositories(user: String) = flow {
        try {
            val repoList = service.listRepositories(user)
            emit(repoList)
        } catch (ex: HttpException) {
            throw RemoteException(ex.message ?: "Não foi possível fazer a busca no momento!")
        }

    }

}