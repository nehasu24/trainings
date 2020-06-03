package DAO;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

import DAO.Characters;
import lombok.Getter;
import lombok.Setter;

/**
 * Entity implementation class for Entity: Character
 *
 */
@Entity
@Getter
@Setter
@Table
public class Characters implements Serializable {

	
	@ManyToMany(targetEntity = Item.class)
	private Set<Item> itemSet;
	
	
	  @JoinTable( name = "Item_Characters", joinColumns
	  = @JoinColumn(name="characters_id"), inverseJoinColumns = {
	  
	  @JoinColumn(name="Item_level"), @JoinColumn(name="Item_name") } )
	 
	
	

	@Id 
    @GeneratedValue( strategy=GenerationType.AUTO )
	private int id;
	private String name;
	private int health;
	private int strength;
	private int level;

	public Characters(int id, String name, int health, int strength, int level, Set itemSet) {
		this.id = id;
		this.name = name;
		this.strength = strength;
		this.level = level;		
		this.health = health;
		this.itemSet = itemSet;
		
	}
	public Characters() {
		super();
	}
   
}
