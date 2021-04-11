package dev.codenation.Central.de.Erros.controller;

import dev.codenation.Central.de.Erros.model.Log;
import dev.codenation.Central.de.Erros.service.Impl.LogServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @GetMapping
    public List<Log> getAll() {
        return logService.getAll();
    }
    //getById
    //getByFilter
}
