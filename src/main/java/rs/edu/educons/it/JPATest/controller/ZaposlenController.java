package rs.edu.educons.it.JPATest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import rs.edu.educons.it.JPATest.entity.Posao;
import rs.edu.educons.it.JPATest.entity.Zaposlen;
import rs.edu.educons.it.JPATest.service.ZaposlenService;

@RestController
@RequestMapping("/api")
public class ZaposlenController {

	@Autowired
	private ZaposlenService zaposlenService;

	@RequestMapping(value = "/posao/{posaoId}/zaposlen/{zaposlenId}", method = RequestMethod.GET)
	public Optional<Zaposlen> getZaposlen(@PathVariable Integer zaposlenId) {
		return zaposlenService.find(zaposlenId);
	}

	@RequestMapping(value = "/posao/{posaoId}/zaposlen", method = RequestMethod.GET)
	public List<Zaposlen> getAllZaposleni(@PathVariable Integer posaoId) {
		return zaposlenService.findAll(posaoId);
	}

	@RequestMapping(value = "/posao/{posaoId}/zaposlen", method = RequestMethod.POST)
	public void addPredmet(@RequestBody Zaposlen zaposlen, @PathVariable Integer posaoId) {
		zaposlen.setP(new Posao(posaoId, "", ""));
		zaposlenService.addZaposlen(zaposlen);
	}

	@RequestMapping(value = "/posao/{posaoId}/zaposlen/{zaposlenId}", method = RequestMethod.PUT)
	public void updateSmer(@RequestBody Zaposlen zaposlen, @PathVariable Integer posaoId,
			@PathVariable Integer zaposlenId) {
		zaposlen.setP(new Posao(posaoId, "", ""));
		zaposlenService.update(zaposlen);
	}

	@RequestMapping(value = "/posao/{posaoId}/zaposlen/{zaposlenId}", method = RequestMethod.DELETE)
	public void deletePredmet(@PathVariable Integer zaposlenId) {
		zaposlenService.delete(zaposlenId);
	}

}
