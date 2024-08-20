package com.dk.navigater

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
/**
 * 두번째 방법
 * xml 파일에 프레임 짜 놓은상태에서 android:visibility=gone 으로 설정하고 
 * MainActivity에서 변수명.visibilty = View.VISIBLE 으로 만드는 방법도 있다.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 : Button = findViewById(R.id.btn1)
        val btn2 : Button = findViewById(R.id.btn2)

        val manager = supportFragmentManager
        btn1.setOnClickListener {
            val transaction1 = manager.beginTransaction()
            val fragment1 = BlankFragment1()
            transaction1.replace(R.id.frameArea, fragment1)
            transaction1.commit()
        }

        btn2.setOnClickListener {
            val transaction2 = manager.beginTransaction()
            val fragment2 = BlankFragment2()
            transaction2.replace(R.id.frameArea, fragment2)
            transaction2.commit()
        }
    }
}