package br.com.erudio.controller

import br.com.erudio.math.SimpleMath
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong
import kotlin.math.sqrt

@RestController
class MathController {
    @RequestMapping(value = ["/sum/{numberOne}/{numberTwo}"])
    fun sum(@PathVariable(value="numberOne") numberOne: Double,
            @PathVariable(value="numberTwo") numberTwo: Double): Double {
        return SimpleMath.sum(numberOne, numberTwo)
    }

    @RequestMapping(value = ["/subtract/{numberOne}/{numberTwo}"])
    fun subtract(@PathVariable(value="numberOne") numberOne: Double,
                 @PathVariable(value="numberTwo") numberTwo: Double): Double {
        return SimpleMath.subtract(numberOne, numberTwo)
    }

    @RequestMapping(value = ["/multiply/{numberOne}/{numberTwo}"])
    fun multiply(@PathVariable(value="numberOne") numberOne: Double,
                 @PathVariable(value="numberTwo") numberTwo: Double): Double {
        return SimpleMath.multiply(numberOne, numberTwo)
    }

    @RequestMapping(value = ["/divide/{numberOne}/{numberTwo}"])
    fun divide(@PathVariable(value="numberOne") numberOne: Double,
               @PathVariable(value="numberTwo") numberTwo: Double): Double {
        return SimpleMath.divide(numberOne, numberTwo)
    }

    @RequestMapping(value = ["/avg/{numberOne}/{numberTwo}"])
    fun avg(@PathVariable(value="numberOne") numberOne: Double,
            @PathVariable(value="numberTwo") numberTwo: Double): Double {
        return SimpleMath.avg(numberOne, numberTwo)
    }

    @RequestMapping(value = ["/square/{number}"])
    fun square(@PathVariable(value="number") number: Double): Double {
        return SimpleMath.sqrt(number)
    }
}