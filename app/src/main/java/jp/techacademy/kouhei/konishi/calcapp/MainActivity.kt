package jp.techacademy.kouhei.konishi.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.support.v7.app.AlertDialog
import android.util.Log

class MainActivity : AppCompatActivity(), View.OnClickListener {
    var num1: Double = 0.0
    var num2: Double = 0.0
    var num3: Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        val intent = Intent(this, SecondActivity::class.java)

        if (editText1.text.isEmpty()||editText2.text.isEmpty()) {
            fun showAlertDialog() {
                // AlertDialog.Builderクラスを使ってAlertDialogの準備をする
                val alertDialogBuilder = AlertDialog.Builder(this)
                alertDialogBuilder.setTitle("エラーメッセージ")
                alertDialogBuilder.setMessage("数値を２つ入力してください")

                // 肯定ボタンに表示される文字列、押したときのリスナーを設定する
                alertDialogBuilder.setPositiveButton("肯定"){dialog, which ->
                    Log.d("UI_PARTS", "肯定ボタン")
                }
                // AlertDialogを作成して表示する
                val alertDialog = alertDialogBuilder.create()
                alertDialog.show()
            }
        }

        var num1 = editText1.text.toString().toDouble()
        var num2 = editText2.text.toString().toDouble()

        Log.d("kotlintest", "数値１は「"+num1+"」")
        Log.d("kotlintest", "数値２は「"+num2+"」")

        when (view.id) {
            R.id.button1 -> num3 = 1.0
            R.id.button2 -> num3 = 2.0
            R.id.button3 -> num3 = 3.0
            R.id.button4 -> num3 = 4.0
        }

        Log.d("kotlintest", "数値3は「"+num3+"」")

        intent.putExtra("VALUE1", num1)
        intent.putExtra("VALUE2", num2)
        intent.putExtra("演算判定", num3)

        startActivity(intent)
    }
}
