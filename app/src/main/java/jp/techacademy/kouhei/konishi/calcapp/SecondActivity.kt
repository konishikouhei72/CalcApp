package jp.techacademy.kouhei.konishi.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.util.Log
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val value1 = intent.getDoubleExtra("VALUE1", 0.0)
        val value2 = intent.getDoubleExtra("VALUE2", 0.0)
        val value3 = intent.getDoubleExtra("演算判定", 0.0)

        val alertDialogBuilder = AlertDialog.Builder(this)
        alertDialogBuilder.setTitle("タイトル")
        alertDialogBuilder.setMessage("メッセージ")

        if (value3 == 1.0) {
            textView.text = "${value1 + value2}"
            Log.d("kotlintest", "1.1+2.2は「" + textView.text + "」")
        }else if(value3 == 2.0){
            textView.text = "${value1 - value2}"
        }else if(value3 == 3.0){
            textView.text = "${value1 * value2}"
        }else if(value3 == 4.0){
            textView.text = "${value1 / value2}"
        }else if(value3 == 5.0){
            // ここにダイアログでメッセージを出そうとしております
        }

    }
}