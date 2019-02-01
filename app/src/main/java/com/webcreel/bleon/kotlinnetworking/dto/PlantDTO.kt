package com.webcreel.bleon.kotlinnetworking.dto

import com.google.gson.annotations.SerializedName

data class PlantDTO(@SerializedName("id") var id: Int = 0, @SerializedName("genus") var genus : String, @SerializedName("species") var species : String, @SerializedName("cultivar") var cultivar: String, @SerializedName("common") var common : String){

}