package org.springframework.samples.REMOVED.owners.pets;

import org.springframework.stereotype.Repository;

@Repository
public class StubPetRepository implements PetRepository {

	public Pet getPet(Long owner, String name) {
		return null;
	}

	public void savePet(Pet pet) {
	}

}
