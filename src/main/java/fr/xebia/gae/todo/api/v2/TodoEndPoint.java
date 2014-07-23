package fr.xebia.gae.todo.api.v2;


import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.Named;
import fr.xebia.gae.todo.api.v2.model.Todo;
import fr.xebia.gae.todo.api.v2.repository.TodoRepository;

import java.util.Collection;

@Api(
    name = "todos",
    version = "v2",
    scopes = {Constants.EMAIL_SCOPE},
    clientIds = {Constants.WEB_LOCALHOST_CLIENT_ID, Constants.WEB_CLIENT_ID, Constants.API_EXPLORER_CLIENT_ID}
)
public class TodoEndPoint {

    @ApiMethod(name = "list", httpMethod = ApiMethod.HttpMethod.GET, path="list")
    public Collection<Todo> getTodos() {
        return TodoRepository.getInstance().findTodos();
    }

    @ApiMethod(name = "create", httpMethod =  ApiMethod.HttpMethod.POST, path="create")
    public Todo create(Todo todo) {
        return TodoRepository.getInstance().create(todo);
    }

    @ApiMethod(name = "update", httpMethod =  ApiMethod.HttpMethod.PUT, path="update")
    public Todo update(Todo editedTodo) {
        return TodoRepository.getInstance().update(editedTodo);
    }

    @ApiMethod(name = "remove", httpMethod = ApiMethod.HttpMethod.DELETE, path="remove")
    public void remove(@Named("id") Long id) {
        TodoRepository.getInstance().remove(id);
    }

}
