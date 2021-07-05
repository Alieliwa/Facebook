package com.example.facebook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class MainActivity : AppCompatActivity() , TextWatcher{
    lateinit var txt_email : EditText
    lateinit var txt_pass : EditText
    lateinit var btn_log :  Button
    lateinit var  logo_image_view : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txt_email = findViewById(R.id.txt_email)
        txt_pass = findViewById(R.id.txt_pass)
        btn_log =findViewById(R.id.btn_log)
        logo_image_view = findViewById(R.id. logo_image_view)


        txt_email.addTextChangedListener(this)
        txt_pass.addTextChangedListener(this)

        logo_image_view.visibility = View.VISIBLE
        logo_image_view.animate()
            .translationY(-800f)
            .scaleX(.7f)
            .scaleY(.7f)
            .duration = 1000
    }

    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
    }

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
        btn_log.isEnabled = txt_email.text.toString().trim().isNotEmpty() && txt_pass.text.toString().trim().isNotEmpty()
    }

    override fun afterTextChanged(s: Editable?) {
    }
}