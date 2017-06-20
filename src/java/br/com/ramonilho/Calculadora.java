/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ramonilho;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author ramonilho
 */
@WebService(serviceName = "Calculadora")
@Stateless()
public class Calculadora {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Soma")
    public double Soma(@WebParam(name = "a") double a, @WebParam(name = "b") double b) {
        //TODO write your implementation code here:
        return a + b;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Subtracao")
    public double Subtracao(@WebParam(name = "a") double a, @WebParam(name = "b") double b) {
        //TODO write your implementation code here:
        return a - b;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Multiplicacao")
    public double Multiplicacao(@WebParam(name = "a") double a, @WebParam(name = "b") double b) {
        //TODO write your implementation code here:
        return a * b;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Divisao")
    public double Divisao(@WebParam(name = "a") double a, @WebParam(name = "b") double b) {
        //TODO write your implementation code here:
        return a / b;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Calculate")
    public double Calculate(@WebParam(name = "a") double a, @WebParam(name = "b") double b, @WebParam(name = "o") String o) {
        //TODO write your implementation code here:
        
        switch (o) {
            case "+":
                return a+b;
            case "-":
                return a-b;
            case "*":
                return a*b;
            case "/":
                return a/b;
        }
        
        return -1;
    }
}
