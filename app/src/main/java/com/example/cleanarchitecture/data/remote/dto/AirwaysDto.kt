package com.example.cleanarchitecture.data.remote.dto

import com.example.cleanarchitecture.domain.model.Airways
import com.google.gson.annotations.SerializedName

data class AirwaysDto(

	@field:SerializedName("established")
	val established: String? = null,

	@field:SerializedName("country")
	val country: String? = null,

	@field:SerializedName("website")
	val website: String? = null,

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("head_quaters")
	val headQuaters: String? = null,

	@field:SerializedName("logo")
	val logo: String? = null,

	@field:SerializedName("id")
	val id: Int,

	@field:SerializedName("slogan")
	val slogan: String? = null
)

fun AirwaysDto.toAirways(): Airways {
	return Airways(
		aId=id,
		name=name
	)
}