package com.example.foodhunt.scan.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodhunt.R
import com.example.foodhunt.databinding.ActivityDetailScanBinding

class DetailScanActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailScanBinding
    private lateinit var activityDetailScanViewModel : DetailScanViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailScanBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_detail_scan)

        supportActionBar?.hide()

        val image = binding.imgholder.imageAlpha
        val title = binding.txtholder.text

        activityDetailScanViewModel.setDetail(image, title as String)
    }
}