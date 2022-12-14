package com.example.layer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.layer.databinding.ActivitySeatNumBinding

class SeatNumActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySeatNumBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_seat_num)

        binding = ActivitySeatNumBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.nextBtn.setOnClickListener { // 다음 버튼 눌렀을 때
            val intent = Intent(this,StadiumActivity::class.java)
            startActivity(intent) // 스타디움 액티비티로 이동
        }


    }
}