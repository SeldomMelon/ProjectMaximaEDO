package ru.maxima.projectmaximaedo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.maxima.projectmaximaedo.models.Document;

public interface DocumentRepository extends JpaRepository<Document,Long> {
}
