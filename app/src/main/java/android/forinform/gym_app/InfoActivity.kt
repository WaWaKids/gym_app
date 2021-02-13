package android.forinform.gym_app

import android.content.pm.ActivityInfo
import android.forinform.gym_app.databinding.ActivityInfoBinding
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class InfoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityInfoBinding

    protected override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}