package jay.aberra

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CalendarPermissions : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendar_permissions)

        supportActionBar?.hide()

        val buttonNext = findViewById<Button>(R.id.Allow)

        buttonNext.setOnClickListener {
            val intent = Intent(this,NotificationPermissions::class.java)
            startActivity(intent)
        }


    }
}