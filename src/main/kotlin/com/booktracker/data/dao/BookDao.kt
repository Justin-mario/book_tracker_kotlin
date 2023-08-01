package com.booktracker.data.dao

import com.booktracker.data.dto.BookDto
import com.booktracker.data.entity.Book

data class BookDao(
    val title: String,

    val author: String,
)
    fun BookDao.toEntity() = Book(
        title = title,
        author = author,
    )

