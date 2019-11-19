package com.onedelay.viewtest.custom

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import android.util.Log
import androidx.constraintlayout.widget.ConstraintLayout

class CustomInnerConstraint(context: Context, attributeSet: AttributeSet? = null) :
    ConstraintLayout(context, attributeSet) {
    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)

        Log.d("VIEW_TEST", "CustomInnerConstraint onMeasure()")
    }

    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
        super.onLayout(changed, left, top, right, bottom)

        Log.d("VIEW_TEST", "CustomInnerConstraint onLayout()")
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        Log.d("VIEW_TEST", "CustomInnerConstraint onDraw()")
    }
}