package com.cigar.dailyspark

import retrofit2.Response
import retrofit2.http.GET

interface RetrofitInterface {

    // Insert your API key from newsapi.org

    @GET("v2/top-headlines?country=in&category=general&apiKey={API_KEY}")
    suspend fun getGeneralNews(): Response<NewsItem>

    @GET("v2/top-headlines?country=in&category=business&apiKey={API_KEY}")
    suspend fun getBusinessNews(): Response<NewsItem>

    @GET("v2/top-headlines?country=in&category=entertainment&apiKey={API_KEY}")
    suspend fun getEntertainmentNews(): Response<NewsItem>

    @GET("v2/top-headlines?country=in&category=health&apiKey={API_KEY}")
    suspend fun getHealthNews(): Response<NewsItem>

    @GET("v2/top-headlines?country=in&category=science&apiKey={API_KEY}")
    suspend fun getScienceNews(): Response<NewsItem>

    @GET("v2/top-headlines?country=in&category=sports&apiKey={API_KEY}")
    suspend fun getSportsNews(): Response<NewsItem>

    @GET("v2/top-headlines?country=in&category=technology&apiKey={API_KEY}")
    suspend fun getTechnologyNews(): Response<NewsItem>
}