package at.fhj.rafflelist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class selectedRaffle : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selected_raffle)

        val intentTitle = intent.getStringExtra("Title")

        findViewById<TextView>(R.id.raffletitle).apply {
            text=intentTitle
        }

    }
}
