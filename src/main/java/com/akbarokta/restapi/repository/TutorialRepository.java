package com.akbarokta.restapi.repository;

import com.akbarokta.restapi.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
    List<Tutorial> findByPublished(Boolean published);
    List<Tutorial> findByTitleContaining(String title);
}
