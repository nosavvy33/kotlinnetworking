package com.webcreel.bleon.kotlinnetworking.dao

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClientInstance{

    private var retrofit: Retrofit? = null
    private val BASE_URL = "http://www.plantplaces.com/"

    val retrofitInstance : Retrofit?
        get() {
            if(retrofit == null){
                retrofit = retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            }
            return retrofit
        }
}