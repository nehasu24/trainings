package DAO;

import java.io.Serializable;
import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

/**
 * Entity implementation class for Entity: LevelElement
 *
 */
@Entity
@Setter
@Getter

@IdClass(LevelElementId.class)
public class LevelElement {

	


	@Id 
	private String name ;
	@Id
	private int level;
	
	public LevelElement(String name, int level) {
		this.name = name;
		this.level = level;
	}
	public LevelElement() {
		super();
	}
   
}
