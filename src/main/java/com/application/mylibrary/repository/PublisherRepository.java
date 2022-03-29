package com.application.mylibrary.repository;

import com.application.mylibrary.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
