package servlet.practice.domain;

import java.io.Serializable;

public class User implements Serializable{
	private String username;
	private String password;
	private String usergender;
	private String userage;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsergender() {
		return usergender;
	}
	public void setUsergender(String usergender) {
		this.usergender = usergender;
	}
	public String getUserage() {
		return userage;
	}
	public void setUserage(String userage) {
		this.userage = userage;
	}
	
}
