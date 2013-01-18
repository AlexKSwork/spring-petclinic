package org.springframework.samples.REMOVED.repository.springdatajpa;

import org.springframework.data.repository.Repository;
import org.springframework.samples.REMOVED.Owner;
import org.springframework.samples.REMOVED.repository.OwnerRepository;

/**
 *
 * @author Michael Isvy
 * @since 15.1.2013
 */
public interface SpringDataOwnerRepository extends OwnerRepository, Repository<Owner, Integer> {
}
