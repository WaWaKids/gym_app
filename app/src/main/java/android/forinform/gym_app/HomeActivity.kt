package android.forinform.gym_app

import android.content.Intent
import android.forinform.gym_app.databinding.ActivityHomeBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class HomeActivity : AppCompatActivity() {


    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonWoRating.setOnClickListener {
            startActivity(Intent(this, WORateActivity::class.java))
        }
    }
}