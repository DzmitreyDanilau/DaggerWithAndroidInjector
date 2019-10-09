package by.dzmitrey.danilau.architectureexample.di.modules

import android.app.Application
import android.graphics.drawable.Drawable
import androidx.core.content.ContextCompat
import by.dzmitrey.danilau.architectureexample.R
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.bumptech.glide.request.RequestOptions
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [NetworkModule::class])
class AppModule {
    @Singleton
    @Provides
    fun providesRequestOptions(): RequestOptions {
        return RequestOptions
            .placeholderOf(R.drawable.white_background)
            .error(R.drawable.white_background)
    }

    @Singleton
    @Provides
    fun provideGlideInstance(app: Application, requestOption: RequestOptions): RequestManager {
        return Glide.with(app).setDefaultRequestOptions(requestOption)
    }

    @Singleton
    @Provides
    fun providesAppDrawable(app: Application): Drawable {
        return ContextCompat.getDrawable(app, R.drawable.android)!!
    }
}