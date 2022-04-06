package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class SearchFacadeTest {

    @Autowired
    SearchFacade searchFacade;

    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void searchCompanyTest() throws SearchException{

        //GIVEN
        Company company1 = new Company("Samsung");
        Company company2 = new Company("Empik");
        Company company3 = new Company("Supersam");
        companyDao.save(company1);
        companyDao.save(company2);
        companyDao.save(company3);

        //WHEN
        List<Company> companies = searchFacade.searchCompany("sam");

        //THEN
        assertEquals(2,companies.size());

        //CLEANUP
        companyDao.delete(company1);
        companyDao.delete(company2);
        companyDao.delete(company3);


    }

    @Test
    public void searchEmployeeTest() throws  SearchException {

        //GIVEN
        Employee employee1 = new Employee("Katsuki","Bakugo");
        Employee employee2 = new Employee("Toya","Todoroki");
        Employee employee3 = new Employee("Kai","Chisaki");
        Employee employee4 = new Employee("Shota","Aizawa");
        employeeDao.save(employee1);
        employeeDao.save(employee2);
        employeeDao.save(employee3);
        employeeDao.save(employee4);

        //WHEN
        List<Employee> employees = searchFacade.searchEmployee("saki");

        //THEN
        assertEquals(1,employees.size());

        //CLEANUP
        employeeDao.delete(employee1);
        employeeDao.delete(employee2);
        employeeDao.delete(employee3);
        employeeDao.delete(employee4);

    }

}
