package com.example.colectordatos

import android.content.ContentValues
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity
import com.example.colectordatos.ui.theme.SQLite

class MainActivity : ComponentActivity() {
    var txtid: EditText?=null
    var txtnombre: EditText?=null
    var txtedad: EditText?=null
    var txttelefono: EditText?=null
    var txtciudad: EditText?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activitymain)

        txtid = findViewById(R.id.txtid)
        txtnombre = findViewById(R.id.txtnombre)
        txtedad = findViewById(R.id.txtedad)
        txttelefono = findViewById(R.id.txttelefono)
        txtciudad = findViewById(R.id.txtciudad)
    }

    fun insertar(view: View){
        var conexion = SQLite(this, "Colector de Datos", null, 1)
        var baseDatos = conexion.writableDatabase
        var id = txtid?.text.toString()
        var nombre = txtnombre?.text.toString()
        var edad = txtedad?.text.toString()
        var telefono = txttelefono?.text.toString()
        var ciudad = txtciudad?.text.toString()

        if(id.isEmpty() == false && nombre.isEmpty() == false && edad.isEmpty() == false && telefono.isEmpty() == false && ciudad.isEmpty() == false){
            var registro = ContentValues()
            registro.put("id", id)
            registro.put("nombre", nombre)
            registro.put("edad", edad)
            registro.put("telefono", telefono)
            registro.put("ciudad", ciudad)

            baseDatos.insert("persona", null, registro)

            txtid?.setText(" ")
            txtnombre?.setText(" ")
            txtedad?.setText(" ")
            txttelefono?.setText(" ")
            txtciudad?.setText(" ")

            Toast.makeText(this, "Información guardada exitosamente", Toast.LENGTH_LONG).show()
        }else{
            Toast.makeText(this, "Debe rellenar todos los campos", Toast.LENGTH_LONG).show()
        }
    }


}