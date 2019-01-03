package com.thilagesh.kotlinsample.controller

import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.net.NetworkInfo
import android.support.v4.content.ContextCompat

class AppUtills{
    companion object {
        fun isNetworkAvailable(cxt:Context):Boolean{
            val connectivityManager =cxt.getSystemService(Context.CONNECTIVITY_SERVICE)
            return if (connectivityManager is ConnectivityManager) {
                val networkInfo: NetworkInfo? = connectivityManager.activeNetworkInfo
                networkInfo?.isConnected ?: false
            } else false
        }
        fun sendException(){
            val subject = "Test"
            val message = "Test"

            val intent = Intent(Intent.ACTION_SEND)
            val addressees = arrayOf(to)
            intent.putExtra(Intent.EXTRA_EMAIL, addressees)
            intent.putExtra(Intent.EXTRA_SUBJECT, subject)
            intent.putExtra(Intent.EXTRA_TEXT, message)
            intent.setType("message/rfc822")
            ContextCompat.startActivity(Intent.createChooser(intent, "Send Email using:"));
        }
    }
}