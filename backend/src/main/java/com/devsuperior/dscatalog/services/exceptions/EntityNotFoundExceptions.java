package com.devsuperior.dscatalog.services.exceptions;

public class EntityNotFoundExceptions extends RuntimeException {
    private static final long SerialVersionUID = 1L;

    public EntityNotFoundExceptions(String msg) {
        super(msg);
    }

}
