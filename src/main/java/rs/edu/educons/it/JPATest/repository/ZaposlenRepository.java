package rs.edu.educons.it.JPATest.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import rs.edu.educons.it.JPATest.entity.Zaposlen;

@Repository
@Transactional
public interface ZaposlenRepository extends CrudRepository<Zaposlen, Integer> {

	@Query

	public List<Zaposlen> findByPosaoId(Integer posaoId);

}

// @Repository
// @Transactional
// public class ZaposlenRepository {
//
// @Autowired
// EntityManager eManager;
//
// public void delete(Integer id) {
//
// Zaposlen p = findByID(id);
// eManager.remove(p);
//
// }
//
// public void save(Zaposlen p) {
//
// if (findByID(p.getId())==null) {
//
// eManager.persist(p);
// } else {
//
// eManager.merge(p);
// }
//
//
// }
// public Zaposlen findByID(Integer id) {
//
// return eManager.find(Zaposlen.class,id );
//
// }
//
//
//
// }
