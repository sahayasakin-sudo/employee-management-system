package com.example.ems;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeRepository repo;

    public EmployeeController(EmployeeRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Employee> all() { return repo.findAll(); }

    @PostMapping
    public Employee create(@RequestBody Employee e) { return repo.save(e); }
}
