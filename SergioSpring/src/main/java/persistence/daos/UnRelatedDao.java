package persistence.daos;

import java.util.Collection;
import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import persistence.entities.UnRelatedEntity;

public interface UnRelatedDao extends JpaRepository<UnRelatedEntity, Integer>{

    //Consulta: por Nombre de Método
    UnRelatedEntity findByNickIgnoreCase(String nick);

    List<UnRelatedEntity> findFirst3ByNickStartingWith(String prefix);
    
    List<UnRelatedEntity> findByNickOrLargeOrderByIdDesc(String nick, String large);

    List<UnRelatedEntity> findByIdGreaterThan(int id, Pageable pageable);
    
    List<UnRelatedEntity> findByIdIn(Collection<Integer> values);
    
    //Consulta: JPQL
    //?1 ?2 ?3...
    //:name ... @Param("name")
    @Query("select u.nick from other_name_for_unrelatedentity u where u.nick like ?1")
    List<String> findNickByNickLike(String nick);
    
    @Query("select u.id from other_name_for_unrelatedentity u where u.id > ?1 and u.id < ?2")
    List<Integer> findIdByIdBetween(int initial, int end);
    
    //Consulta: SQL
    @Query(value = "SELECT * FROM other_name_for_unrelatedentity WHERE KCIN = ?1", nativeQuery = true)
    UnRelatedEntity findByNick(String nick);
    
    
    //Consulta: SQL
    @Query(value = "SELECT * FROM other_name_for_unrelatedentity WHERE gender = ?1", nativeQuery = true)
    UnRelatedEntity findByGender(String gender);

}
