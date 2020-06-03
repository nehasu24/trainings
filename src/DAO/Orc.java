package DAO;

import java.io.Serializable;
import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

/**
 * Entity implementation class for Entity: Orc
 *
 */
@Entity
@Getter
@Setter

public class Orc extends Characters {

	private String rage;
	
	public Orc (int id, String name, int health, int strength, int level,String rage) {
		super();
		this.rage = rage;
	}

	public Orc() {
		super();
	}
   
}
