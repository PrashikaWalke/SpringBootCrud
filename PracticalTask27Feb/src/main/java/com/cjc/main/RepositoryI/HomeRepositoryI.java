package com.cjc.main.RepositoryI;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.main.model.User;
@Repository
public interface HomeRepositoryI extends CrudRepository<User, Integer>{

}
