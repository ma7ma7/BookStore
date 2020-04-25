package com.webngs.bookStore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webngs.bookStore.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
