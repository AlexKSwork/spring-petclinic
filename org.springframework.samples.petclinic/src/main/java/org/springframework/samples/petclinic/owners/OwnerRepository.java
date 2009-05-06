package org.springframework.samples.REMOVED.owners;

import java.util.Collection;

public interface OwnerRepository {

	Collection<Owner> findOwnersByLastName(String lastName);

	Owner getOwner(Long id);

	void saveOwner(Owner owner);

}