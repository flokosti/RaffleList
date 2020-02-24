package at.fhj.rafflelist

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView







class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val activeRaffles = arrayOf("Test","Test2")
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, activeRaffles)

        val listView:ListView = findViewById(R.id.active_raffle_list)
        listView.adapter = adapter

        listView.setOnItemClickListener { parent, view, position, id ->
            val selectedItem = parent.getItemAtPosition(position) as String
            val intent = Intent(this, selectedRaffle::class.java).apply {
                putExtra("Title",selectedItem)
            }
            startActivity(intent)
        }

    }
}
