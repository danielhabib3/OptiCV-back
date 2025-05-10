package fr.insa.opticv.opticvback.controller;

import fr.insa.opticv.opticvback.service.CleanDatabaseService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
//@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class CleanDatabaseController {
    private final CleanDatabaseService cleanDatabaseService;

    public CleanDatabaseController(CleanDatabaseService cleanDatabaseService) {
        this.cleanDatabaseService = cleanDatabaseService;
    }

    @RequestMapping("/clean-database")
    public void cleanDatabase() {
        cleanDatabaseService.cleanDatabase();
    }
}
