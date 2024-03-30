package com.cursoSpringBoot.curso.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(Object id) {
        super("Resource nor found. Id" + id);
    }
}
