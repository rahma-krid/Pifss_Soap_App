package com.pifss.pifsssoapapp.dao;


import com.pifss.pifsssoapapp.entities.CustomerSalary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.math.BigInteger;

@RepositoryRestResource
public interface ICustomerSalaryDAO extends JpaRepository<CustomerSalary, BigInteger> {


}
