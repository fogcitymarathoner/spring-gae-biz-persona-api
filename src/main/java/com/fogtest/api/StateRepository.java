package com.fogtest.api;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository  extends CrudRepository<State, Long> {

}
