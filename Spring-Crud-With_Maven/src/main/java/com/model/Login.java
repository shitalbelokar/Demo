package com.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Login {
	public int getLogid() {
		return logid;
	}
	public void setLogid(int logid) {
		this.logid = logid;
	}
	public String getUn() {
		return un;
	}
	public void setUn(String un) {
		this.un = un;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	/*public User getU() {
		return u;
	}
	public void setU(User u) {
		this.u = u;
	}*/
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int logid;
private String un;
private String pw;
/*@OneToOne(cascade=CascadeType.ALL)
private User u;*/
}
