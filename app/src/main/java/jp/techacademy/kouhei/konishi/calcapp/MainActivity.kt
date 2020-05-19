package jp.techacademy.kouhei.konishi.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.util.Log

class MainActivity : AppCompatActivity(), View.OnClickListener {
    var num1: Double = 0.0
    var num2: Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val intent = Intent(this, SecondActivity::class.java)
        var num1 = editText1.text.toString().toDouble()
        var num2 = editText2.text.toString().toDouble()

        //Log.d("kotlintest", num1.toString().toDouble())

        intent.putExtra("VALUE1", num1)
        intent.putExtra("VALUE2", num2)
        startActivity(intent)
    }
}
