package com.company.barmanager.repository;


import com.company.barmanager.model.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
  public interface TypeRepository extends JpaRepository<Type, Long> {
  }

