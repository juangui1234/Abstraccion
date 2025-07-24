package controller;

import dao.PersonaDAO;
import model.Persona;
import model.Propietario;
import model.Veterinario;

import java.util.ArrayList;
import java.util.List;

public class PersonaController {
    private final PersonaDAO dao;
    //private List<Persona> personas;
    private List<Persona> personas = new ArrayList<>();

    public PersonaController() {
        this.dao = new PersonaDAO();
        this.personas = dao.cargarPersonas();
    }

    public List<Persona> listar() {
        return personas;
    }
    public static boolean validarPersona(String nombre, String documento) {
        return nombre != null && !nombre.isEmpty() && documento != null && documento.matches("\\d+");
    }

    public void agregar(Persona persona) {

        personas.add(persona);
        dao.guardarPersonas(personas);
    }

    public void eliminarPorIdentificacion(String id) {
        personas.removeIf(p -> p.getIdentificacion().equals(id));
        dao.guardarPersonas(personas);
    }
}
