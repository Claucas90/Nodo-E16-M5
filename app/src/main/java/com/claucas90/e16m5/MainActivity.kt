package com.claucas90.e16m5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import com.claucas90.e16m5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var  binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        var arrayAdapter: ArrayAdapter<*>

        val paises = mutableListOf("Chile", "Paraguay",
            "Bolivia","Peru","Ecuador","Brasil","Colombia","Venezuela","Uruguay")
        //val list1 = findViewById<ListView>(R.id.list1)
        val list1 = binding.list1

        arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,paises)
        list1.adapter = arrayAdapter

        //acciones
        //val tv1 = findViewById<TextView>(R.id.text1)
        val tv1 = binding.tv1
        list1.setOnItemClickListener { parent, view, position, id ->
            val selectedItem = paises[position]

            if (selectedItem == "Chile")  tv1.text = "En Chile hay 19.490.000 de habitantes"
            if (selectedItem == "Paraguay")  tv1.text = "En Paraguay hay 7.000.000 de habitantes"
            if (selectedItem == "Bolivia")  tv1.text = "En Bolivia hay hay 12.080.000 de habitantes"
            if (selectedItem == "Peru")  tv1.text = "En Peru hay 33.720.000 de habitantes"
            if (selectedItem == "Ecuador")  tv1.text = "En Ecuador hay 6.000.000 de habitantes"
            if (selectedItem == "Brasil")  tv1.text = "En Brasil hay 214.300.000 de habitantes"
            if (selectedItem == "Colombia")  tv1.text = "En Colombia hay 26.000.000 de habitantes"
            if (selectedItem == "Venezuela")  tv1.text = "En Venezuela hay 32.000.000 de habitantes"
            if (selectedItem == "Uruguay")  tv1.text = "En Uruguay hay 8.000.000 de habitantes"

        }

    }
}