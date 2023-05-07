package ru.maxima.projectmaximaedo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.maxima.projectmaximaedo.models.File;

public interface FileRepository extends JpaRepository<File, Long> {
}
