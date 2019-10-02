package rs.edu.educons.it.JPATest.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Zaposlen {

	@Id
	@GeneratedValue
	private Integer id;
	private String ime;
	private String prezime;
	// private String posao;

	@ManyToOne
	private Posao posao;

	public Zaposlen() {

	}

	public Zaposlen(String ime, String prezime, Integer posaoId) {
		super();
		this.ime = ime;
		this.prezime = prezime;

		this.posao = new Posao(posaoId, "", "");
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public Posao getP() {
		return posao;
	}

	public void setP(Posao p) {
		this.posao = p;
	}

	@Override
	public String toString() {
		return "Zaposlen [id=" + id + ", ime=" + ime + ", prezime=" + prezime + ", posao=" + posao + "]";
	}

}
