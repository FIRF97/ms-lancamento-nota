package com.lancamento.nota.helper.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseMessage {
    public static ResponseEntity<?> getToogleStatus(){
        String message = "Estado atualizado com sucesso";
        return message(HttpStatus.OK, message);
    }

    public static ResponseEntity<?> getSave(){
        String message = "Registro realizado com sucesso";
        return message(HttpStatus.CREATED, message);
    }

    public static ResponseEntity<?> getUpdate(){
        String message = "Registro realizado com sucesso";
        return message(HttpStatus.OK, message);
    }

    public static ResponseEntity<?> getNotFound(){
        String message = "Não foi encontrado nenhum registo";
        return message(HttpStatus.NOT_FOUND, message);
    }

    public static ResponseEntity<?> getNotFound(String detalhe){
        String message = "Não foi encontrado nenhum registo " + detalhe;
        return message(HttpStatus.NOT_FOUND, message);
    }

    public static ResponseEntity<?> getDuplicate(){
        String message = "Registo duplicado";
        return message(HttpStatus.CONFLICT, message);
    }

    public static ResponseEntity<?> getDuplicate(String detalhe){
        String message = "Não foi possível registar devido a campos duplicados " + detalhe;
        return message(HttpStatus.CONFLICT, message);
    }

    public static ResponseEntity<?> getDelete(){
        String message = "Registo eliminado com sucesso";
        return message(HttpStatus.OK, message);
    }

    public static ResponseEntity<?> getDelete(String detalhe){
        String message = "Não foi possível eliminar o registo " + detalhe;
        return message(HttpStatus.OK, message);
    }

    private static ResponseEntity<?> message(HttpStatus status, String message){
        return ResponseEntity.status(status).body(message);
    }
}
