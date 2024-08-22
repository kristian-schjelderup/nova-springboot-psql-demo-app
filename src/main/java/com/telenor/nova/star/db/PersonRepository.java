package com.telenor.nova.star.db;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.jta.JtaTransactionManager;

public interface PersonRepository extends JpaRepository<Person, String> {
}
