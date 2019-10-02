package rs.edu.educons.it.JPATest.repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import rs.edu.educons.it.JPATest.entity.Posao;

@Repository
@Transactional
public interface PosaoRepository extends CrudRepository<Posao, Integer> {

}

// @Repository
// @Transactional
// public class PosaoRepository {
//
// @Autowired
// EntityManager eManager;
//
// public void delete(Integer id) {
//
// Posao p = findByID(id);
// eManager.remove(p);
//
// }
//
// public void save(Posao p) {
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
// public Posao findByID(Integer id) {
//
// return eManager.find(Posao.class,id );
//
// }
//
//
//
// }
