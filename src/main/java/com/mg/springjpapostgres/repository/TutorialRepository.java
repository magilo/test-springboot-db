package com.mg.springjpapostgres.repository;

import java.util.List;

import com.mg.springjpapostgres.model.Tutorial;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {

  /**
   * custom finder method
   * 
   * @param published
   * @return all Tutorials with published having value as input published
   */
  List<Tutorial> findByPublished(boolean published);

  /**
   * custom finder method
   * 
   * @param title
   * @return all Tutorials which contains input title
   */
  List<Tutorial> findByTitleContaining(String title);

}
/*
 * can use JpaRepository's methods such as:
 * save(), findOne(), findById(), findAll(), count(), delete(), deleteById()...
 * without implementing these methods
 * 
 * define custom methods above
 * 
 * the implementation is plugged by Spring Data JPA automatically
 * 
 * Custom query with @Query annotation - see tutorial for more info
 * https://www.bezkoder.com/spring-jpa-query/
 * sort/order by multiple fields
 * https://bezkoder.com/spring-data-sort-multiple-columns/
 */
