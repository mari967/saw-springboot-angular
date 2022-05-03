package com.bezkoder.spring.security.postgresql.repository;

import java.util.List;

import com.bezkoder.spring.security.postgresql.models.tutorial.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
  List<Tutorial> findByPublished(boolean published);

  List<Tutorial> findByTitleContaining(String title);
}
