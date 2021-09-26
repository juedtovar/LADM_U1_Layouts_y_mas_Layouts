package mx.tecnm.tepic.ladm_u1_layouts_y_mas_layouts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton = findViewById<Button>(R.id.botonir)
        boton.setOnClickListener {
            var activity5 = Intent(this, MainActivity7::class.java)
            startActivity(activity5)
        }
    }

}