package com.cigar.dailyspark

import retrofit2.Response
import retrofit2.http.GET

interface RetrofitInterface {
    @GET("v2/top-headlines?country=in&category=general&apiKey=f21faa8879a744999539ca59ae9a7e17")
    suspend fun getGeneralNews(): Response<NewsItem>

    @GET("v2/top-headlines?country=in&category=business&apiKey=f21faa8879a744999539ca59ae9a7e17")
    suspend fun getBusinessNews(): Response<NewsItem>

    @GET("v2/top-headlines?country=in&category=entertainment&apiKey=f21faa8879a744999539ca59ae9a7e17")
    suspend fun getEntertainmentNews(): Response<NewsItem>

    @GET("v2/top-headlines?country=in&category=health&apiKey=f21faa8879a744999539ca59ae9a7e17")
    suspend fun getHealthNews(): Response<NewsItem>

    @GET("v2/top-headlines?country=in&category=science&apiKey=f21faa8879a744999539ca59ae9a7e17")
    suspend fun getScienceNews(): Response<NewsItem>

    @GET("v2/top-headlines?country=in&category=sports&apiKey=f21faa8879a744999539ca59ae9a7e17")
    suspend fun getSportsNews(): Response<NewsItem>

    @GET("v2/top-headlines?country=in&category=technology&apiKey=f21faa8879a744999539ca59ae9a7e17")
    suspend fun getTechnologyNews(): Response<NewsItem>
}