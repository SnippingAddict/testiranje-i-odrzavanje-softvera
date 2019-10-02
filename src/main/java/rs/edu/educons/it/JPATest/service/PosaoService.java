package rs.edu.educons.it.JPATest.service;

import java.util.Optional;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rs.edu.educons.it.JPATest.entity.Posao;
import rs.edu.educons.it.JPATest.repository.PosaoRepository;

@Service
public class PosaoService {

	@Autowired
	private PosaoRepository posaoRepo;

	public void addPosao(Posao p) {
		posaoRepo.save(p);
	}

	public void deletePosao(Integer id) {

		posaoRepo.deleteById(id);
	}

	public Optional<Posao> find(Integer id) {

		return posaoRepo.findById(id);
	}

	public void editPosao(Posao p) {

		posaoRepo.save(p);

	}

	public List<Posao> findAll() {

		List<Posao> poslovi = new ArrayList<>();
		posaoRepo.findAll().forEach(poslovi::add);
		return poslovi;
	}

	public double calculatorBruto(double poreskaStopa, double doprinosi, double satnica, double satiInt) {

		return satiInt * satnica - poreskaStopa * satiInt * satnica - doprinosi * satiInt * satnica;

	}

	public double calculatorBonus(double sati) {

		if (sati >= 100)
			return 12500;
		else
			return 0;

	}

	public String bruto(double poreskaStopa, double doprinosi, double satnica, Integer id) {

		Optional<Posao> o = find(id);
		Posao p = o.get();
		return "Bruto plata za posao " + p.getNaziv() + " je " + p.izracunajBruto(poreskaStopa, doprinosi, satnica);

	}

	public String bonus(Integer id) {

		Optional<Posao> o = find(id);
		Posao p = o.get();
		return ("Bonus za posao " + p.getNaziv() + "je " + p.izracunajBonus());

	}

}
