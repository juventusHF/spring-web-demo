package com.example.demo.persistence;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/*
@Repository markiert diese Klasse als Repository Komponente in Spring.
Von ihr wird automatisch eine Instanz erzeugt (singleton) und im ApplicationContext registriert.
Der ApplicationContext verwaltet alle Beans (von Spring verwaltete Objekte) und ist unter anderem für DI zuständig.
Repositories werden üblicherweise dazu verwendet, um mit persistenten Daten zu interagieren.
 */
@Repository
public class InMemoryDatabase implements Database {

    private final List<String> greetings;

    public InMemoryDatabase() {
        greetings = new ArrayList<>(List.of(
                "Hallo",
                "Hello",
                "Bonjour",
                "Ciao",
                "Hola"
        ));
    }

    @Override
    public String getGreeting() {
        int randomIndex = (int) (Math.random() * greetings.size());
        return greetings.get(randomIndex);
    }
}

