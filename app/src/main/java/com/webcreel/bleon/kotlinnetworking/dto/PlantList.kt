package com.webcreel.bleon.kotlinnetworking.dto

import com.google.gson.annotations.SerializedName

data class PlantList(@SerializedName("plants") var plants: List<PlantDTO>){}