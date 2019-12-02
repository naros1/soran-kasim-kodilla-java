package com.kodilla.hibernate.manytomany.facade;

public class SerchProcessingException extends Exception {

    public static String ERR_NO_RESULT_COMAPNY = "No company was found";
    public static String ERR_NO_RESULT_EMPLYEE = "No employee was found";

    public SerchProcessingException(String message) {
        super(message);
    }
}
