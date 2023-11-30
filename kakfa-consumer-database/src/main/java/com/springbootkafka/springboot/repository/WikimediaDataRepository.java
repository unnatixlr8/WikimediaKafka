package com.springbootkafka.springboot.repository;

import com.springbootkafka.springboot.entity.WikimediaData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WikimediaDataRepository extends JpaRepository<WikimediaData, Long> {

}
