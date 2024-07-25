package com.example.composecalculator

sealed class CalculatorAction {
    data class Number(val number: Int): CalculatorAction()
    object Clear: CalculatorAction()
    object Delete: CalculatorAction()
    object Decimal: CalculatorAction()
    object Calculate: CalculatorAction()
//    object Negative: CalculatorAction()
    data class Operation(val operation: CalculatorOperations): CalculatorAction()
}