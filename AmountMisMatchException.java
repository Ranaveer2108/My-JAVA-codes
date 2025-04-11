package com.collection;

public class AmountMisMatchException extends Exception{
             String str;
             
             public AmountMisMatchException(String message) {
            	 super(message);
             }
}
