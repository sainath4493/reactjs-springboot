package com.reactrestfulwebservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.reactrestfulwebservice.bean.Todo;

@Repository
public interface TodoJpaRepository extends JpaRepository<Todo, Long> {
	public List<Todo> findByUsername(String username);
}
