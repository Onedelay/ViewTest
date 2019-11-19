package com.onedelay.viewtest.custom

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import android.util.Log
import androidx.appcompat.widget.LinearLayoutCompat

class CustomLinearLayout(context: Context, attributeSet: AttributeSet? = null) :
    LinearLayoutCompat(context, attributeSet) {
    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)

        Log.d("VIEW_TEST", "CustomLinearLayout onMeasure()")
    }

    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
        super.onLayout(changed, left, top, right, bottom)

        Log.d("VIEW_TEST", "CustomLinearLayout onLayout()")
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        Log.d("VIEW_TEST", "CustomLinearLayout onDraw()")
    }
}