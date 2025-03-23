package com.xechoz.lib

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun attachBaseContext(newBase: Context) {
        newBase.setCustomDensity()
        super.attachBaseContext(newBase)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)

        val a = findViewById<View>(R.id.a_match_parent)

        val b = findViewById<View>(R.id.b_match_parent)

        val b360 = findViewById<View>(R.id.dp_360)

        a.postDelayed({
            Log.i("AutoRatioLayout.test", "a ${a.measuredWidth}, b ${b.measuredWidth}, b360 ${b360.measuredWidth}")

        }, 2000L)

        findViewById<View>(R.id.next).setOnClickListener {
            startActivity(Intent(this, MainActivity2::class.java))
        }
    }
}