package com.cjc.main.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.RepositoryI.HomeRepositoryB;
import com.cjc.main.RepositoryI.HomeRepositoryI;
import com.cjc.main.ServiceI.HomeServiceI;
import com.cjc.main.model.Books;
import com.cjc.main.model.User;
@Service
public class UserHomeServiceImpl implements HomeServiceI{
	
	@Autowired
	HomeRepositoryI hr;
	
	@Autowired
	HomeRepositoryB hrb;

	@Override
	public void saveUser(User u) {
		hr.save(u);
		
	}

	@Override
	public void saveBook(Books b) {
		hrb.save(b);
		
		
	}

}
