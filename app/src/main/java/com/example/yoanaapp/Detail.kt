package com.example.yoanaapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.ncorti.slidetoact.SlideToActView
import de.hdodenhof.circleimageview.CircleImageView

class Detail  : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_view)
        WindowCompat.setDecorFitsSystemWindows(
            window,false
        )
        val imageList = ArrayList<SlideModel>()

        imageList.add(SlideModel(R.drawable.gambar10, "1", ScaleTypes.CENTER_CROP))
        imageList.add(SlideModel(R.drawable.satu, "2", ScaleTypes.CENTER_CROP))
        imageList.add(SlideModel(R.drawable.dua, "3", ScaleTypes.CENTER_CROP))
        imageList.add(SlideModel(R.drawable.tiga, "4", ScaleTypes.CENTER_CROP))
        imageList.add(SlideModel(R.drawable.empat, "5", ScaleTypes.CENTER_CROP))
        imageList.add(SlideModel(R.drawable.lima, "6", ScaleTypes.CENTER_CROP))
        imageList.add(SlideModel(R.drawable.enam, "7", ScaleTypes.CENTER_CROP))
        imageList.add(SlideModel(R.drawable.tujuh, "8", ScaleTypes.CENTER_CROP))
        imageList.add(SlideModel(R.drawable.delapan, "9", ScaleTypes.CENTER_CROP))
        imageList.add(SlideModel(R.drawable.sembilan, "10", ScaleTypes.CENTER_CROP))
        imageList.add(SlideModel(R.drawable.sepuluh, "11", ScaleTypes.CENTER_CROP))

        val imageSlider = findViewById<ImageSlider>(R.id.image_slider)
        imageSlider.setImageList(imageList)

        val slide = findViewById<SlideToActView>(R.id.sliderBottomSheet)
        slide.animDuration = 600
        slide.bumpVibration = 500
        slide.onSlideCompleteListener = object : SlideToActView.OnSlideCompleteListener {
            override fun onSlideComplete(view: SlideToActView) {
                val destinationIntent = Intent(this@Detail, TabLayout::class.java)
                startActivity(destinationIntent)
            }
        }

        val backBtn = findViewById<Button>(R.id.back)
        backBtn.setOnClickListener {
            val intent = Intent(this, Main::class.java)
            startActivity(intent)
            finish()
        }
        val nama = intent.getStringExtra("nama")
        val desc = intent.getStringExtra("desc")
        val notelp = intent.getStringExtra("notelp")
        val deskripsi = intent.getStringExtra("deskripsi")
        val fotoResId = intent.getIntExtra("foto", 0)
        val namaTextView = findViewById<TextView>(R.id.namaTextView)
        val descTextView = findViewById<TextView>(R.id.descTextView)
        val notelpTextView = findViewById<TextView>(R.id.noTelpView)
        val deskripsiTextView = findViewById<TextView>(R.id.deskripsiView)
        val fotoImageView = findViewById<CircleImageView>(R.id.preview)
        namaTextView.text = nama
        descTextView.text = desc
        notelpTextView.text = notelp
        deskripsiTextView.text = deskripsi
        fotoImageView.setImageResource(fotoResId)
    }
}