package com.example.weixin.library.service;

import com.example.weixin.library.domain.Book;
import org.springframework.data.domain.Page;

public interface LibraryService {

	Page<Book> search(String keyword, int pageNumber);

}
