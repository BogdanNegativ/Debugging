package com.example.debugging

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

private const val TAG = "MainActivity"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        logging()
        division()
    }
    private val numerator = 60
    private var denominator = 4
    private fun division() {
        repeat(4) {
            Log.v(TAG, "${numerator / denominator}")
            denominator--
        }
    }
    private fun logging() {
        Log.e(TAG, "ERROR: a serious error like an app crash")
        Log.w(TAG, "WARN: warns about the potential for serious errors")
        Log.i(TAG, "INFO: reporting technical information, such as an operation succeeding")
        Log.d(TAG, "DEBUG: reporting technical information useful for debugging")
        Log.d(TAG, "$denominator")
        Log.v(TAG, "VERBOSE: more verbose than DEBUG logs")
    }
}