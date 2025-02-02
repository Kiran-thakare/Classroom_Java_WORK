package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Instructor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String insName;

	@OneToOne(mappedBy = "ins")
	private YoutubeChannel yt;

	@OneToMany(mappedBy = "ins", cascade = CascadeType.ALL)
	private List<Subject> sub;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getInsName() {
		return insName;
	}

	public void setInsName(String insName) {
		this.insName = insName;
	}

	public YoutubeChannel getYt() {
		return yt;
	}

	public void setYt(YoutubeChannel yt) {
		this.yt = yt;
	}

	public List<Subject> getSub() {
		return sub;
	}

	public void setSub(List<Subject> sub) {
		this.sub = sub;
	}
    
	public void addSubject(Subject su) {

		if (sub == null) {
			sub = new ArrayList();

		}
		sub.add(su);
	}
	
}
