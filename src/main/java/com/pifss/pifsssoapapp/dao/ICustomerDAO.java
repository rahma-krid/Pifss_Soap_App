package com.pifss.pifsssoapapp.dao;


import com.pifss.pifsssoapapp.entities.Customer;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.Entity;



@CrossOrigin("*")
@RepositoryRestResource
public interface ICustomerDAO  extends JpaRepository<Customer, String> {


}
