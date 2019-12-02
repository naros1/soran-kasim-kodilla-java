package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.Action;
import java.util.List;

@Service
public final class SerchFacade {
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;
    private static final Logger LOGGER = LoggerFactory.getLogger(SerchFacade.class);

    public void serchEmployee(final String letters)
            throws SerchProcessingException {
        boolean wasError = false;
        LOGGER.info("Starting employees srech with: " + letters);
        List<Employee> result = employeeDao.retriveEmployesWithLetters("%" + letters + "%");
        if (result.size() == 0){
            LOGGER.error(SerchProcessingException.ERR_NO_RESULT_EMPLYEE);
            wasError = true;
            throw new SerchProcessingException(SerchProcessingException.ERR_NO_RESULT_EMPLYEE);
        }
        LOGGER.info("Srech finished successful");
        System.out.println("Serch result: ");
        for (Employee employees : result
             ) {
            System.out.println(employees.getLastname() + ", " + employees.getFirstname());
        }
    }

    public void serchComapany(final String letters)
            throws SerchProcessingException {
        boolean wasError = false;
        LOGGER.info("Starting companies srech with: " + letters);
        List<Company> result = companyDao.retriveCompantWithLetters("%" + letters + "%");
        if (result.size() == 0){
            LOGGER.error(SerchProcessingException.ERR_NO_RESULT_COMAPNY);
            wasError = true;
            throw new SerchProcessingException(SerchProcessingException.ERR_NO_RESULT_COMAPNY);
        }
        LOGGER.info("Srech finished successful");
        System.out.println("Serch result: ");
        for (Company companies : result
        ) {
            System.out.println(companies.getName());
        }
    }
}
