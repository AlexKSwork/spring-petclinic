package org.springframework.samples.REMOVED.hibernate;

import org.junit.runner.RunWith;
import org.springframework.samples.REMOVED.AbstractClinicTests;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * <p>
 * Integration tests for the {@link HibernateClinic} implementation.
 * </p>
 * <p>
 * "HibernateClinicTests-context.xml" determines the actual beans to test.
 * </p>
 *
 * @author Juergen Hoeller
 * @author Sam Brannen
 */
@ContextConfiguration
@DirtiesContext
@RunWith(SpringJUnit4ClassRunner.class)
public class HibernateClinicTests extends AbstractClinicTests {

}
