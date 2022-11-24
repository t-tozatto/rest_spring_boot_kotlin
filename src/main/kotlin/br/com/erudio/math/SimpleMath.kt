package br.com.erudio.math

class SimpleMath {
    companion object{
        fun sum(numberOne: Double, numberTwo: Double) = numberOne + numberTwo
        fun subtract(numberOne: Double, numberTwo: Double) = numberOne - numberTwo
        fun multiply(numberOne: Double, numberTwo: Double) = numberOne * numberTwo
        fun divide(numberOne: Double, numberTwo: Double) = numberOne / numberTwo
        fun avg(numberOne: Double, numberTwo: Double) = sum(numberOne, numberTwo) / 2
        fun sqrt(number: Double) = kotlin.math.sqrt(number)
    }
}