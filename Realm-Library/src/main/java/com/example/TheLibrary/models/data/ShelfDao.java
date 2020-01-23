package com.example.TheLibrary.models.data;

import com.example.TheLibrary.models.Library.Shelf;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShelfDao extends CrudRepository<Shelf, Integer> {
}
