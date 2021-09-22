package edu.temple.signupform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class FormActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myButton: Button = findViewById(R.id.btnRegister)
        val username: EditText = findViewById(R.id.edUsername)
        val password: EditText = findViewById(R.id.edPassword)
        val confirmPassword: EditText = findViewById(R.id.edConfirmPassword)

        val ocl: View.OnClickListener = View.OnClickListener {
            val username: String = username.text.toString()
            val password: String = password.text.toString()
            val passwordConf: String = confirmPassword.text.toString()
            if (username == "" || password == "" || passwordConf == "") {
                val t: Toast = Toast.makeText(this@FormActivity, "Error: All fields must be entered.", Toast.LENGTH_SHORT)
                t.show()
            } else if (password != passwordConf) {
                val t: Toast = Toast.makeText(this@FormActivity, "Error: The passwords you entered do not match.", Toast.LENGTH_SHORT)
                t.show()
            } else {
                val t: Toast = Toast.makeText(this@FormActivity, "Welcome $username !", Toast.LENGTH_SHORT)
                t.show()
            }
        }
        myButton.setOnClickListener(ocl)
    }
}