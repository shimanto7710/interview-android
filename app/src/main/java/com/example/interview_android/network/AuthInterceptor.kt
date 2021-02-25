package com.example.interview_android.network

import android.net.TrafficStats
import com.example.interview_android.core.Constants
import com.example.interview_android.pref.PrefUtils
import okhttp3.Interceptor
import okhttp3.Response

/**
 * Interceptor to add auth token to requests
 */
class AuthInterceptor() : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        TrafficStats.setThreadStatsTag(10000)
        val requestBuilder = chain.request().newBuilder()

        // If token has been saved, add it to the request
        PrefUtils.getInstance().getString(Constants.TOKEN,null).let {
            requestBuilder.addHeader("Authorization", "Bearer $it")
            requestBuilder.addHeader("Content-Type", "application/json")
//            requestBuilder.addHeader("Cache-Control", "public, only-if-cached, max-stale=" + 60 * 60 * 24 * 7)
//            requestBuilder.removeHeader("Pragma")
        }

        return chain.proceed(requestBuilder.build())
    }
}