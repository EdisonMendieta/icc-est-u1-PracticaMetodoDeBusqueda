package controllers;

import models.Person;

public class PersonaController {

    private Person persona;

    public PersonaController() {
    }

    public PersonaController(Person persona) {
        this.persona = persona;
    }

    public Person getPersona() {
        return persona;
    }

    public void setPersona(Person persona) {
        this.persona = persona;
    }
}