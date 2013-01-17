package org.springframework.samples.REMOVED.repository;

import java.util.Collection;

import org.springframework.dao.DataAccessException;
import org.springframework.samples.REMOVED.BaseEntity;
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
public interface PetRepository {

	/**
	 * Retrieve all <code>PetType</code>s from the data store.
	 * @return a <code>Collection</code> of <code>PetType</code>s
	 */
	Collection<PetType> getPetTypes() throws DataAccessException;

	/**
	 * Retrieve a <code>Pet</code> from the data store by id.
	 * @param id the id to search for
	 * @return the <code>Pet</code> if found
	 * @throws org.springframework.dao.DataRetrievalFailureException if not found
	 */
	Pet findById(int id) throws DataAccessException;

	/**
	 * Save a <code>Pet</code> to the data store, either inserting or updating it.
	 * @param pet the <code>Pet</code> to save
	 * @see BaseEntity#isNew
	 */
	void storePet(Pet pet) throws DataAccessException;

	/**
	 * Deletes a <code>Pet</code> from the data store.
	 */
	void deletePet(int id) throws DataAccessException;

}
