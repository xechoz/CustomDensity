package com.xechoz.lib

import android.app.Application
import android.content.Context

class MainApplication: Application() {
    override fun attachBaseContext(base: Context) {
        base.setCustomDensity()
        super.attachBaseContext(base)
    }
}