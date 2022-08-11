package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.NamedQuery;
import java.util.List;

@Service
public class SearcherFacade {

    private static final Logger LOGGER = LoggerFactory.getLogger(SearcherFacade.class);

    private final CompanyDao companyDao;
    private final EmployeeDao employeeDao;

    @Autowired
    public SearcherFacade(CompanyDao companyDao, EmployeeDao employeeDao) {
        this.companyDao = companyDao;
        this.employeeDao = employeeDao;
    }


    public List<Company> findCompany(String companyName) {
        LOGGER.info("Start searching for company: " + companyName);
        List<Company> companyList = companyDao.findCompanyByString(companyName);
        if (companyList.isEmpty()) {
            LOGGER.info("0 companies were found...");
        } else {
            LOGGER.info("Found companies: ");
            for(Company company :companyList) {
                System.out.println(company.getName());
            }
        }
        LOGGER.info("Searching is finished.");
        return companyList;
    }

    public List<Employee> findEmployee(String name) {
        LOGGER.info("Start searching for employee: " + name);
        List<Employee> employeeList = employeeDao.findEmployeeByString(name);

        if (employeeList.isEmpty()) {
            LOGGER.info("0 employees were found...");
        } else {
            LOGGER.info("Found employees: ");
            for(Employee employee :employeeList) {
                System.out.println(employee.getFirstname() + " " + employee.getLastname());
            }
        }
        LOGGER.info("Searching is finished.");
        return employeeList;
    }
}
