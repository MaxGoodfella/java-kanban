package finaltask.tasks;

public class Task {
    protected Integer id;
    protected String name;
    protected String description;
    protected String status;


    public Task(String name, String description, String status) {
        this.name = name;
        this.description = description;
        this.status = status;
    }


    public Task(String name, String description) {
        this.name = name;
        this.description = description;
        this.status = "NEW";
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

}
    // Почему их сравнение можно не создавать?
    // Потому что в любом случае всё сравнение будет происходить через id, то есть другие поля не задействуются
    // Соответственно, их сравнивать необязательно

/*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(id, task.id) && Objects.equals(name, task.name) && Objects.equals(description, task.description) && Objects.equals(status, task.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, status);
    }
 */

