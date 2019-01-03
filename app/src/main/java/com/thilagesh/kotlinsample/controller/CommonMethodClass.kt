package com.thilagesh.kotlinsample.controller

import android.content.Context
import com.google.android.gms.ads.*
import com.thilagesh.kotlinsample.R
import kotlinx.android.synthetic.main.content_home.view.*

class CommonMethodClass{
    companion object {


        fun ShowAdds(view: AdView,cxt:Context){



            MobileAds.initialize(cxt, cxt.resources.getString(R.string.addmobId));
            val adRequest = AdRequest.Builder().build()
            view.loadAd(adRequest)
            view.adListener = object: AdListener() {
                override fun onAdLoaded() {
                              }

                override fun onAdFailedToLoad(errorCode : Int) {
                    // Code to be executed when an ad request fails.
                }

                override fun onAdOpened() {
                    // Code to be executed when an ad opens an overlay that
                    // covers the screen.
                }

                override fun onAdLeftApplication() {
                    // Code to be executed when the user has left the app.
                }

                override fun onAdClosed() {
                    // Code to be executed when when the user is about to return
                    // to the app after tapping on an ad.
                }
            }
        }

    }
}