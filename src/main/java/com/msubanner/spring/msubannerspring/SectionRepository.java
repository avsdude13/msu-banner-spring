package com.msubanner.spring.msubannerspring;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface SectionRepository extends CrudRepository<Section,Long>{

}
