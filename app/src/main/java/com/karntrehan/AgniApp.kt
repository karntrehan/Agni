package com.karntrehan

import android.app.Application
import com.karntrehan.dependencies.AppModule
import com.karntrehan.dependencies.CoreComponent
import com.karntrehan.dependencies.DaggerCoreComponent

class AgniApp : Application() {

    val coreComponent: CoreComponent by lazy {
        DaggerCoreComponent.builder()
            .appModule(AppModule(this))
            .build()
    }
}