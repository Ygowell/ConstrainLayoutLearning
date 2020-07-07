package com.muy.constrainlayoutlearning

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            openPage(SmsActivity::class.java)
        }

        button2.setOnClickListener {
            openPage(CenterActivity::class.java)
        }

        button3.setOnClickListener {
            openPage(RatioActivity::class.java)
        }

        button4.setOnClickListener {
            openPage(ArcActivity::class.java)
        }

        button5.setOnClickListener {
            openPage(LimitedActivity::class.java)
        }

        button6.setOnClickListener {
            openPage(ChainStyleActivity::class.java)
        }

        button7.setOnClickListener {
            openPage(GuideLineActivity::class.java)
        }

        button8.setOnClickListener {
            openPage(GroupActivity::class.java)
        }

        button9.setOnClickListener {
            openPage(CircularRevealActivity::class.java)
        }

        button10.setOnClickListener {
            openPage(PlaceHolderActivity::class.java)
        }

        button11.setOnClickListener {
            openPage(ConstrainSetActivity::class.java)
        }

        button12.setOnClickListener {
            openPage(FlowActivity::class.java)
        }
    }

    private fun openPage(activity: Class<*>) {
        startActivity(Intent(this, activity))
    }
}
