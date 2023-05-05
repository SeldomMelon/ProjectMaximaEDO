package ru.maxima.projectmaximaedo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.maxima.projectmaximaedo.models.Document;
import ru.maxima.projectmaximaedo.models.DocumentTemplateField;

public interface DocumentTemplateFieldRepository  extends JpaRepository<DocumentTemplateField,Long> {
}
