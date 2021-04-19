package dev.codenation.Central.de.Erros.service.Interfaces;

import dev.codenation.Central.de.Erros.model.Log;

import java.util.List;
import java.util.Optional;

public interface LogServiceInterface {

    Log create(Log log);

    List<Log> getAll();

    Optional<Log> getById(Long id);

    List<Log> getByFilter(String filter, String value);
}
