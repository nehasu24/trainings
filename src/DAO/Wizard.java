package DAO;

import java.io.Serializable;
import javax.persistence.*;

import DAO.Characters;
import lombok.Getter;
import lombok.Setter;

/**
 * Entity implementation class for Entity: Magic
 *
 */
@Entity
@Getter
@Setter

public class Wizard extends Characters {

	private String rage;
	
	public Wizard (int id, String name, int health, int strength, int level,String rage) {
		super();
		this.rage = rage;
	}

	public Wizard() {
		super();
	}
   
}
