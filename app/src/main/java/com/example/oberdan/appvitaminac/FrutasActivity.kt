package com.example.oberdan.appvitaminac

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.FragmentActivity
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast


class FrutasActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frutas)


        val lista = arrayOf<String>("Abacaxi", "Acerola", "Caju", "Goiaba", "Laranja", "Limão", "Manga", "Melão", "Morango", "Kiwi", "Tangerina" )

        val itemsAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lista)

        val lv:ListView = findViewById(R.id.lista_itens)
        lv.adapter = itemsAdapter
        lv.setOnItemClickListener(AdapterView.OnItemClickListener { parent, view, position, id ->

            when(position){
                0-> mostraQuantidadeFruta(" - Uma fatia média dessa fruta tem 93mg de vitamina C", lista, position)
                1-> mostraQuantidadeFruta(" - Apenas uma unidade é suficiente para suprir a necessidade, cada uma tem 150mg aproximadamente", lista, position)
                2-> mostraQuantidadeFruta(" - Uma unidade equivale a 95mg da vitamina", lista, position)
                3-> mostraQuantidadeFruta(" - Uma unidade pequena conta com 120mg", lista, position)
                4-> mostraQuantidadeFruta(" - Uma unidade de laranja tem 90mg do nutriente", lista, position)
                5-> mostraQuantidadeFruta(" - Quatro unidades da fruta equivalem a 110mg de vitamina C", lista, position)
                6-> mostraQuantidadeFruta(" - Uma unidade grande conta com exatos 90mg de vitamina C", lista, position)
                7-> mostraQuantidadeFruta(" - Com um pedaço grande, você abocanhará 105mg da vitamina", lista, position)
                8-> mostraQuantidadeFruta(" - Consumindo cinco unidades da fruta, você obtém quase 94mg da vitamina", lista, position)
                9-> mostraQuantidadeFruta(" - Uma unidade contém 95mg do nutriente", lista, position)
                10-> mostraQuantidadeFruta(" - Com duas unidades de tangerina, você consome 110mg da vitamina", lista, position)
            }
        })
    }

    //Metodo para Exibir as informações de cada fruta
    public fun mostraQuantidadeFruta( texto:String, lista:Array<String>, position:Int){
        Toast.makeText(this@FrutasActivity, lista.get(position) + texto, Toast.LENGTH_LONG).show()
    }
}
