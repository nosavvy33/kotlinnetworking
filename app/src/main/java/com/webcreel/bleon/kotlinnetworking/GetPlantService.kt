package com.webcreel.bleon.kotlinnetworking

import com.webcreel.bleon.kotlinnetworking.dto.PlantList
import retrofit2.Call
import retrofit2.http.GET

interface GetPlantService {

    @GET("perl/mobile/viewplantsjson.pl?Combined_Name=Oak")
    fun getAllPlants(): Call<PlantList>
}