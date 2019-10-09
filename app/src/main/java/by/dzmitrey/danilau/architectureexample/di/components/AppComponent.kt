package by.dzmitrey.danilau.architectureexample.di.components

import android.app.Application
import by.dzmitrey.danilau.architectureexample.BaseApp
import by.dzmitrey.danilau.architectureexample.di.modules.ActivityBuildersModule
import by.dzmitrey.danilau.architectureexample.di.modules.AppModule
import by.dzmitrey.danilau.architectureexample.di.modules.ViewModelFactoryModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        ActivityBuildersModule::class,
        AppModule::class,
        ViewModelFactoryModule::class
    ]
)
interface AppComponent : AndroidInjector<BaseApp> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }
}