package com.pifss.pifsssoapapp.dao;


import com.pifss.pifsssoapapp.entities.Pension;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface IPensionDAO extends JpaRepository<Pension, String> {


}
