package com.bjjmaster.videolibrary.repository;

import com.bjjmaster.videolibrary.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
