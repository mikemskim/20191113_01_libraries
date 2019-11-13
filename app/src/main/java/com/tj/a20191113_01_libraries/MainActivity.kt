package com.tj.a20191113_01_libraries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupEvents()
        setValues()
    }

    override fun setupEvents() {
    }

    override fun setValues() {
        var url = "https://ppss.kr/wp-content/uploads/2016/11/album-540x540.jpg"
        Glide.with(mContext).load(url).into(mainCirImg)
    }
}
