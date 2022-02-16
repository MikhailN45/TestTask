package com.mikhailn45.testtask

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.mikhailn45.testtask.databinding.ActivityPowBinding

class PowActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPowBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityPowBinding.inflate(layoutInflater).also { setContentView(it.root) }

        val number = (intent.getIntExtra(Prefs.EXTRAS, 0))
        binding.tvPowCounter.text = (number*number).toString()

        binding.getCounterButton.setOnClickListener { onBackPressed() }

        Log.i("SecondActivity", "2 Created")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putString(Prefs.POW_COUNT, binding.tvPowCounter.text.toString())
        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        binding.tvPowCounter.text = savedInstanceState.getString(Prefs.POW_COUNT)
    }

    override fun onStart() {
        super.onStart()
        Log.i("SecondActivity", "2 Started")
    }

    override fun onResume() {
        super.onResume()
        Log.i("SecondActivity", "2 Resumed")
    }

    override fun onPause() {
        super.onPause()
        Log.i("SecondActivity", "2 Paused")
    }

    override fun onStop() {
        super.onStop()
        Log.i("SecondActivity", "2 Stopped")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("SecondActivity", "2 Destroyed")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("SecondActivity", "2 Restarted")
    }
}
