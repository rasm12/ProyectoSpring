package com.fpuna.fpunaspring.dao;

import com.fpuna.fpunaspring.entidades.Customer;

import org.springframework.data.jpa.repository.JpaRepository;



public interface CustomerDao extends JpaRepository<Customer, Integer> {

//    @Query("select author.name from Author author where author.style.name = ?1")
//    List<String> findNameByStyleName(String styleName);
//    
//    @Query("select distinct author.name from Book book join book.authorList author")
//    List<String> findDistinctNameByAnyBook();
//        
//    @Query("select author.name from Book book join book.authorList author join book.themeList theme where theme.name = ?1")
//    List<String> findNameByThemeName(String themeName);
}
