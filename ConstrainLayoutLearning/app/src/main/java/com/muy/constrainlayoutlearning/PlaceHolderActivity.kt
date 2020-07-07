package com.muy.constrainlayoutlearning

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_10_placeholder.*

class PlaceHolderActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_10_placeholder)
    }

    fun onClick(view: View) {
        placeholder.setContentId(view.id)
    }
}
