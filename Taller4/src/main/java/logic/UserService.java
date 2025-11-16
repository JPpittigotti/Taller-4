package main.java.logic;
import main.java.data.UserRepository;

// contiene la lógica de negocio (crear, listar, eliminar usuarios).


public class UserService {

    private final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public String registerUser(String name) {
        if (repo.exists(name)) {
            return "El usuario ya existe.";
        }
        repo.addUser(name);
        return "Usuario registrado correctamente.";
    }

    public void showUsers() {
        System.out.println("Usuarios registrados:");
        for (String user : repo.getAllUsers()) {
            System.out.println("- " + user);
        }
    }
}

