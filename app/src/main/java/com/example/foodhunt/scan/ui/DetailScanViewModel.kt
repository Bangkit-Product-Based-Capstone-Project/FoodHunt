package com.example.foodhunt.scan.ui

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.foodhunt.response.ScanResponse
import com.example.foodhunt.scan.api.ScanApiConfig
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class DetailScanViewModel : ViewModel() {

    private val detail = MutableLiveData<ScanResponse>()

    fun setDetail(key: Int, value: String){
        val retrofit = ScanApiConfig.getApiService()
        val call = retrofit.result(key, value)
        call.enqueue(object : Callback<ScanResponse> {
            override fun onResponse(call: Call<ScanResponse>, response: Response<ScanResponse>) {
                if (response.isSuccessful) {
                    detail.postValue(response.body())
                }
                else {
                    Log.e("Error : ", response.message().toString())
                }
            }

            override fun onFailure(call: Call<ScanResponse>, t: Throwable) {
                Log.e("onFailure : ", t.message!!)
            }
        })
    }
}