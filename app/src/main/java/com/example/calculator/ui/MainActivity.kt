package com.example.calculator.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.calculator.R
import com.example.calculator.interfaces.IOperationPresenter
import com.example.calculator.interfaces.IOperationView
import com.example.calculator.presenters.OperationPresenter

class MainActivity : AppCompatActivity(), IOperationView {
    private lateinit var presenter: IOperationPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = OperationPresenter(this)

        findViewById<Button>(R.id.buttonAdd).setOnClickListener {
            val number1 = findViewById<EditText>(R.id.editTextNumber1).text.toString()
            val number2 = findViewById<EditText>(R.id.editTextNumber2).text.toString()

            presenter.add(Integer.parseInt(number1), Integer.parseInt(number2))
        }

        findViewById<Button>(R.id.buttonSubtract).setOnClickListener {
            val number1 = findViewById<EditText>(R.id.editTextNumber1).text.toString()
            val number2 = findViewById<EditText>(R.id.editTextNumber2).text.toString()

            presenter.subtract(Integer.parseInt(number1), Integer.parseInt(number2))
        }

        findViewById<Button>(R.id.buttonMultiply).setOnClickListener {
            val number1 = findViewById<EditText>(R.id.editTextNumber1).text.toString()
            val number2 = findViewById<EditText>(R.id.editTextNumber2).text.toString()

            presenter.multiply(Integer.parseInt(number1), Integer.parseInt(number2))
        }

        findViewById<Button>(R.id.buttonDivide).setOnClickListener {
            val number1 = findViewById<EditText>(R.id.editTextNumber1).text.toString()
            val number2 = findViewById<EditText>(R.id.editTextNumber2).text.toString()

            presenter.divide(Integer.parseInt(number1), Integer.parseInt(number2))
        }
    }

    override fun showResutado(resultado: Int) {
        Toast.makeText(this, String.format("Resultado: %s", resultado.toString()), Toast.LENGTH_SHORT).show()
    }

    override fun showError(mensaje: String) {
        Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show()
    }
}