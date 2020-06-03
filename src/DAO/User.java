package DAO;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

/**
 * Entity implementation class for Entity: User
 *
 */
@Entity
@Getter
@Setter
@Table
public class User  {

	@Id 
    @GeneratedValue( strategy=GenerationType.AUTO )
	
	private String login;
	private String email;
	
	@OneToMany( targetEntity=Characters.class )
    private List charaterlist;
	
	public User(String login, String email) {
		this.login = login;
		this.email = email;
	}

	public User() {
		super();
	}
   
}
