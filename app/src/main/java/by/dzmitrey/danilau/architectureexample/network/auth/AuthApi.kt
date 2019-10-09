package by.dzmitrey.danilau.architectureexample.network.auth

import by.dzmitrey.danilau.architectureexample.model.User
import io.reactivex.Flowable
import retrofit2.http.GET
import retrofit2.http.Path

interface AuthApi {
    @GET("users/{id}")
    fun getUser(@Path("id") id: Int): Flowable<User>
}