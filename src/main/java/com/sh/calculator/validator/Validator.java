package com.sh.calculator.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    private static String OPERATION_REGEXP = "\\+|\\-|\\*|\\/|\\=";
    private static String OPERAND_REGEXP = "\\d+";

    public static boolean isOperationSimple(String operation) {
        if (operation == null) {
            return false;
        } else if (operation.length() == 0) {
            return false;
        }
        Pattern pattern = Pattern.compile(OPERATION_REGEXP);
        Matcher matcher = pattern.matcher(operation);

        return matcher.matches();
    }

    public static boolean isOperand(String operand) {
        if (operand == null) {
            return false;
        } else if (operand.length() == 0) {
            return false;
        }
        Pattern pattern = Pattern.compile(OPERAND_REGEXP);
        Matcher matcher = pattern.matcher(operand);

        return matcher.matches();
    }
}
