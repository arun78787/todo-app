package net.javaguides.todo.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public class TodoAPIException extends RuntimeException {
    private final HttpStatus status;

    public TodoAPIException(HttpStatus status, String message) {
        super(message); // correctly pass message to RuntimeException
        this.status = status;
    }
}

