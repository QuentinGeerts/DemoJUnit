package be.bstorm;

import java.util.Objects;

public class Task {

    private String description;
    private boolean completed;

    public Task ( ) {
    }


    public Task ( String description ) {
        this.description = description;
        this.completed = false;
    }

    public String getDescription ( ) {
        return description;
    }

    public boolean isCompleted ( ) {
        return completed;
    }

    public void markAsCompleted ( ) {
        completed = true;
    }

    @Override
    public boolean equals ( Object obj ) {
        if ( this == obj ) return true;
        if ( obj == null || getClass ( ) != obj.getClass ( ) ) return false;
        Task task = (Task) obj;
        return completed == task.completed && Objects.equals ( description, task.description );
    }

    @Override
    public int hashCode ( ) {
        return Objects.hash ( description, completed );
    }
}
