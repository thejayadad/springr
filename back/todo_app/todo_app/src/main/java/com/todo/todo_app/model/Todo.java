package com.todo.todo_app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Todo {

    private @Id @GeneratedValue Long id;
    private String content;

    Todo(String string){}


    public Todo(Long id, String todo) {
        this.id = id;
        this.content = content;
    }


}
