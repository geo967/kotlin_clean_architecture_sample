package com.example.cleanarchitecture.presentation.airwaysDetails


import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.cleanarchitecture.domain.model.Airways
import com.example.cleanarchitecture.domain.useCases.get_airways_details.GetAirwayUseCase
import com.example.cleanarchitecture.presentation.airwaysDetails.components.MainAdapter

class AirwayDetailsViewModel:ViewModel() {

    //live data
    private val airwaysList:MutableLiveData<List<Airways>> by lazy {
        MutableLiveData<List<Airways>>()
    }
   // private val postList: List<Airways> = GetAirwayUseCase.postList

    companion object {
        lateinit var postList: List<Airways>
        lateinit var list: List<Airways>
        lateinit var myAdapter: MainAdapter

    }

}