package rs.edu.educons.it.JPATest.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import rs.edu.educons.it.JPATest.entity.Predmet;

@Repository
@Transactional
public interface PredmetRepository extends CrudRepository<Predmet, Integer> {

	public List<Predmet> findBySmerId(Integer smerId);
	
	
}
