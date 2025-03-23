package com.xechoz.lib

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import androidx.activity.ComponentActivity

class MainActivity2 : ComponentActivity() {
//    override fun attachBaseContext(newBase: Context) {
//        super.attachBaseContext(newBase.createCustomDensityContext())
//    }

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main2)

        val a = findViewById<View>(R.id.a_match_parent)

        val b = findViewById<View>(R.id.b_match_parent)

        val b360 = findViewById<View>(R.id.dp_360)

        a.postDelayed({
            Log.i("AutoRatioLayout.test", "a ${a.measuredWidth}, b ${b.measuredWidth}, b360 ${b360.measuredWidth}")

        }, 2000L)
    }
}