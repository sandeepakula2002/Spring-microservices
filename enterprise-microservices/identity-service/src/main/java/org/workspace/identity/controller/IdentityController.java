package org.workspace.identity.controller;

import org.workspace.identity.model.UserProfile;
import org.workspace.identity.repository.IdentityRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class IdentityController {

    private final IdentityRepository repo;

    public IdentityController(IdentityRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<UserProfile> getAll() {
        return repo.findAll();
    }

    @PostMapping
    public UserProfile create(@RequestBody UserProfile user) {
        return repo.save(user);
    }
}
