package jay.aberra

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.time.format.DateTimeFormatter
import java.util.*

class ToDoPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_to_do_page)

        supportActionBar?.setTitle("Today")

        val buttonNext = findViewById<Button>(R.id.buttonAdd)

        buttonNext.setOnClickListener {
            val intent = Intent(this,NewTodo::class.java)
            startActivity(intent)
        }


//        onCreateOptionsMenu()
        val note = mutableListOf<Todo_List>()
        note.add(Todo_List("Test", "12/02/22",true))

        var newNote = intent.getStringExtra("EXTRA")
        var dueDate = intent.getStringExtra("EXTRA1")
        var check = intent.getStringExtra("EXTRA2")

        note.add(Todo_List(newNote.toString(),dueDate.toString(),check.toBoolean()))

        val cb = findViewById<CheckBox>(R.id.cb)

        var adapter = TodoAdapter(this,note)

        val recycle1 = findViewById<RecyclerView>(R.id.incomp)
        val recycle2 = findViewById<RecyclerView>(R.id.comp)

        recycle1.layoutManager = LinearLayoutManager(this)
        recycle2.layoutManager = LinearLayoutManager(this)
        recycle1.adapter = adapter







    }

}
