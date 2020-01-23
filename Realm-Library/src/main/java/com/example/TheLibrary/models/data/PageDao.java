package com.example.TheLibrary.models.data;

import com.example.TheLibrary.models.Library.Page;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PageDao extends CrudRepository<Page, Integer> {
}
