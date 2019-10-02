package rs.edu.educons.it.JPATest.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Predmet {

	@Id
	@GeneratedValue
	private Integer id;
	private String ime;
	private String opis;

	@ManyToOne
	private Smer smer;


	public Predmet() {

	}

	public Predmet(String ime, String opis, Integer smerId) {
		super();
		this.ime = ime;
		this.opis = opis;
		
		
		this.smer = new Smer(smerId, "", "");
	}

	public Smer getSmer() {
		return smer;
	}

	public void setSmer(Smer smer) {
		this.smer = smer;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Predmet [id=" + id + ", ime=" + ime + ", opis=" + opis + "]";
	}

}
