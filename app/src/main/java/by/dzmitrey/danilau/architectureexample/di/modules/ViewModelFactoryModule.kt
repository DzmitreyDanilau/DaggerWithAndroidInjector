package by.dzmitrey.danilau.architectureexample.di.modules

import androidx.lifecycle.ViewModelProvider
import by.dzmitrey.danilau.architectureexample.viewmodels.ViewModelProviderFactory
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class ViewModelFactoryModule {
    @Binds
    abstract fun bindViewModelFactory(viewModelFactory: ViewModelProviderFactory)
            : ViewModelProvider.Factory
}