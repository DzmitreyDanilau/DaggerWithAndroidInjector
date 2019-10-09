package by.dzmitrey.danilau.architectureexample.di.auth

import by.dzmitrey.danilau.architectureexample.network.auth.AuthApi
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
class AuthModule {
    @Provides
    fun providesAuthApi(retrofit: Retrofit):AuthApi{
        return retrofit.create(AuthApi::class.java)
    }
}