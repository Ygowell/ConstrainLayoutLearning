package com.muy.constrainlayoutlearning

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintSet
import kotlinx.android.synthetic.main.activity_11_constrain_set.*

class ConstrainSetActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_11_constrain_set)

        val orgConstraintSet =  ConstraintSet()
        orgConstraintSet.apply {
            clone(root_layout)

            connect(R.id.iv_rabbit, ConstraintSet.TOP, ConstraintSet.PARENT_ID, ConstraintSet.TOP,
                resources.getDimensionPixelSize(R.dimen.margin_top))
            connect(R.id.iv_rabbit, ConstraintSet.START, ConstraintSet.PARENT_ID, ConstraintSet.START,
                resources.getDimensionPixelSize(R.dimen.margin_start))
        }

        orgConstraintSet.applyTo(root_layout)


        // 动态建立新约束
        val constraintSet = ConstraintSet()
        constraintSet.apply {
            clone(root_layout)

            connect(R.id.iv_rabbit, ConstraintSet.TOP, R.id.iv_mi, ConstraintSet.BOTTOM,
                resources.getDimensionPixelSize(R.dimen.margin_top))
            connect(R.id.iv_rabbit, ConstraintSet.START, R.id.iv_mi, ConstraintSet.START)
            connect(R.id.iv_rabbit, ConstraintSet.END, R.id.iv_mi, ConstraintSet.END)
        }

        iv_rabbit.setOnClickListener {
            constraintSet.applyTo(root_layout)
        }

        btn_reset.setOnClickListener {
            orgConstraintSet.applyTo(root_layout)
        }
    }

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_11_constrain_set2)
//
//        val constraintSet = ConstraintSet()
//        constraintSet.apply {
//            clone(this@ConstrainSetActivity, R.layout.activity_11_constrain_set2_changed)
//        }
//
//        imageView17.setOnClickListener {
//            //            TransitionManager.beginDelayedTransition(root_layout2)
//            constraintSet.applyTo(root_layout2)
//        }
//    }
}
