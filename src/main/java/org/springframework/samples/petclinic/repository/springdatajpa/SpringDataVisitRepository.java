package org.springframework.samples.REMOVED.repository.springdatajpa;

import org.springframework.data.repository.Repository;
import org.springframework.samples.REMOVED.Visit;
import org.springframework.samples.REMOVED.repository.VisitRepository;

/**
 *
 * @author Michael Isvy
 * @since 15.1.2013
 */
public interface SpringDataVisitRepository extends VisitRepository, Repository<Visit, Integer> {
}
