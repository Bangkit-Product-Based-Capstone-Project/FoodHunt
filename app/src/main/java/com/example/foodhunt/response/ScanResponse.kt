package com.example.foodhunt.response

import com.google.gson.annotations.SerializedName

data class ScanResponse(

	@field:SerializedName("ScanResponse")
	val scanResponse: List<ScanResponseItem>
)

data class ScanResponseItem(

	@field:SerializedName("33")
	val jsonMember33: String,

	@field:SerializedName("Nama Makanan")
	val namaMakanan: String,

	@field:SerializedName("Sejarah Makanan")
	val sejarahMakanan: String,

	@field:SerializedName("Detail Makanan")
	val detailMakanan: String,

	@field:SerializedName("30")
	val jsonMember30: String,

	@field:SerializedName("16")
	val jsonMember16: String,

	@field:SerializedName("13")
	val jsonMember13: String,

	@field:SerializedName("9")
	val jsonMember9: String,

	@field:SerializedName("6")
	val jsonMember6: String
)
