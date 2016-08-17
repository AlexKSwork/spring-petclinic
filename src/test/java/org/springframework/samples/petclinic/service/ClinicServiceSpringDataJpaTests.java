package org.springframework.samples.REMOVED.service;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.samples.REMOVED.PetClinicApplication;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * <p> Integration test using the 'Spring Data' profile.
 *
 * @author Michael Isvy
 * @see AbstractClinicServiceTests AbstractClinicServiceTests for more details. </p>
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = PetClinicApplication.class)
public class ClinicServiceSpringDataJpaTests extends AbstractClinicServiceTests {

}
