package com.reymatsunaga.mysqlcrud.dao;

import com.reymatsunaga.mysqlcrud.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookDao extends JpaRepository<Book, Long> {

}
