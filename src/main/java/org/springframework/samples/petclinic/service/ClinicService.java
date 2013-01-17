package org.springframework.samples.REMOVED.service;

import java.util.Collection;

import org.springframework.dao.DataAccessException;
import org.springframework.samples.REMOVED.Owner;
import org.springframework.samples.REMOVED.Pet;
import org.springframework.samples.REMOVED.PetType;
import org.springframework.samples.REMOVED.Vet;
import org.springframework.samples.REMOVED.Visit;


/**
 * The high-level PetClinic business interface.
 *
 * <p>This is basically a data access object.
 * PetClinic doesn't have a dedicated business facade.
 *
 * @author Ken Krebs
 * @author Juergen Hoeller
 * @author Sam Brannen
 */
public interface ClinicService {
	
	public Collection<PetType> getPetTypes() throws DataAccessException;
	
	public Owner findOwnerById(int id) throws DataAccessException;
	
	public Pet findPetById(int id) throws DataAccessException;

	public void storePet(Pet pet) throws DataAccessException;

	public void deletePet(int id) throws DataAccessException;
	
	public void storeVisit(Visit visit) throws DataAccessException;
	
	public Collection<Vet> getVets() throws DataAccessException;

}
