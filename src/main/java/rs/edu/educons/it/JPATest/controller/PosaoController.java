package rs.edu.educons.it.JPATest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import rs.edu.educons.it.JPATest.entity.Posao;
import rs.edu.educons.it.JPATest.service.PosaoService;

@RestController
@RequestMapping("/api")
public class PosaoController {

	@Autowired
	private PosaoService pServis;

	@RequestMapping(value = "/posao", method = RequestMethod.GET)
	public List<Posao> getAllPosao() {

		return pServis.findAll();
	}

	@RequestMapping(value = "/posao/{id}", method = RequestMethod.GET)
	public Optional<Posao> getPosao(@PathVariable Integer id) {

		return pServis.find(id);
	}

	@RequestMapping(value = "/posao", method = RequestMethod.POST)
	public void addPosao(@RequestBody Posao posao) {

		pServis.addPosao(posao);
	}

	@RequestMapping(value = "/posao/{id}", method = RequestMethod.PUT)
	public void editPosao(@RequestBody Posao posao) {

		pServis.editPosao(posao);
	}

	@RequestMapping(value = "/posao/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable Integer id) {

		pServis.deletePosao(id);

	}

	@RequestMapping("/calculator/bruto")
	public double calculatorBruto(@RequestParam("pStopa") double poreskaStopa,
			@RequestParam("doprinosi") double doprinosi, @RequestParam("satnica") double satnica,
			@RequestParam("sati") double sati) {

		return pServis.calculatorBruto(poreskaStopa, doprinosi, satnica, sati);

	}

	@RequestMapping("/calculator/bonus")
	public double calculatorBonus(@RequestParam("sati") double sati) {

		return pServis.calculatorBonus(sati);

	}

	@RequestMapping("/bruto")
	public String bruto(@RequestParam("pStopa") double poreskaStopa, @RequestParam("doprinosi") double doprinosi,
			@RequestParam("satnica") double satnica, @RequestParam("id") Integer id) {

		return pServis.bruto(poreskaStopa, doprinosi, satnica, id);

	}

	@RequestMapping("/bonus")
	public String bonus(@RequestParam("id") Integer id) {

		return pServis.bonus(id);
	}

}
