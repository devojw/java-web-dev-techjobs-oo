package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    Job test_job;
    Job second_test_job;
    Job third_test_job;
    Job first_id_test_job;
    Job second_id_test_job;



    @Before
    public void createJobObjects(){
        test_job = new Job();
        second_test_job = new Job();
        third_test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        first_id_test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        second_id_test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }


    @Test
    public void testSettingJobId(){
        assertFalse(test_job.getId()== second_test_job.getId());
        assertEquals(test_job.getId()+1,second_test_job.getId());
    }
    @Test
    public void testJobConstructorSetsAllFields(){
        assertEquals(third_test_job.getName(),"Product tester");
        assertEquals(third_test_job.getEmployer().getValue(),"ACME");
        assertEquals(third_test_job.getLocation().getValue(),"Desert");
        assertEquals(third_test_job.getPositionType().getValue(),"Quality control");
        assertEquals(third_test_job.getCoreCompetency().getValue(),"Persistence");
        assertTrue(third_test_job.getEmployer()instanceof Employer);
        assertTrue(third_test_job.getLocation()instanceof Location);
        assertTrue(third_test_job.getPositionType()instanceof PositionType);
        assertTrue(third_test_job.getCoreCompetency()instanceof CoreCompetency);
    }
    @Test
    public void testJobsForEquality(){
        assertFalse(first_id_test_job == second_id_test_job);
    }
}
