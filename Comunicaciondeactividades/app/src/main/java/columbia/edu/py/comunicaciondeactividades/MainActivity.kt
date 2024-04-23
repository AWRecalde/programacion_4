package columbia.edu.py.comunicaciondeactividades

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat



class MainActivity : AppCompatActivity(), View.OnClickListener {
     private lateinit var bVerificar : Button
     private lateinit var etNombre : EditText
     private lateinit var tvResultado : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etNombre = findViewById(R.id.etNombre)
        bVerificar = findViewById(R.id.bVerificar)
        bVerificar.setOnClickListener(this)
        tvResultado = findViewById(R.id.tvResultado)

    } // Fin del onCreate


    private fun lanzarCondiciones(nombre: String) {
         //creamos la intencion
        val intent = Intent(this, condiciones::class.java)
        intent.putExtra("nombre", nombre)
        condicion.launch(intent)
    }

    //Importante - aprender
    val condicion = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()){
        val resultado = it.data?.getStringExtra("resultado")
        if(it.resultCode == Activity.RESULT_OK){
            tvResultado.text = "Resultado: $resultado"
        }else{
            tvResultado.text = "Resultado: $resultado"
        }
    }

    override fun onClick(p0: View?){ //Aqui se verifica por cual boton se le dio click
        if(p0?.id == bVerificar.id){
            lanzarCondiciones(etNombre.text.toString())
        }
    }



}