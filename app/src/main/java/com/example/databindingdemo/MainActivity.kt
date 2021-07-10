package com.example.databindingdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.databindingdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var aPerson :Person = Person("ali", "1234679", "ali@gmail.com", "12 jalan 132")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.personData = aPerson
        
        binding.btnUpdate.setOnClickListener(){
            aPerson.email = "xxx.gmail.com"

            binding.apply { invalidateAll()}
        }

//        binding.tvName.text = aPerson.name
//        binding.tvIC.text = aPerson.ic
//        binding.tvEmail.text = aPerson.email
//        binding.tvAddress.text = aPerson.address


//        binding.tvAddress.text = "12 jalan 123"

//        val tv:TextView = findViewById(R.id.tvName)

    }
}