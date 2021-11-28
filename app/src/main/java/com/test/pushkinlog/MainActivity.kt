package com.test.pushkinlog

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "Ты видел деву на скале")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "В одежде белой над волнами")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "Когда, бушуя в бурной мгле,")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "Играло море с берегами,")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "Когда луч молний озарял")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "Ее всечасно блеском алым")
    }
}


