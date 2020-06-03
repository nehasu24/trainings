package DAO;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LevelElementId implements Serializable {
    private String name;
 
    private int level;
 
    // default constructor
 
    public LevelElementId(String name, int level) {
        this.name = name;
        this.level = level;
    }
    
    public LevelElementId() {
    	
    }  
   
 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((name == null) ? 0 : name.hashCode());
		result = prime * result + level;
		return result;
	}
 
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LevelElementId other = (LevelElementId) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (level != other.level)
			return false;
		return true;
	}
	
 
    
}
