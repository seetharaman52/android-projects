package com.cigar.dailyspark

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper{
    private val API_KEY = (R.string.api_key)
    private const val BASE_URL = "https://newsapi.org/"
    fun getInstance(): Retrofit{
        return Retrofit.Builder().baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}