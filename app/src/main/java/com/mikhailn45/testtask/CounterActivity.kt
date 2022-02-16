package com.mikhailn45.testtask

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import com.mikhailn45.testtask.databinding.ActivityCounterBinding

class CounterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCounterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCounterBinding.inflate(layoutInflater).also { setContentView(it.root) }
        binding.getPowButton.setOnClickListener {
            val intent = Intent(this, PowActivity::class.java).apply {
                putExtra(Prefs.EXTRAS, binding.tvStatesCounter.text.toString().toInt())
            }
            startActivity(intent)

        }
        Log.i("FirstActivity", "1 Created")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt(Prefs.CHANGES_COUNT, binding.tvStatesCounter.text.toString().toInt())
        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        val count = savedInstanceState.getInt(Prefs.CHANGES_COUNT) + 1
        binding.tvStatesCounter.text = count.toString()
    }

    override fun onStart() {
        super.onStart()
        Log.i("FirstActivity", "1 Started")
    }

    override fun onResume() {
        super.onResume()
        Log.i("FirstActivity", "1 Resumed")
    }

    override fun onPause() {
        super.onPause()
        Log.i("FirstActivity", "1 Paused")
    }

    override fun onStop() {
        super.onStop()
        Log.i("FirstActivity", "1 Stopped")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("FirstActivity", "1 Destroyed")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("FirstActivity", "1 Restarted")
    }
}
