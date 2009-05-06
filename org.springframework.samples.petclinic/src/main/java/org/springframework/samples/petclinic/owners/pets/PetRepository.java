package org.springframework.samples.REMOVED.owners.pets;

public interface PetRepository {
	
	Pet getPet(Long owner, String name);
	
	void savePet(Pet pet);
	
}
