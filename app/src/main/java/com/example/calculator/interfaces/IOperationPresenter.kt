package com.example.calculator.interfaces

interface IOperationPresenter {
    fun add(num1: Int, num2: Int)
    fun subtract(num1: Int, num2: Int)
    fun multiply(num1: Int, num2: Int)
    fun divide(num1: Int, num2: Int)
    fun showResultado(resultado: Int)
    fun showError(mensaje: String)
}