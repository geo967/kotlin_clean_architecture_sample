package com.example.cleanarchitecture.domain.useCases.get_airways_details

import android.content.Context
import android.util.Log
import com.example.cleanarchitecture.data.remote.AirwaysApi
import com.example.cleanarchitecture.databinding.ActivityMainBinding
import com.example.cleanarchitecture.domain.model.Airways
import com.example.cleanarchitecture.presentation.airwaysDetails.AirwayDetailsViewModel
import com.example.cleanarchitecture.presentation.ui.MainActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit

class GetAirwayUseCase {
    companion object {
       /* lateinit var postList: List<Airways>
        lateinit var list: List<Airways>*/
        fun air(rf:Retrofit,context: Context,binding: ActivityMainBinding) {
            val api: AirwaysApi = rf.create(AirwaysApi::class.java)
            val call: Call<List<Airways>> = api.posts
           Log.d("qwqw","out call")
            call.enqueue(object : Callback<List<Airways>> {

                override fun onResponse(call: Call<List<Airways>>, response: Response<List<Airways>>) {
                    Log.d("qwqw","in call")
                    AirwayDetailsViewModel.postList = response.body() as List<Airways>
                    val post = arrayOfNulls<String>(AirwayDetailsViewModel.postList.size)
                    AirwayDetailsViewModel.list = AirwayDetailsViewModel.postList
                    for (i in AirwayDetailsViewModel.postList.indices) {
                        post[i] = AirwayDetailsViewModel.postList[i].aId.toString()
                    }
                    MainActivity.setOrientation(context,binding)
                }

                override fun onFailure(call: Call<List<Airways>>, t: Throwable) {

                }

            })
        }
    }
}