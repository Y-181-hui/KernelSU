package me.weishv.kernelsv.data.repository

import me.weishv.kernelsv.data.model.Module
import me.weishv.kernelsv.data.model.ModuleUpdateInfo

interface ModuleRepository {
    suspend fun getModules(): Result<List<Module>>
    suspend fun checkUpdate(module: Module): Result<ModuleUpdateInfo>
}
