package com.tj.a20191113_01_libraries

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    var mContext = this

    abstract fun setupEvents()
    abstract fun setValues()
}