package com.example.calculator.presenters

import android.view.View
import com.example.calculator.interactors.OperationInteractor
import com.example.calculator.interfaces.IOperationPresenter
import com.example.calculator.interfaces.IOperationInteractor
import com.example.calculator.interfaces.IOperationView

class OperationPresenter(view: IOperationView): IOperationPresenter {
    private var interactor: IOperationInteractor
    private var _view: IOperationView

    init {
        _view = view
        interactor = OperationInteractor(this)
    }

    override fun add(num1: Int, num2: Int) {
        interactor.add(num1, num2)
    }

    override fun subtract(num1: Int, num2: Int) {
        interactor.subtract(num1, num2)
    }

    override fun multiply(num1: Int, num2: Int) {
        interactor.multiply(num1, num2)
    }

    override fun divide(num1: Int, num2: Int) {
        interactor.divide(num1, num2)
    }

    override fun showResultado(resultado: Int) {
        _view.showResutado(resultado)
    }

    override fun showError(mensaje: String) {
        _view.showError(mensaje)
    }
}