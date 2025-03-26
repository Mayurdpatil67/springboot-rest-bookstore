package com.example.CrudRestJPADemo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {

    List<Book> findByAuthor(String author);

    List<Book> findByTitleContaining(String keyword);

    List<Book> findByPriceBetween(double minPrice, double maxPrice);

}
