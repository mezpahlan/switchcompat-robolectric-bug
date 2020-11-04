package uk.co.mezpahlan.switchcompatrobolectricbug

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uk.co.mezpahlan.switchcompatrobolectricbug.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow()
        }
    }
}