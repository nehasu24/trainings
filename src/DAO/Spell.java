package DAO;

import java.io.Serializable;
import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

/**
 * Entity implementation class for Entity: Spell
 *
 */
@Entity
@Getter
@Setter


public class Spell extends LevelElement {

	
	private int cost; 
	private int damage; 
	
	public Spell(int cost, int damage) {
		super();
		this.cost = cost;
		this.damage = damage; 
	}

	public Spell() {
		super();
	}
   
}
