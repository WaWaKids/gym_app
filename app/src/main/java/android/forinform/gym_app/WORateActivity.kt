package android.forinform.gym_app

import android.content.Intent
import android.forinform.gym_app.databinding.ActivityHomeBinding
import android.forinform.gym_app.databinding.ActivityWoRatingBinding
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class WORateActivity : AppCompatActivity() {

    private lateinit var binding: ActivityWoRatingBinding

    protected override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWoRatingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonBack.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }

        binding.zayceva.setOnClickListener {
            startActivity(Intent(this, TrainerRateActivity::class.java))
        }
    }
}