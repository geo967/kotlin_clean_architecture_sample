package com.example.cleanarchitecture.presentation.ui

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cleanarchitecture.databinding.ActivityMainBinding
import com.example.cleanarchitecture.di.AppModule
import com.example.cleanarchitecture.domain.useCases.get_airways_details.GetAirwayUseCase

import com.example.cleanarchitecture.presentation.airwaysDetails.AirwayDetailsViewModel
import com.example.cleanarchitecture.presentation.airwaysDetails.components.MainAdapter

class MainActivity : AppCompatActivity() {
    lateinit var airwayDetailsViewModel: AirwayDetailsViewModel
    lateinit var binding:ActivityMainBinding
    lateinit var adapter:MainAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


       // adapter = MainAdapter()
        val rf=AppModule.buildRetrofit()
        GetAirwayUseCase.air(rf,this,binding)
      /*airwayDetailsViewModel=ViewModelProvider(this)[AirwayDetailsViewModel::class.java]
        airwayDetailsViewModel.getMutableLiveData().observe(this, Observer {
            adapter.updateList(it)

        })*/

    }
    companion object {
        fun setOrientation(context: Context, binding: ActivityMainBinding) {
            val layoutManager = GridLayoutManager(context, 2)
            layoutManager.orientation = RecyclerView.VERTICAL
            binding.recyclerView.setHasFixedSize(true)
            binding.recyclerView.layoutManager = layoutManager
            AirwayDetailsViewModel.myAdapter=MainAdapter(AirwayDetailsViewModel.list)
            binding.recyclerView.adapter = AirwayDetailsViewModel.myAdapter
        }
    }
}