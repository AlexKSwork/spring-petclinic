package org.springframework.samples.REMOVED.repository.springdatajpa;

import org.springframework.data.repository.Repository;
import org.springframework.samples.REMOVED.model.Vet;
import org.springframework.samples.REMOVED.repository.VetRepository;

/**
 *
 * @author Michael Isvy
 * @since 15.1.2013
 */
public interface SpringDataVetRepository extends VetRepository, Repository<Vet, Integer> {
}
