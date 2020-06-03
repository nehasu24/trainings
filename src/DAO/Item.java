package DAO;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

import javax.persistence.ManyToMany;

import lombok.Getter;
import lombok.Setter;
/**
 * Entity implementation class for Entity: Item
 *
 */
@Entity
@Getter
@Setter
@Table
public class Item extends LevelElement  {

	
	
	@ManyToMany(targetEntity =  Characters.class)
	private Set<Character> characterSet;
	
	private int durability;
	private Color color;
	

	public Item(int durability,Color color) {
		super();
		this.durability = durability;
		this.color = color;
	}

	public Item() {
		super();
	}
   
}
