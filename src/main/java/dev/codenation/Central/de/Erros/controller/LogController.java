package dev.codenation.Central.de.Erros.controller;

import dev.codenation.Central.de.Erros.model.Log;
import dev.codenation.Central.de.Erros.service.Impl.LogServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/logs")
public class LogController {

    public LogController(LogServiceImpl logService) {
        this.logService = logService;
    }

    private final LogServiceImpl logService;

    //create
    @PostMapping
    public Log create(@RequestBody Log log) {
        return logService.create(log);
    }
    //getAll
    //getById
    //getByFilter
}
