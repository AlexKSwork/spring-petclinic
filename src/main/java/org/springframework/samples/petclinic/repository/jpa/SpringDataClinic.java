package org.springframework.samples.REMOVED.repository.jpa;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.samples.REMOVED.Owner;
import org.springframework.samples.REMOVED.Pet;
import org.springframework.samples.REMOVED.PetType;
import org.springframework.samples.REMOVED.Vet;
import org.springframework.samples.REMOVED.Visit;
import org.springframework.samples.REMOVED.service.ClinicService;

/**
 *
 * @author Michael Isvy
 * @since 15.1.2013
 */
public interface SpringDataClinic extends ClinicService, Repository {



	@Query("SELECT vet FROM Vet vet ORDER BY vet.lastName, vet.firstName")
	public Collection<Vet> getVets();

	@Query("SELECT ptype FROM PetType ptype ORDER BY ptype.name")
	public Collection<PetType> getPetTypes();

	@Query("SELECT owner FROM Owner owner WHERE owner.lastName LIKE :lastName")
	public Collection<Owner> findOwners(String lastName);
	

	public Owner findOwner(int id);

	public Pet findPet(int id);

	public void storeOwner(Owner owner);

	public void storePet(Pet pet);

	public void storeVisit(Visit visit);

	public void deletePet(int id);

}
