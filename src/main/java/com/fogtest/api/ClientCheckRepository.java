package com.fogtest.api;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientCheckRepository extends CrudRepository<ClientCheck, Long> {

}
