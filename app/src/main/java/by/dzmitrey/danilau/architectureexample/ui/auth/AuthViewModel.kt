package by.dzmitrey.danilau.architectureexample.ui.auth

import androidx.lifecycle.ViewModel
import by.dzmitrey.danilau.architectureexample.model.User
import by.dzmitrey.danilau.architectureexample.network.auth.AuthApi
import io.reactivex.Observer
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import timber.log.Timber
import javax.inject.Inject

class AuthViewModel @Inject constructor(private val authApi: AuthApi) : ViewModel() {
    init {
        Timber.d("Auth viewModel was created!")
    }

    fun fakeRequest() {
        authApi.getUser(1)
            .toObservable()
            .subscribeOn(Schedulers.io())
            .subscribe {
                object : Observer<User> {
                    override fun onComplete() {
                        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                    }

                    override fun onSubscribe(d: Disposable) {
                        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                    }

                    override fun onNext(t: User) {
                        Timber.d("onNext ${t.email}")

                    }

                    override fun onError(e: Throwable) {
                        Timber.d("Error" + e.message)
                    }
                }
            }

    }
}