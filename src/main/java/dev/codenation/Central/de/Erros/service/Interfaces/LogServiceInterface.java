package dev.codenation.Central.de.Erros.service.Interfaces;

import dev.codenation.Central.de.Erros.model.Log;

import java.util.List;

public interface LogServiceInterface {

    Log create(Log log);

    List<Log> getAll();

    Log getById(Long id);

    List<Log> getByFilter();
}
