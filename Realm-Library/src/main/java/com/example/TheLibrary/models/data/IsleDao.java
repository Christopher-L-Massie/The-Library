package com.example.TheLibrary.models.data;

import com.example.TheLibrary.models.Library.Isle;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IsleDao extends CrudRepository<Isle, Integer> {
}
