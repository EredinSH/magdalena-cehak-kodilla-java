package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
class CompanyDaoTestSuite {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    void testSaveManyToMany() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        assertNotEquals(0, softwareMachineId);
        assertNotEquals(0, dataMaestersId);
        assertNotEquals(0, greyMatterId);

        //CleanUp
        //try {
        //    companyDao.deleteById(softwareMachineId);
        //    companyDao.deleteById(dataMaestersId);
        //    companyDao.deleteById(greyMatterId);
        //} catch (Exception e) {
        //    //do nothing
        //}
    }

    @Test
    void testNewQueries() {

        //GIVEN
        Employee employee1 = new Employee("Jim", "Halpert");
        Employee employee2 = new Employee("Pam", "Beesly");
        Employee employee3 = new Employee("Dwight", "Shrute");

        Company company1 = new Company("Dunder Muffin");
        Company company2 = new Company("Michael Scott Paper Company");

        company1.getEmployees().add(employee1);
        company1.getEmployees().add(employee2);
        company1.getEmployees().add(employee3);
        company2.getEmployees().add(employee2);

        employee1.getCompanies().add(company1);
        employee2.getCompanies().add(company1);
        employee2.getCompanies().add(company2);
        employee3.getCompanies().add(company1);

        //WHEN
        companyDao.save(company1);
        companyDao.save(company2);
        List<Employee> listOfEmployees = employeeDao.findByLastname("Halpert");
        List<Company> listOfCompanies = companyDao.nameFragment("Dun");

        //THEN
        try {
            assertEquals(1, listOfEmployees.size());
            assertEquals(1, listOfCompanies.size());
        } finally {
            //CLEANUP
            employeeDao.deleteAll();
            companyDao.deleteAll();
        }
    }

}
