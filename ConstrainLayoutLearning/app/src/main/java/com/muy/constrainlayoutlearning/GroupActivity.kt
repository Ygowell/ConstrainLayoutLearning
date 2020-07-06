package com.muy.constrainlayoutlearning

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_8_group.*

class GroupActivity : AppCompatActivity() {

    private var flag: Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_8_group)

        button.setOnClickListener {
            flag = !flag

            constrain_group.visibility = if(flag) View.VISIBLE else View.GONE
        }

        button15.setOnClickListener {
            constrain_layer.rotation = 45f
            constrain_layer.translationX = 100f
            constrain_layer.translationY = 100f
        }
    }
}
