package com.practicum.testrecyclerview

import android.app.Activity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners

class GlideTest : Activity(){
    private val imageUrl = "https://img.freepik.com/free-vector/open-blue-book-white_1308-69339.jpg"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_with_imageview)

        val image = findViewById<ImageView>(R.id.image)

        Glide.with(applicationContext)
            .load(imageUrl)
            .placeholder(R.drawable.ic_launcher_foreground)//заглушка если не загрузилось изображение
            //.centerCrop() //.centerInside()
            .centerInside()
            .transform(RoundedCorners(10))
            .into(image)

//        fun dpToPx(dp: Float, context: Context): Int {
//            return TypedValue.applyDimension(
//                TypedValue.COMPLEX_UNIT_DIP,
//                dp,
//                context.resources.displayMetrics).toInt()
//        }

    }
}