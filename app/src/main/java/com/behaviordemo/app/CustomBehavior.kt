package com.behaviordemo.app

import android.content.Context
import android.support.design.widget.CoordinatorLayout
import android.util.AttributeSet
import android.view.View
import android.support.v4.view.ViewCompat.animate
import android.R.attr.rotation
import android.support.v4.view.ViewCompat
import android.R.attr.dependency
import android.widget.Button
import android.widget.TextView


class CustomBehavior(context: Context?, attrs: AttributeSet?) : CoordinatorLayout.Behavior<View>(context, attrs) {
    override fun layoutDependsOn(parent: CoordinatorLayout?, child: View?, dependency: View?): Boolean {
        return dependency is Button || super.layoutDependsOn(parent, child, dependency);
    }

    override fun onDependentViewChanged(parent: CoordinatorLayout?, child: View?, dependency: View?): Boolean {
        val offset = dependency!!.top
        // 获取被监听的View的状态 只关心 滑动位置 也就是 垂直方向
        // 让child进行平移
        ViewCompat.offsetTopAndBottom(child, -offset)
        // 旋转
        //child!!.animate().rotation((child.top * 10).toFloat())
        return true

    }
}