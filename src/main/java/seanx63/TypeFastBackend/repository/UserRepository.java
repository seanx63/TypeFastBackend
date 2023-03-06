package seanx63.TypeFastBackend.repository;

import org.springframework.data.repository.CrudRepository;

import seanx63.TypeFastBackend.domain.User;

public interface UserRepository extends CrudRepository<User, Long>{
	

}
