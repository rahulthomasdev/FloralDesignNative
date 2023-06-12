package com.example.materialcomponenttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.Slide
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.bumptech.glide.Glide
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.example.materialcomponenttest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var ImageSlider : ImageSlider
    lateinit var binding: ActivityMainBinding
    val cards = listOf<DataModel>(DataModel("https://cdn.pixabay.com/photo/2023/05/31/15/22/poppies-8031678_1280.jpg", "Title Sample", "TAG"),DataModel("https://cdn.pixabay.com/photo/2023/05/31/15/22/poppies-8031678_1280.jpg", "Title Sample", "TAG"), DataModel("https://cdn.pixabay.com/photo/2023/05/31/15/22/poppies-8031678_1280.jpg", "Title Sample", "TAG"))
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ImageSlider = binding.ImageSlider

        val imageList: ArrayList<SlideModel> =  ArrayList()

        imageList.add(SlideModel("https://cdn.pixabay.com/photo/2023/05/31/15/22/poppies-8031678_1280.jpg","Image1", ScaleTypes.CENTER_CROP))
        imageList.add(SlideModel("https://cdn.pixabay.com/photo/2023/05/31/11/01/field-8031103_640.jpg","Image2",ScaleTypes.CENTER_CROP))
        imageList.add(SlideModel("https://cdn.pixabay.com/photo/2023/05/31/09/54/flower-8030962_640.jpg", "Image3",ScaleTypes.CENTER_CROP))
        imageList.add(SlideModel("https://cdn.pixabay.com/photo/2023/05/31/09/54/flower-8030962_640.jpg", "Image3",ScaleTypes.CENTER_CROP))
        imageList.add(SlideModel("https://cdn.pixabay.com/photo/2023/05/31/09/54/flower-8030962_640.jpg", "Image3",ScaleTypes.CENTER_CROP))
        ImageSlider.setImageList(imageList)

//        val viewPager: ViewPager = findViewById(R.id.viewPager)
//        val adapter = Adapter(this, cards)
//        viewPager.adapter = adapter
        val recyclerView: RecyclerView = binding.recyclerViewCard
        val adapter = Adapter(cards)
        binding.recyclerViewCard.adapter = adapter

    }
}