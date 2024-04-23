package columbia.edu.py.comunicaciondeactividades

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class condiciones : AppCompatActivity(), View.OnClickListener {
    private lateinit var tvCondicion: TextView
    private lateinit var bRechazar : Button
    private lateinit var bAceptar : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_condiciones)

        val nombre = intent.extras?.getString("nombre")

        tvCondicion = findViewById(R.id.tvCondicion)
        tvCondicion.text = "Aceptas las condiciones $nombre?"
        bRechazar = findViewById(R.id.bRechazar)
        bRechazar.setOnClickListener(this)
        bAceptar = findViewById(R.id.bAceptar)
        bAceptar.setOnClickListener(this)

    } // Fin del oncreate

    override fun onClick(po: View?){
        if(po?.id == bRechazar.id){
            volver(Activity.RESULT_CANCELED, "Rechazado")
        }else {
            volver(Activity.RESULT_OK, "Aceptado")
        }
    }

    private fun volver(estado : Int, resultado : String){
        val padre = intent
        padre.putExtra("resultado", resultado)
        setResult(estado, padre)
        finish()
    }


}