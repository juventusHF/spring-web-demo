package com.example.demo.service;

import com.example.demo.persistence.Database;
import org.springframework.stereotype.Service;

/*
@Service markiert diese Klasse als Service Komponente in Spring.
Von ihr wird automatisch eine Instanz erzeugt (singleton) und im ApplicationContext registriert.
Der ApplicationContext verwaltet alle Beans (von Spring verwaltete Objekte) und ist unter anderem für DI zuständig.
In Services wird üblicherweise die Business Logik einer Applikation implementiert.

Dependency Injection: Beim Erzeugen einses DefaultHelloService wird eine Instanz von Database automatisch eingefügt.
 */
@Service
public class DefaultHelloService implements HelloService {

    private final Database database;

    public DefaultHelloService(Database database) {
        this.database = database;
    }

    @Override
    public String getGreeting() {
        return database.getGreeting();
    }
}
