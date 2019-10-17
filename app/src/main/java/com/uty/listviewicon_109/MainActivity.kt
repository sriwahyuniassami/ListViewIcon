package com.uty.listviewicon_109
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.uty.listviewicon_109.Model.Bahasa
import com.uty.listviewicon_109.Model.BahasaData

class MainActivity : AppCompatActivity() {

    private lateinit var rvBahasa: RecyclerView
    private var list: ArrayList<Bahasa> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvBahasa = findViewById(R.id.listviewicon)
        rvBahasa.setHasFixedSize(true)
        list.addAll(BahasaData.listBahasa)
        showBahasaList()
    }

    private fun showBahasaList(){
        rvBahasa.layoutManager = LinearLayoutManager(this)
        val listAdapter = ListBahasaAdapter(list)
        rvBahasa.adapter = listAdapter
    }
}
