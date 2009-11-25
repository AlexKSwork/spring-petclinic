package org.springframework.samples.REMOVED;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.springframework.samples.REMOVED.hibernate.HibernateClinicTests;
import org.springframework.samples.REMOVED.jdbc.SimpleJdbcClinicTests;
import org.springframework.samples.REMOVED.jpa.EntityManagerClinicTests;
import org.springframework.samples.REMOVED.jpa.HibernateEntityManagerClinicTests;
import org.springframework.samples.REMOVED.jpa.OpenJpaEntityManagerClinicTests;
import org.springframework.samples.REMOVED.web.VisitsAtomViewTest;

/**
 * JUnit 4 based test suite for all PetClinic tests.
 *
 * @author Sam Brannen
 */
@RunWith(Suite.class)
@SuiteClasses({
	OwnerTests.class,
	SimpleJdbcClinicTests.class,
	HibernateClinicTests.class,
	EntityManagerClinicTests.class,
	HibernateEntityManagerClinicTests.class,
	OpenJpaEntityManagerClinicTests.class,
	VisitsAtomViewTest.class
})
public class PetClinicTestSuite {
}
