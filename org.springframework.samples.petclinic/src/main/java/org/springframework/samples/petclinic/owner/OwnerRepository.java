package org.springframework.samples.REMOVED.owner;

import java.util.Collection;

public interface OwnerRepository {

	Collection<Owner> findOwnersByLastName(String lastName);

	Owner getOwner(Long id);

	void saveOwner(Owner owner);

}