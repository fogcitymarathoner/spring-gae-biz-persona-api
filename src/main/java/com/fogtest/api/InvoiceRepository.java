package com.fogtest.api;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface InvoiceRepository extends CrudRepository<Invoice, Long> {

    List<Invoice> findAll();
    List<Invoice> findAllByOrderByDateAsc();
    Optional<Invoice> findById(Long id);
}
