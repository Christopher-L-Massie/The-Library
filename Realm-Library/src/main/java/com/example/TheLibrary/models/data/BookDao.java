package com.example.TheLibrary.models.data;

import com.example.TheLibrary.models.Library.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookDao extends CrudRepository<Book, Integer> {
}
