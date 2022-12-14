package com.example.layer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.layer.databinding.ActivityStadiumBinding

class StadiumActivity : AppCompatActivity() {
    private lateinit var binding: ActivityStadiumBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_stadium)

        binding = ActivityStadiumBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.stadiumBtn.setOnClickListener{ //스타디움 텍스트 눌렀을 때
            val intent = Intent(this, StadiumSelectActivity::class.java)
            startActivity(intent) // 경기장 선택 화면 이동
        }
        binding.nextBtns.setOnClickListener{
            val intent = Intent(this,StadiumSelectActivity::class.java)
            startActivity(intent) //  경기장 화면으로 이동
        }
        binding.beforeBtn.setOnClickListener{
            val intent = Intent(this,SeatNumActivity::class.java)
            startActivity(intent) // 회원가입 액티비티로 이동
        }
    }
}