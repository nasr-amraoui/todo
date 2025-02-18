package com.example.yourtodo.data

import java.time.Instant
import java.util.Date

data class TodoItem(
    val id: Long,
    val text: String,
    val date: Date
)

fun fakeTodoList(): List<TodoItem>{
    return listOf(
        TodoItem(0, "Make a video 1", Date.from(Instant.now())),
        TodoItem(1, "Make a video 2", Date.from(Instant.now())),
        TodoItem(2, "Make a video 3", Date.from(Instant.now())),
        TodoItem(3, "Make a video 4", Date.from(Instant.now())),
        TodoItem(4, "Make a video 3", Date.from(Instant.now())),
        TodoItem(5, "Make a video 4", Date.from(Instant.now())),
        TodoItem(6, "Make a video 3", Date.from(Instant.now())),
        TodoItem(7, "Make a video 4", Date.from(Instant.now())),
        TodoItem(8, "Make a video 3", Date.from(Instant.now())),
        TodoItem(9, "Make a video 4", Date.from(Instant.now())),
        TodoItem(10, "Make a video 3", Date.from(Instant.now())),
        TodoItem(11, "Make a video 4", Date.from(Instant.now())),
        TodoItem(12, "Make a video 3", Date.from(Instant.now())),
        TodoItem(13, "Make a video 4", Date.from(Instant.now())),
        TodoItem(14, "Make a video 3", Date.from(Instant.now())),
        TodoItem(15, "Make a video 4", Date.from(Instant.now()))
    )
}