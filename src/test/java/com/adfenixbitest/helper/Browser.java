package com.adfenixbitest.helper;

public enum Browser {
	FIREFOX,CHROME,IE;
	public static Browser browserForName(String browser) throws IllegalArgumentException{
        for(Browser b: values()){
    		if(b.toString().equalsIgnoreCase(browser)){
    			return b;
    		}
        }
        throw browserNotFound(browser);
    }
	 private static IllegalArgumentException browserNotFound(String outcome) {
	        return new IllegalArgumentException(("Invalid browser [" + outcome + "]"));
	    }

}
