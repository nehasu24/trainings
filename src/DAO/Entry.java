package DAO;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Entry {

	public static void main(String args[]) {
		
		 EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "JPATraining" );
		   EntityManager entitymanager = emfactory.createEntityManager( );
		   entitymanager.getTransaction( ).begin( );
		   
		   Item item1 = new Item();
		   item1.setDurability(3);
		   item1.setLevel(4);
		   item1.setColor(Color.BLUE);
		   item1.setName("forks");
		   
		   Item item2 = new Item();
		   item2.setDurability(1);
		   item2.setLevel(5);
		   item1.setColor(Color.RED);
		   item2.setName("solls");
		   
		   Item item3 = new Item();
		   item3.setDurability(2);
		   item3.setLevel(3);
		   item1.setColor(Color.GREEN);
		   item3.setName("pools");
		   
		   entitymanager.persist(item1);
		   entitymanager.persist(item2);
		   entitymanager.persist(item3);
		   
		   Set<Item> itemSet1 = new HashSet();
		   itemSet1.add(item3);
		   itemSet1.add(item2);
		   itemSet1.add(item1);
		   
		   Set<Item> itemSet2 = new HashSet();
		   itemSet2.add(item2);
		   itemSet2.add(item3);
		   itemSet2.add(item1);
		   
		   Set<Item> itemSet3 = new HashSet();
		   itemSet3.add(item1);
		   itemSet3.add(item3);
		   itemSet3.add(item2);
		   
		   //Create Character Entity
		   Characters character = new Characters();
		   character.setName("Satish");
		   character.setLevel(2);
		   character.setStrength(5);
		   character.setHealth(9);
		   character.setItemSet(itemSet1);

		 //Create Character Entity
		   Characters character2 = new Characters();
		   character2.setName("Maish");
		   character2.setLevel(3);
		   character2.setStrength(6);
		   character2.setHealth(8);
		   character.setItemSet(itemSet2);
		   
		 //Create Character Entity
		   Characters character3 = new Characters();
		   character.setName("sam");
		   character.setLevel(6);
		   character.setStrength(8);
		   character.setHealth(10); 
		   character.setItemSet(itemSet3);
		   
		   //Store Character
		   entitymanager.persist(character);
		   entitymanager.persist(character2);
		   entitymanager.persist(character3);

		   //Create Characterlist
		   List<Characters> emplist = new ArrayList();
		   emplist.add(character);
		   emplist.add(character2);
		   emplist.add(character3);

		   //Create User Entity
		   User user = new User();
		   user.setEmail("xuis.gmail.com");
		   user.setLogin("xyzs");

		   //Store user
		   entitymanager.persist(user);
		   
		   
		   
		   

		   entitymanager.getTransaction().commit();
		   entitymanager.close();
		   emfactory.close();
		   
		
		
	}
}
