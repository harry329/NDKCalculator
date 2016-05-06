package com.developer.harry.ndkcalculator;

/**
 * Created by harry on 5/5/16.
 */
public class NativeLibrary {

    public native int addOperation(int value1, int value2);

    public native int subOperation(int value1, int value2);

    public native int multOperation(int value1, int value2);

    public native int divOperation(int value1,int value2);


    public int result(String operation, int value1, int value2){
        int result = 0;
        if (operation.toString().equals("+")) {
            result = addOperation(number1, number2);
        }
        if (operation.equals("-")) {
            result = minusOperation(number1, number2);
        }
        if (operation.equals("*")) {
            result = multiOperation(number1, number2);
        }
        if (operation.equals("/")) {
            result = divideOperation(number1, number2);
        }
        return result;

    }



}
