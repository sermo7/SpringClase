package persistence.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import persistence.entities.library.Author;
import persistence.entities.library.Style;

public interface AuthorDao extends JpaRepository<Author, Integer> {

	@Query("select author.id from Book book join book.authorList author Author author join author.style")
    List<Author> findByStyle(Style style);
    
         
    @Query("select author.name from Author author where author.sytle.name = ?1")
    List<String> findNameByStyleName(String styleName);
    
    
    @Query("select distinct author.name from Book book join book.authorList author")
    List<String> findNameByAnyAuthor();
    
    @Query("select b.title from Book b")
    List<String> findNameByAnyBook();
    
    @Query("select author.name from Book book join book.authorList author join book.themeList theme where theme.name= ?1")
    List<String> findNameByThemeName(String themeName);

}
