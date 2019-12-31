package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var mycontact : Contact = Contact ("Chan","000")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this , R.layout.activity_main)
        binding.contact = mycontact
        binding.buttonDone.setOnClickListener {
            updateName()
        }

    }

    private fun updateName() {
        //apply = multiple setter pn a single object
binding.apply {
    contact?.name=editTextName.text.toString()
    contact?.phonenum=editTextPhonenum.text.toString()

    this.invalidateAll()
}
    }
}
