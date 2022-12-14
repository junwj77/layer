package com.example.layer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.layer.databinding.ActivityStadiumBinding
import com.example.layer.databinding.ActivityStadiumSelectBinding

//스크롤 구현

class StadiumSelectActivity : AppCompatActivity() {
    private lateinit var binding: ActivityStadiumSelectBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_stadium_select)

        binding = ActivityStadiumSelectBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageArrowBack.setOnClickListener{ //이전 화살표 클릭시
            val intent = Intent(this,StadiumActivity::class.java)
            startActivity(intent) // 스타디움 화면으로 이동
        }

    }
}