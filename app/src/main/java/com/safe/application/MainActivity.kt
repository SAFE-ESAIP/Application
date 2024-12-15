package com.safe.application

import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputBinding
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity
import com.safe.application.databinding.LoginPageBinding
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.auth.FirebaseAuth

import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.safe.application.ui.theme.ApplicationTheme
import kotlin.math.log

class MainActivity : ComponentActivity() {

    private lateinit var binding: LoginPageBinding


    // Variables pour la connexion avec Firebase
//    lateinit var auth : FirebaseAuth
//    lateinit var database : FirebaseDatabase


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_page)

        // Logique de connexion avec Firebase (plus tard pour l'instant c'est un test local)
        binding = LoginPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginButton.setOnClickListener(View.OnClickListener {

            if (binding.emailInput.text.toString() == "admin" && binding.passwordInput.text.toString() == "admin") {
                Toast.makeText(this , "Login Successful" , Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this , "Login Failed" , Toast.LENGTH_SHORT).show()
            }


        binding.forgotPassword.setOnClickListener {
            Toast.makeText(this , "Forgot Password Clicked" , Toast.LENGTH_SHORT).show()
        }
        })
    }
}

