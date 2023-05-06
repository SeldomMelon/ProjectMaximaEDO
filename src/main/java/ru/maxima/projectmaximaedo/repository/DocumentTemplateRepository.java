package ru.maxima.projectmaximaedo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.maxima.projectmaximaedo.models.DocumentTemplate;

public interface DocumentTemplateRepository extends JpaRepository<DocumentTemplate, Long> {
}
