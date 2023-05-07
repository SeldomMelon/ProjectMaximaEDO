package ru.maxima.projectmaximaedo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.maxima.projectmaximaedo.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
