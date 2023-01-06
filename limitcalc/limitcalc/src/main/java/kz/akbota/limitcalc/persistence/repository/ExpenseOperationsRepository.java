package kz.akbota.limitcalc.persistence.repository;

import kz.akbota.limitcalc.persistence.entity.ExpenseOperations;
import liquibase.pro.packaged.T;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseOperationsRepository extends JpaRepository<ExpenseOperations, String> {

}
