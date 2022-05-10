package com.company.barmanager.repository;

import com.company.barmanager.model.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {
  List<Sale> getSaleByBarId(Long id);
}
