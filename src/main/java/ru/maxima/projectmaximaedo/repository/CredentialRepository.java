package ru.maxima.projectmaximaedo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.maxima.projectmaximaedo.models.Credential;

public interface CredentialRepository extends JpaRepository<Credential,Long> {
}
