package com.example.calculator.interactors

import android.util.Log
import com.example.calculator.interfaces.IOperationInteractor
import com.example.calculator.interfaces.IOperationPresenter
import java.lang.Exception

class OperationInteractor(presenter: IOperationPresenter): IOperationInteractor {
    private var resultado: Int = 0
    private val _presenter: IOperationPresenter;

    init {
        _presenter = presenter
    }

    override fun add(num1: Int, num2: Int) {
        resultado = num1.plus(num2)
        _presenter.showResultado(resultado)
    }

    override fun subtract(num1: Int, num2: Int) {
        resultado = num1.minus(num2)
        _presenter.showResultado(resultado)
    }

    override fun multiply(num1: Int, num2: Int) {
        resultado = num1 * num2
        _presenter.showResultado(resultado)
    }

    override fun divide(num1: Int, num2: Int) {
        try {
            resultado = num1.div(num2)
            _presenter.showResultado(resultado)
        } catch (e: Exception) {
            _presenter.showError("La división entre cero no es posible.")
            Log.i("división", e.message)
        }
    }
}