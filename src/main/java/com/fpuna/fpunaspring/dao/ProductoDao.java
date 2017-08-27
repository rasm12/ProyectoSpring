package com.fpuna.fpunaspring.dao;

import com.fpuna.fpunaspring.entidades.Producto;
import java.util.List;
import org.hibernate.engine.profile.Fetch.Style;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;



public interface ProductoDao extends JpaRepository<Producto, Integer> {

//    @Query("select author.name from Author author where author.style.name = ?1")
//    List<String> findNameByStyleName(String styleName);
//    
//    @Query("select distinct author.name from Book book join book.authorList author")
//    List<String> findDistinctNameByAnyBook();
//        
//    @Query("select author.name from Book book join book.authorList author join book.themeList theme where theme.name = ?1")
//    List<String> findNameByThemeName(String themeName);
}
