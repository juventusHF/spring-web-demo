package com.example.demo.controller;

import com.example.demo.service.HelloService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * @RestController markiert diese Klasse als einen Controller für REST API's.
 * D.h. sie wird von Spring MVC verwendet um Requests entgegenzunehmen.
 *
 * @GetMapping("/") verbindet den Pfad "/" mit der index() Methode.
 * Wenn eine Anfrage vom Browser (oder Kommandozeile z.B. mit curl) kommt, die auf den Pfad "/" passt,
 * wird die index() Methode aufgerufen. Die Begrüssung wird als Text zurückgegeben.
 *
 * Dependency Injection: Beim Erzeugen eines HelloController wird eine Instanz vom HelloService automatisch eingefügt.
 *
 * Swagger Annotationen: @Tag und @Operation beschreiben die API und Endpunkte. Diese Beschreibungen sind im Swagger UI ersichtlich.
 * Json definition: http://localhost:8080/v3/api-docs
 * Swagger UI: http://localhost:8080/swagger-ui/index.html
 */
@RestController
@Tag(name = "Greetings API")
public class HelloController {

    private final HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/")
    @Operation(summary = "Returns a random greeting")
    public ResponseEntity<String> index() {
        return ResponseEntity.ok(helloService.getGreeting());
    }

}
