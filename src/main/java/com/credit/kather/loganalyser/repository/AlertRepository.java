package com.credit.kather.loganalyser.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.credit.kather.loganalyser.model.persistence.Alert;

@Repository
public interface AlertRepository extends CrudRepository<Alert, String> {
}
