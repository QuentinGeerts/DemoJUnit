package be.bstorm;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TaskManagerTest {

    TaskManager taskManager;

    @BeforeEach
    void setUp ( ) {
        taskManager = new TaskManager ( );
    }

    @AfterEach
    void tearDown ( ) {
        taskManager = null;
    }

    @Test
    void shouldReturnTrue_WhenAddTask ( ) {
        // Arrange
        Task task = new Task ( "Task 1" );

        // Action
        boolean actual = taskManager.addTask ( task );
        List<Task> pendingTasks = taskManager.getPendingTasks ( );

        // Assert
        assertTrue ( actual );
        assertEquals ( 1, pendingTasks.size ( ) );
        assertEquals ( "Task 1", pendingTasks.getFirst ( ).getDescription ( ) );
        assertFalse ( pendingTasks.getFirst ( ).isCompleted ( ) );
    }

    @Test
    void shouldReturnTrue_WhenRemoveTask ( ) {
        // Arrange
        Task task = new Task ( "Task 1" );
        taskManager.addTask ( task );

        // Action
        boolean actual = taskManager.removeTask ( "Task 1" );
        List<Task> pendingTasks = taskManager.getPendingTasks ( );

        // Assert
        assertTrue ( actual );
        assertEquals ( 0, pendingTasks.size ( ) );
    }

    @Test
    void shouldReturnFalse_WhenRemoveTask ( ) {
        // Arrange
        Task task = new Task ( "Task 1" );
        taskManager.addTask ( task );

        // Action
        boolean actual = taskManager.removeTask ( "Task 2" );
        List<Task> pendingTasks = taskManager.getPendingTasks ( );

        // Assert
        assertFalse ( actual );
        assertEquals ( 1, pendingTasks.size ( ) );
    }

    @Test
    void shouldReturnTrue_WhenMarkAsCompleted ( ) {
        // Arrange
        Task task = new Task ( "Task 1" );
        taskManager.addTask ( task );

        // Action
        boolean actual = taskManager.markAsCompleted ( "Task 1" );
        List<Task> pendingTasks = taskManager.getPendingTasks ( );
        List<Task> completedTasks = taskManager.getCompletedTasks ( );

        // Assert
        assertTrue ( actual );
        assertEquals ( 0, pendingTasks.size ( ) );
        assertEquals ( 1, completedTasks.size ( ) );
        assertTrue ( completedTasks.getFirst ( ).isCompleted ( ) );
    }

    @Test
    void shouldReturnFalse_WhenMarkAsCompleted ( ) {
        // Arrange
        Task task = new Task ( "Task 1" );
        taskManager.addTask ( task );

        // Action
        boolean actual = taskManager.markAsCompleted ( "Task 2" );
        List<Task> pendingTasks = taskManager.getPendingTasks ( );
        List<Task> completedTasks = taskManager.getCompletedTasks ( );

        // Assert
        assertFalse ( actual );
        assertEquals ( 1, pendingTasks.size ( ) );
        assertEquals ( 0, completedTasks.size ( ) );
        assertFalse( pendingTasks.getFirst ( ).isCompleted ( ) );

    }

}