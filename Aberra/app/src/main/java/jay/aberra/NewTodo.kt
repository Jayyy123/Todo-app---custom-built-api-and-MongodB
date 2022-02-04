package jay.aberra

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class NewTodo : AppCompatActivity() {
    private lateinit var type: EditText
    private lateinit var dT: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_todo)

        val buttonSave = findViewById<Button>(R.id.buttonSave)
        val buttonCancel = findViewById<Button>(R.id.buttonCancel)
        type = findViewById(R.id.type)
        dT = findViewById(R.id.dT1)

        buttonSave.setOnClickListener {
            val data = Todo_List(type.text.toString(),dT.text.toString(),false)

            val intent = Intent(this,ToDoPage::class.java).apply {
                putExtra("EXTRA", data.newTodo)
                putExtra("EXTRA1", data.dueDate)
                putExtra("EXTRA2", data.ischecked)
            }
            startActivity(intent)
        }



    }




}