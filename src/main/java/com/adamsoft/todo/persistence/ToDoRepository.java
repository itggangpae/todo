package com.adamsoft.todo.persistence;

import com.adamsoft.todo.entity.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ToDoRepository extends
        JpaRepository<ToDo, String> {

    //userId를 가지고 조회하는 메서드
    public List<ToDo> findByUserId(String userId);

}
