package me.weishv.kernelsv.data.repository

import me.weishv.kernelsv.data.model.RepoModule

interface ModuleRepoRepository {
    suspend fun fetchModules(): Result<List<RepoModule>>
}
