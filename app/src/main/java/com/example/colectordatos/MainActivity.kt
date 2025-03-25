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
        baseDatos.close()
    }

    fun buscar(view: View){
        val conexion = SQLite(this, "Colector de Datos", null, 1)

        val baseDatos = conexion.writableDatabase

        val id = txtid?.text.toString()
        if(id.isEmpty() == false){
            val fila=baseDatos.rawQuery("select nombre, edad, telefono, ciudad from persona where id= '$id'", null)
            if(fila.moveToFirst() == true){
                txtnombre?.setText(fila.getString(0))
                txtedad?.setText(fila.getString(1))
                txttelefono?.setText(fila.getString(2))
                txtciudad?.setText(fila.getString(3))

                baseDatos.close()
            }else{
                txtnombre?.setText(" ")
                txtedad?.setText(" ")
                txttelefono?.setText(" ")
                txtciudad?.setText(" ")

                Toast.makeText(this, "Registro no encontrado", Toast.LENGTH_LONG).show()
            }
        }
    }

    fun eliminar(view: View){
        val conexion = SQLite(this, "Colector de Datos", null, 1)
        val baseDatos = conexion.writableDatabase

        val id = txtid?.text.toString()
        if(id.isEmpty() == false){
            val cant = baseDatos.delete("persona", "id = '"+id+"'", null)

            if(cant > 0){
                Toast.makeText(this, "Individuo eliminado de manera exitosa",Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(this, "Individuo no encontrado",Toast.LENGTH_LONG).show()
            }

            txtid?.setText(" ")
            txtnombre?.setText(" ")
            txtedad?.setText(" ")
            txttelefono?.setText(" ")
            txtciudad?.setText(" ")

        }else{
            Toast.makeText(this, "Debe rellenar todos los campos", Toast.LENGTH_LONG).show()
        }
    }

    fun modificar(view: View){
        val conexion = SQLite(this, "Colector de Datos", null, 1)
        val baseDatos = conexion.writableDatabase

        val id = txtid?.text.toString()
        val nombre = txtnombre?.text.toString()
        val edad = txtedad?.text.toString()
        val telefono = txttelefono?.text.toString()
        val ciudad = txtciudad?.text.toString()

        if(!id.isEmpty() && !nombre.isEmpty() && !edad.isEmpty() && !telefono.isEmpty() && !ciudad.isEmpty()){
            var registro = ContentValues()
            registro.put("nombre", nombre)
            registro.put("edad", edad)
            registro.put("telefono", telefono)
            registro.put("ciudad", ciudad)

            val cant=baseDatos.update("persona", registro, "id='$id'", null)

            if(cant>0){
                Toast.makeText(this, "Registro modificado exitosamente", Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(this, "Registro no encotrado", Toast.LENGTH_LONG).show()
            }
        }else{
            Toast.makeText(this, "Todos los campos deben ser rellenados", Toast.LENGTH_LONG).show()
        }
    }
}