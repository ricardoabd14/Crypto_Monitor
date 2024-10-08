package vaalls.com.github.crypto_monitor_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class MainActivity : ComponentActivity() {
    class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            // Configurando a toolbar
            val toolbarMain: Toolbar = findViewById(R.id.toolbar_main)
            configureToolbar(toolbarMain)
        }

        private fun configureToolbar(toolbar: Toolbar) {
            setSupportActionBar(toolbar)
            toolbar.setTitleTextColor(getColor(R.color.white))
            supportActionBar?.setTitle(getText(R.string.app_title))
            supportActionBar?.setBackgroundDrawable(getDrawable(R.color.primary))
        }
    }
}