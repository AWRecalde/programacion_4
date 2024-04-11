package columbia.edu.py.mislugares

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.entrada_texto)
    }

    fun pulsar(view: View) {
        Toast.makeText( applicationContext, "Boton pulsado", Toast.LENGTH_SHORT ).show()

    }

    fun lanzarAcercaDe(view: View) {
             val i = Intent(this, Acerca::class.java)
             startActivity(i)
    }

}