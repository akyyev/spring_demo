package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

import java.util.UUID;

public class Person {

    private final UUID ID;

    @Valid
    @NotBlank
    private final String name;

    public Person(@JsonProperty("id") UUID ID,
                  @JsonProperty("name") String name) {
        this.ID = ID;
        this.name = name;
    }

    public UUID getID() {
        return ID;
    }

    public String getName() {
        return name;
    }
}
