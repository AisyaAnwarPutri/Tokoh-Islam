package com.example.tokohislam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val btnshare: Button = findViewById(R.id._btnshare)
        btnshare.setOnClickListener(this)


        val image = intent.getParcelableExtra<Image>(MainActivity.INTENT_PARCELABLE)

        val imgSrc = findViewById<ImageView>(R.id._imageDetail)
        val imgTitle = findViewById<TextView>(R.id._imageTitle)
        val imgDesc = findViewById<TextView>(R.id._imageDesc)

        imgSrc.setImageResource(image?.imageSrc!!)
        imgTitle.text = image.imageTitle
        imgDesc.text = image.imageDesc
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id._btnshare -> {
                val share = Intent(Intent.ACTION_SEND)
                share.type = "text/plain"
                share.putExtra(Intent.EXTRA_SUBJECT, "Ini Bahasa Pemograman")
                share.putExtra(Intent.EXTRA_TEXT, "Bahasa Pemograman")
                startActivity(Intent.createChooser(share, "Share Link !"))
            }
        }
    }
}