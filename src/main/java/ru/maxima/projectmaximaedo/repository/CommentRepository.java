package ru.maxima.projectmaximaedo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.maxima.projectmaximaedo.models.Comment;

public interface CommentRepository  extends JpaRepository<Comment, Long> {
}
