package ca.doophie.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MemoryLeaker.arrayOfDeath.add(this)

        val intent = Intent(this, MainActivity2::class.java)

        startActivity(intent)
    }
}
