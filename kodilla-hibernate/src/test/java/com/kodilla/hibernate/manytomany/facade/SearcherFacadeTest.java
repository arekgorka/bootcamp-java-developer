package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class SearcherFacadeTest {

    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    SearcherFacade searcherFacade;

    @Test
    public void searchingCompanyTest() {

        companyDao.save(new Company("SpaceX"));
        companyDao.save(new Company("SpaceCraft"));
        companyDao.save(new Company("Microsoft"));
        companyDao.save(new Company("Best software"));
        searcherFacade.findCompany("%ace%");

        companyDao.deleteAll();
    }

    @Test
    public void searchingEmployeeTest() {

        employeeDao.save(new Employee("John","Smith"));
        employeeDao.save(new Employee("Meredith","Black"));
        employeeDao.save(new Employee("Jesus", "Navas"));
        employeeDao.save(new Employee("Naomi", "Thriss"));
        searcherFacade.findEmployee("%ith%");

        employeeDao.deleteAll();
    }
}
