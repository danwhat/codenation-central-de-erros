package dev.codenation.Central.de.Erros.service.Interfaces;

import dev.codenation.Central.de.Erros.model.Log;

public interface LogServiceInterface {

    Log create(Log log);

    Log getAll();

    Log getById(Long id);

    Log getByFilter();
}
