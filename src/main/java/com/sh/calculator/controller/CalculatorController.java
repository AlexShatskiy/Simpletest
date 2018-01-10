package com.sh.calculator.controller;

import com.calculator.Calculator;
import com.calculator.exception.DivideNullException;
import com.calculator.impl.CalculatorImplNew;
import com.sh.calculator.validator.Validator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * handles all get and post requests
 *
 * @author Shatskiy Alex
 * @version 1.0
 */
@Controller
public class CalculatorController {

    private static Calculator calculator = new CalculatorImplNew();

    /**
     * set operand
     *
     * @param arg
     */
    @RequestMapping("setOperand")
    public @ResponseBody
    String setOperand(
            @RequestParam("arg") String arg) {
System.out.println("setOperand");
        if (Validator.isOperand(arg)) {
            Integer argInt = Integer.parseInt(arg);
            calculator.setOperand(argInt);
        }
        return "1";
    }

    /**
     * set operation and execute command
     *
     * @param operation
     */
    @RequestMapping("execute")
    public @ResponseBody
    String execute(
            @RequestParam("operation") String operation) {

        String response;
        try {
            if (Validator.isOperationSimple(operation)) {
                calculator.callOperation(operation);
            } else if ("c".equals(operation)) {
                calculator.clear();
            } else if ("mc".equals(operation)) {
                calculator.clearMemory();
            } else if ("m".equals(operation)) {
                calculator.storeToMemory();
            } else if ("m+".equals(operation)) {
                calculator.addToMemory();
            }

            if ("mr".equals(operation)) {
                response = calculator.readMemory().toString();
            } else {
                response = calculator.getIndicator().toString();
            }
        } catch (DivideNullException e) {
            calculator.clear();
            response = "Cannot divide by zero";
        }
        return response;
    }

    @RequestMapping("test")
    public String home() {
        System.out.println("for test");
        return "redirect:test";
    }
}
