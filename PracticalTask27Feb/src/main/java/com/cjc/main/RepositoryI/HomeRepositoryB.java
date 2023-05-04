package com.cjc.main.RepositoryI;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.main.model.Books;
@Repository
public interface HomeRepositoryB extends CrudRepository<Books, Integer>{

}
