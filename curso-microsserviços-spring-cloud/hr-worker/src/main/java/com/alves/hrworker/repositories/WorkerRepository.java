package com.alves.hrworker.repositories;

import com.alves.hrworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
