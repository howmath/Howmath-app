package han.howcom.howmath

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import han.howcom.howmath.databinding.ActivitySignUpBinding


class SignUpActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = ActivitySignUpBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }
}