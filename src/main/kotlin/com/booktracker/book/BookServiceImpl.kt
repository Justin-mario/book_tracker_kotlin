package com.booktracker.service.book

import com.booktracker.data.dao.BookDao
import com.booktracker.data.dao.toEntity
import com.booktracker.data.dto.BookDto
import com.booktracker.data.dto.toResponse
import com.booktracker.repository.BookRepository

class BookServiceImpl(private val bookRepository: BookRepository) : BookService {
    override fun addBook(bookDao: BookDao): BookDto {
      val book =  bookRepository.save(bookDao.toEntity())
        return book.toResponse()
    }
}