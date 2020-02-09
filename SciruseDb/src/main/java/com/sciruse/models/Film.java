package com.sciruse.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Film {
	@Id
	@GeneratedValue
	private long ID;
	private String title ;
	private String resume;
	private	 int note ;
	private Date dateSortie ;
	private Date duration ;
	//private List<Film>filmsLiees ;
	//private List<String>genre;
	//private List<Actors> actors;
	//private List<String>realisator ;
	//private List<Comments>comments ;


	public Film() {
		// TODO Auto-generated constructor stub
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getResume() {
		return resume;
	}
	public void setResume(String resume) {
		this.resume = resume;
	}
	public int getNote() {
		return note;
	}
	public void setNote(int note) {
		this.note = note;
	}
	public Date getDateSortie() {
		return dateSortie;
	}
	public void setDateSortie(Date dateSortie) {
		this.dateSortie = dateSortie;
	}
	public Date getDuration() {
		return duration;
	}
	public void setDuration(Date duration) {
		this.duration = duration;
	}



}
