package com.kodilla.hibernate.manytomany.facade;

public class SearchException extends Exception {

    public static String ERR_COMPANY_NAME = "Company doesn't exist";
    public static String ERR_EMPLOYEE_NAME = "Employee doesn't exist";

    public SearchException(String message) {
        super(message);
    }

}
