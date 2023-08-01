package com.booktracker.service.book

import com.booktracker.data.dao.BookDao
import com.booktracker.data.dto.BookDto

interface BookService {
    fun addBook(bookDao: BookDao) : BookDto
}