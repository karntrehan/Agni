package com.karntrehan.dependencies

import android.content.Context
import com.squareup.picasso.OkHttp3Downloader
import com.squareup.picasso.Picasso
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ImageModule {
    @Provides
    @Singleton
    fun providesPicasso(context: Context): Picasso {
        return Picasso.Builder(context)
            .downloader(OkHttp3Downloader(context))
            .build()
    }
}