package main.java.data;

// simula acceso a datos (use una lista estática o simulación de base de datos).

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    private final List<String> usuarios = new ArrayList<>();

    public void addUser(String n) {
        usuarios.add(n);
    }

    public List<String> getAllUsers() {
        return usuarios;
    }

    public boolean exists(String n) {
        return usuarios.contains(n);
    }
}