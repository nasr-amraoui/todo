package com.example.yourtodo.data

import java.time.Instant
import java.util.Date

data class TodoItem(
    val id: Long,
    val text: String,
    val date: Date
)

fun fakeTodoList(): List<TodoItem>{
    return listOf<TodoItem>(
        TodoItem(0, "Make a video 1", Date.from(Instant.now())),
        TodoItem(1, "Make a video 2", Date.from(Instant.now())),
        TodoItem(2, "Make a video 3", Date.from(Instant.now())),
        TodoItem(3, "Make a video 4", Date.from(Instant.now()))
    )
}