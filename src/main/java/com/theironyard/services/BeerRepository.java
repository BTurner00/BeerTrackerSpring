package com.theironyard.services;

import com.sun.tools.javac.util.List;
import com.theironyard.entities.Beer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.lang.reflect.Array;
import java.util.ArrayList;


/**
 * Created by zach on 11/10/15.
 */
public interface BeerRepository extends CrudRepository<Beer, Integer> {
    Iterable<Beer> findByType(String type);
    Iterable<Beer> findByTypeAndCalories(String type, Integer calories);
    Iterable<Beer> findByTypeAndCaloriesIsLessThanEqual(String type, Integer calories);

    Beer findFirstByType(String type);
    int countByType(String type);
    Iterable<Beer> findByTypeOrderByNameAsc(String type);

    @Query("SELECT b FROM Beer b WHERE LOWER(name) LIKE '%' || LOWER(?) || '%'")
    Iterable<Beer> findByName(String name);
}
