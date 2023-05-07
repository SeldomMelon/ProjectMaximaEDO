package ru.maxima.projectmaximaedo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.maxima.projectmaximaedo.models.Partner;

public interface PartnerRepository extends JpaRepository<Partner, Long> {
}
