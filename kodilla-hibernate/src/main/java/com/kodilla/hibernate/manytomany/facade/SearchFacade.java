package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchFacade {

    private static final Logger LOGGER = LoggerFactory.getLogger(SearchFacade.class);

    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    public List<Company> searchCompany(final String nameFragment) throws SearchException {

        List<Company> companies = companyDao.nameFragment(nameFragment);
        LOGGER.info("Searching for a company by name fragment..");
        if (companies.size() == 0) {
            LOGGER.error(SearchException.ERR_COMPANY_NAME);
        }
        return companies;

    }

    public List<Employee> searchEmployee(final String fragment) throws  SearchException{

        List<Employee> employees = employeeDao.fragment(fragment);
        LOGGER.info("Searching for a employee by name fragment..");
        if (employees.size() == 0) {
            LOGGER.error(SearchException.ERR_EMPLOYEE_NAME);
        }
        return employees;

    }

}
