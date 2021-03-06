package domain.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
//@Indexed
@Table(name="User")
@Data
public class User implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4226055603113841802L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Item_ID")
	long id;
	
	@Column(name="Name")
	String name;
	
	@Column(name="Surname")
	String surname;
	
	@Column(name="Username")
	String username;
	
	@Column(name="Report")
	int report;

	public User() {}
	
	
	public User(String name, String surname, String username) {
		this.name = name;
		this.surname = surname;
		this.username = username;
		this.report = 0;
	}
	
	public User(String name, String surname, String username, int report) {
		this.name = name;
		this.surname = surname;
		this.username = username;
		this.report = report;
	}
	
	public User(long id, String name, String surname, String username, int report) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.username = username;
		this.report = report;
	}
	
	
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", surname=" + surname + ", username=" + username + ", report="
				+ report + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surName) {
		this.surname = surName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getReport() {
		return report;
	}

	public void setReport(int report) {
		this.report = report;
	}
}
