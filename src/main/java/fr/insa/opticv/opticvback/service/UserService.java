package fr.insa.opticv.opticvback.service;

import fr.insa.opticv.opticvback.entity.User;
import fr.insa.opticv.opticvback.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public User getUserByEmail(String email) {
        return repo.findByEmail(email);
    }

    public User save(User user) {
        return repo.save(user);
    }
}
