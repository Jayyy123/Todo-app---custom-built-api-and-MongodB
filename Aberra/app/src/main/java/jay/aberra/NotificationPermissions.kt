package jay.aberra

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import java.security.Permission
import java.security.Permissions

class NotificationPermissions : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification_permissions)


        supportActionBar?.hide()



        val buttonNext = findViewById<Button>(R.id.Alloww)

        buttonNext.setOnClickListener {
            val intent = Intent(this,ToDoPage::class.java)
            startActivity(intent)
        }

    }
}