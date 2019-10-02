package rs.edu.educons.it.JPATest.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Posao {

	@Id
	@GeneratedValue
	private Integer id;
	private String naziv;
	private String sati;

	public Posao() {

	}

	public Posao(Integer id, String naziv, String sati) {
		super();
		this.id = id;
		this.naziv = naziv;
		this.sati = sati;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getSati() {
		return sati;
	}

	public void setSati(String sati) {
		this.sati = sati;
	}

	@Override
	public String toString() {
		return "Posao [id=" + id + ", naziv=" + naziv + ", sati=" + sati + "]";
	}

	public double izracunajBruto(double poreskaStopa, double doprinosi, double satnica) {
		double satiInt = Integer.parseInt(sati);
		return satiInt * satnica - poreskaStopa * satiInt * satnica - doprinosi * satiInt * satnica + izracunajBonus();

	}

	public double izracunajBonus() {
		int satiInt = Integer.parseInt(sati);
		if (satiInt >= 100)
			return 12500;
		else
			return 0;
	}

}
