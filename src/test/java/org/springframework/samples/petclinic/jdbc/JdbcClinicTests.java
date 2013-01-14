package org.springframework.samples.REMOVED.jdbc;

import org.junit.runner.RunWith;
import org.springframework.samples.REMOVED.AbstractClinicTests;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * <p>
 * Integration tests for the {@link JdbcClinic} implementation.
 * </p>
 * <p>
 * "JdbcClinicTests-context.xml" determines the actual beans to test.
 * </p>
 *
 * @author Thomas Risberg
 */
@ContextConfiguration(locations={"classpath:spring/applicationContext-jdbc.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
@DirtiesContext
public class JdbcClinicTests extends AbstractClinicTests {
	
	

}
