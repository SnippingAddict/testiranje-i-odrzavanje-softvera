package rs.edu.educons.it.JPATest.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rs.edu.educons.it.JPATest.entity.Zaposlen;
import rs.edu.educons.it.JPATest.repository.ZaposlenRepository;

@Service
public class ZaposlenService {

	@Autowired
	private ZaposlenRepository zaposlenRepo;

	public void addZaposlen(Zaposlen p) {
		zaposlenRepo.save(p);
	}

	public void delete(Integer id) {

		zaposlenRepo.deleteById(id);
	}

	public Optional<Zaposlen> find(Integer id) {

		return zaposlenRepo.findById(id);
	}

	public void update(Zaposlen p) {

		zaposlenRepo.save(p);

	}

	public List<Zaposlen> findAll(Integer posaoId) {

		List<Zaposlen> zaposleni = new ArrayList<>();
		zaposlenRepo.findByPosaoId(posaoId).forEach(zaposleni::add);
		return zaposleni;
	}

}
