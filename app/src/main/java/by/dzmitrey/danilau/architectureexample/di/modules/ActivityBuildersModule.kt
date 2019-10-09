package by.dzmitrey.danilau.architectureexample.di.modules

import by.dzmitrey.danilau.architectureexample.di.auth.AuthModule
import by.dzmitrey.danilau.architectureexample.di.auth.AuthViewModelsModule
import by.dzmitrey.danilau.architectureexample.ui.auth.AuthActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuildersModule {
        //Let dagger know that these activities is potential clients
    @ContributesAndroidInjector(
        modules = [AuthViewModelsModule::class, AuthModule::class]
    )
    abstract fun contributesAuthActivity(): AuthActivity


}