package by.dzmitrey.danilau.architectureexample.di.auth

import androidx.lifecycle.ViewModel
import by.dzmitrey.danilau.architectureexample.di.ViewModelKey
import by.dzmitrey.danilau.architectureexample.ui.auth.AuthViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class AuthViewModelsModule {
    @Binds
    @IntoMap
    @ViewModelKey(AuthViewModel::class)
    abstract fun bindAuthViewModel(authViewModel: AuthViewModel): ViewModel
}