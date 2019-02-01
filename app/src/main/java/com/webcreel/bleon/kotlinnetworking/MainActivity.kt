package com.webcreel.bleon.kotlinnetworking

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.webcreel.bleon.kotlinnetworking.dao.RetrofitClientInstance
import com.webcreel.bleon.kotlinnetworking.dto.PlantList
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // an interface can't be instantiate BUUUUUUUTTTTTT retrofit handles and creates one with the following method (interface implementation)
        val service = RetrofitClientInstance.retrofitInstance?.create(GetPlantService::class.java)
        val call = service?.getAllPlants()
        call?.enqueue(object : retrofit2.Callback<PlantList> {
            override fun onFailure(call: Call<PlantList>, t: Throwable) {
                Log.wtf("ERRRORRRR", "UWWUU")
                Toast.makeText(applicationContext, "An error ocurred", Toast.LENGTH_SHORT).show()
            }

            override fun onResponse(call: Call<PlantList>, response: Response<PlantList>) {
                val body = response?.body()
                val plants = body?.plants
                var size = plants?.size
                Log.wtf("RESPONSEJSON",plants?.get(0)?.species)
                Toast.makeText(applicationContext, "zzzz" + plants?.get(0)?.species, Toast.LENGTH_SHORT).show()


            }
        })
    }
    }
