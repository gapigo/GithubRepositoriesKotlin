package com.gapigo.repositories.presentation.di

import com.gapigo.repositories.presentation.MainViewModel
import org.koin.androidx.experimental.dsl.viewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.loadKoinModules
import org.koin.core.module.Module
import org.koin.dsl.module

object PresentationModule {
    fun load() {
        loadKoinModules(viewModuleModule())
    }
    private fun viewModuleModule(): Module {
        return module {
            viewModel { MainViewModel(get()) }
        }
    }
}