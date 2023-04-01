package com.todo.todo_app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DemoLoader implements CommandLineRunner {

    private final TodoRepository repository;

    @Autowired
    public DemoLoader(TodoRepository repository){
        this.repository = repository;

    }

    @Override
    public void run (String... strings) throws Exception{
        this.repository.save(new Todo("Exercise"));
    }

}
