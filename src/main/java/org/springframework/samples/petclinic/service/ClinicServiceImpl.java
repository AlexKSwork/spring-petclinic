package org.springframework.samples.REMOVED.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.samples.REMOVED.Owner;
import org.springframework.samples.REMOVED.Pet;
import org.springframework.samples.REMOVED.PetType;
import org.springframework.samples.REMOVED.Vet;
import org.springframework.samples.REMOVED.Visit;
import org.springframework.samples.REMOVED.repository.OwnerRepository;
import org.springframework.samples.REMOVED.repository.PetRepository;
import org.springframework.samples.REMOVED.repository.VetRepository;
import org.springframework.samples.REMOVED.repository.VisitRepository;
import org.springframework.stereotype.Service;

@Service
public class ClinicServiceImpl implements ClinicService {
	
	@Autowired
	private PetRepository petRepository;
	
	@Autowired
	private VetRepository vetRepository;
	
	@Autowired
	private OwnerRepository ownerRepository;
	
	@Autowired
	private VisitRepository visitRepository;

	public Collection<PetType> getPetTypes() throws DataAccessException {
		return petRepository.getPetTypes();
	}

	public Owner findOwnerById(int id) throws DataAccessException {
		return ownerRepository.findById(id);
	}

	public void storeVisit(Visit visit) throws DataAccessException {
		visitRepository.storeVisit(visit);
	}

	public Pet findPetById(int id) throws DataAccessException {
		return petRepository.findById(id);
	}

	public void storePet(Pet pet) throws DataAccessException {
		petRepository.storePet(pet);
	}

	public void deletePet(int id) throws DataAccessException {
		petRepository.deletePet(id);
	}

	public Collection<Vet> getVets() throws DataAccessException {
		return vetRepository.getVets();
	}
	
	
	
	
	
	
	
	
	
	

}
