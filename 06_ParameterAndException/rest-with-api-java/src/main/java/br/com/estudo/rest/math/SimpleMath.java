package br.com.estudo.rest.math;

import br.com.estudo.rest.exceptions.UnsupportedMathOoperationException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import static br.com.estudo.rest.converters.NumberConverter.convertToDouble;
import static br.com.estudo.rest.converters.NumberConverter.isNumeric;

public class SimpleMath {

    public Double sum(Double numberOne, Double numberTwo) {
        return numberOne + numberTwo;
    }

    public Double sub(Double numberOne, Double numberTwo) {
        return numberOne - numberTwo;
    }

    public Double mult(Double numberOne, Double numberTwo) {
        return numberOne * numberTwo;
    }

    public Double div(Double numberOne, Double numberTwo) {
        return numberOne / numberTwo;
    }

    public Double med(Double numberOne, Double numberTwo) {
        return (numberOne + numberTwo) / 2;
    }

    public Double quad(Double numberOne, Double numberTwo) {
        return Math.sqrt(numberOne + numberTwo);
    }
}
