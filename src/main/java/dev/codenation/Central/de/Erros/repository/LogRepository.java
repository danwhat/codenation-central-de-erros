package dev.codenation.Central.de.Erros.repository;

import dev.codenation.Central.de.Erros.model.Log;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRepository extends JpaRepository<Log, Long> {
}
