package com.booktracker.data.dto

import com.booktracker.data.entity.Book
import lombok.Getter
import lombok.Setter
import java.time.LocalDate

@Getter
@Setter
data class BookDto(
    val id: Long,

    val title: String,

    val author: String,

    val dateAdded: LocalDate
)
    fun Book.toResponse() = BookDto(
        id = id,
        title = title,
        author = author,
        dateAdded = dateAdded
        )

