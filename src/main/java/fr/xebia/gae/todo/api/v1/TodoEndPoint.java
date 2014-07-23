package fr.xebia.gae.todo.api.v1;


import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import fr.xebia.gae.todo.api.v1.model.Todo;
import fr.xebia.gae.todo.api.v1.repository.TodoRepository;

import java.util.Collection;

@Api(
    name = "todo",
    version = "v1"
)
public class TodoEndPoint {


    @ApiMethod(name = "list", httpMethod = ApiMethod.HttpMethod.GET, path="list")
    public Collection<Todo> getTodos() {
        return TodoRepository.getInstance().findTodos();
    }


}
