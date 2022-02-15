package com.example.admobkotlin

import android.app.Application
import com.google.android.gms.ads.MobileAds

class AdmobKotlinApp: Application() {
    override fun onCreate() {
        super.onCreate()
        MobileAds.initialize(this)
    }
}