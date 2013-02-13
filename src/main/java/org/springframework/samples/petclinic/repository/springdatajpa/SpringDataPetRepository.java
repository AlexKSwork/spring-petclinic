package org.springframework.samples.REMOVED.repository.springdatajpa;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.samples.REMOVED.model.Pet;
import org.springframework.samples.REMOVED.model.PetType;
import org.springframework.samples.REMOVED.repository.PetRepository;

/**
 *
 * @author Michael Isvy
 * @since 15.1.2013
 */
public interface SpringDataPetRepository extends PetRepository, Repository<Pet, Integer> {
	
	@Query("SELECT ptype FROM PetType ptype ORDER BY ptype.name")
	List<PetType> findPetTypes() throws DataAccessException;
}
