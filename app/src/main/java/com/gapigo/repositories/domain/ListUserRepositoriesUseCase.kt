package com.gapigo.repositories.domain

import com.gapigo.repositories.core.UseCase
import com.gapigo.repositories.data.model.Repo
import com.gapigo.repositories.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
    ) : UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }

}