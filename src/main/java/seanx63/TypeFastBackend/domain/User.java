package seanx63.TypeFastBackend.domain;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String username;
	private String password;
	private List<Integer> WPMHistory;
	private int averageWPM;

	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}

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

	public int getAverageWPM() {
		return averageWPM;
	}

	public void setAverageWPM(int averageWPM) {
		this.averageWPM = averageWPM;
	}

	public void addWPM(int wpm) {
		this.WPMHistory.add(wpm);
		setAverageWPM((int) this.WPMHistory.stream().mapToInt(i -> i).average().orElse(0));
	}

}
