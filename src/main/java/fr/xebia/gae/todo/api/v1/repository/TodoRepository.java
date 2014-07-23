package fr.xebia.gae.todo.api.v1.repository;


import fr.xebia.gae.todo.api.v1.model.Todo;

import java.util.ArrayList;
import java.util.Collection;

public class TodoRepository {

    private static TodoRepository todoRepository = null;

    private TodoRepository() {
    }

    public static synchronized TodoRepository getInstance() {
        if (null == todoRepository) {
            todoRepository = new TodoRepository();
        }
        return todoRepository;
    }

    public Collection<Todo> findTodos() {
        Collection todos = new ArrayList();
        todos.add(new Todo(new Long(1), "Premier Todo", true));
        todos.add(new Todo(new Long(2), "Second Todo", true));
        todos.add(new Todo(new Long(3), "Troisieme Todo", false));

        return todos;
    }


}
