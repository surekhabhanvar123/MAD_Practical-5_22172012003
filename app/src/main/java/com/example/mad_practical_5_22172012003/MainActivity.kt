package com.example.mad_practical_5_22172012003

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.CallLog
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val browseBotton: Button = findViewById(R.id.button)
        val editTextBrowser:EditText = findViewById(R.id.editTextText)
        browseBotton.setOnClickListener{
            openUrl(editTextBrowser.text.toString())
        }

    }
    fun openUrl(url:String) {
        Intent(Intent.ACTION_VIEW, Uri.parse(url)).also { startActivity(it) }
    }
    fun PhoneNo(No:String){
        Intent(Intent.ACTION_DIAL).setData(Uri.parse("tel:$Num")).also { startActivity(it) }
    }
    fun openCallLog(){
    }

}
