package com.example.TheLibrary.models.data;

import com.example.TheLibrary.models.Library.Building;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuildingDao extends CrudRepository<Building, Integer> {
}
