package fr.xebia.gae.todo.api.v1.model;

public class Todo {

    private Long id;
    private String title;
    private boolean completed;


    public Todo(String title, boolean completed) {
        this.title = title;
        this.completed = completed;
    }

    public Todo(Long id, String title, boolean completed) {
        this.id = id;
        this.title = title;
        this.completed = completed;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
