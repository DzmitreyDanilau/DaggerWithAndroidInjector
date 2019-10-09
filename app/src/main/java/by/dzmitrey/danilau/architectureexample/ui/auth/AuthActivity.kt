package by.dzmitrey.danilau.architectureexample.ui.auth

import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import by.dzmitrey.danilau.architectureexample.R
import by.dzmitrey.danilau.architectureexample.viewmodels.ViewModelProviderFactory
import com.bumptech.glide.RequestManager
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_auth.*
import javax.inject.Inject

class AuthActivity : DaggerAppCompatActivity() {
    @Inject
    lateinit var providerFactory: ViewModelProviderFactory
    @Inject
    lateinit var logo: Drawable
    @Inject
    lateinit var requestManager: RequestManager
    private lateinit var viewModel: AuthViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)
        setLogo()
        viewModel = ViewModelProvider(this, providerFactory).get(AuthViewModel::class.java)
    }

    private fun setLogo() {
        requestManager.load(logo).into(login_icon)
    }
}
