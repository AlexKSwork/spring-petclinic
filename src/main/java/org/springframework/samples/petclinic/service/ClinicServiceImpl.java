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
import org.springframework.transaction.annotation.Transactional;

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

	@Transactional(readOnly=true)
	public Collection<PetType> findPetTypes() throws DataAccessException {
		return petRepository.findPetTypes();
	}

	@Transactional(readOnly=true)
	public Owner findOwnerById(int id) throws DataAccessException {
		return ownerRepository.findById(id);
	}

	@Transactional
	public void saveVisit(Visit visit) throws DataAccessException {
		visitRepository.save(visit);
	}

	@Transactional(readOnly=true)
	public Pet findPetById(int id) throws DataAccessException {
		return petRepository.findById(id);
	}

	@Transactional
	public void savePet(Pet pet) throws DataAccessException {
		petRepository.save(pet);
	}

	@Transactional(readOnly=true)
	public Collection<Vet> findVets() throws DataAccessException {
		return vetRepository.findAll();
	}
	
	
	
	
	
	
	
	
	
	

}
