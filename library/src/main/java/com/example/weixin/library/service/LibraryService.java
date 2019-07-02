package com.example.weixin.library.service;

import com.example.weixin.library.domain.Book;
import com.example.weixin.library.domain.DebitList;

import org.springframework.data.domain.Page;

public interface LibraryService {

	Page<Book> search(String keyword, int pageNumber);

	void add(String id, DebitList list);

	void remove(String id, DebitList list);

}
