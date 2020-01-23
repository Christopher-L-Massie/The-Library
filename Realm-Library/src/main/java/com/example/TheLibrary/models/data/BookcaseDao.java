package com.example.TheLibrary.models.data;

import com.example.TheLibrary.models.Library.Bookcase;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookcaseDao extends CrudRepository<Bookcase, Integer> {
}
