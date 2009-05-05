package org.springframework.samples.REMOVED.pet;

public interface PetRepository {
	
	Pet getPet(Long owner, String name);
	
	void savePet(Pet pet);
	
}
