package com.mikescamell.motionlayout.quickies

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.mikescamell.motionlayout.R
import com.mikescamell.motionlayout.setLightStatusBar

class MotionQuickieOnTouchUp : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.motion_quickie_on_touch_up)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
        setLightStatusBar(window.decorView)
    }

}