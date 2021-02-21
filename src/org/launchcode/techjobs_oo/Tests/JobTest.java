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
    Job empty_name_test_job;
    Job empty_employer_test_job;
    Job multiple_null_test_job;



    @Before
    public void createJobObjects(){
        test_job = new Job();
        second_test_job = new Job();
        third_test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        first_id_test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        second_id_test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        empty_name_test_job = new Job(null, new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        empty_employer_test_job = new Job("Product tester", new Employer(null), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        multiple_null_test_job = new Job("Product tester", new Employer(null), new Location(null), new PositionType(null), new CoreCompetency(null));
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

    @Test
    public void testJobsForLabels(){
        assertEquals(third_test_job.toString(),"\n"+"ID: "+19+"\nName: "+"Product tester"+"\nEmployer: "+"ACME"+"\nLocation: "+"Desert"+"\nPosition Type: "+"Quality control"+"\nCore Competency: "+"Persistence"+"\n");
    }
    @Test
    public void testJobsForEmptyFields(){
        assertEquals(empty_name_test_job.toString(),"\n"+"ID: "+14+"\nName: Data not available"+"\nEmployer: "+"ACME"+"\nLocation: "+"Desert"+"\nPosition Type: "+"Quality control"+"\nCore Competency: "+"Persistence"+"\n");
        assertEquals(multiple_null_test_job.toString(),"\n"+"ID: "+16+"\nName: "+"Product tester"+"\nEmployer: Data not available"+"\nLocation: "+"Data not available"+"\nPosition Type: "+"Data not available"+"\nCore Competency: "+"Data not available"+"\n");
    }
    @Test
    public void testJobsForOnlyID(){
        assertEquals(test_job.toString(),"OOPS! This job does not seem to exist.");
    }
}
