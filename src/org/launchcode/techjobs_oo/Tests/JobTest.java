package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.launchcode.techjobs_oo.*;
import org.junit.Test;

import static org.junit.Assert.*;


public class JobTest {

        Job job1 = new Job();
        Job job2 = new Job();

    @Test
    public void testThatTestingWorks() {
        assertTrue(true);
    }

    @Test
    public void testSettingJobId () {
        assertFalse(job1.getId() == job2.getId());
    }

    @Test
    public void testThatIdsAreOneNumberApartWhenAssigned () {
        assertTrue(job2.getId() - job1.getId() == 1);
    }

    @Test
    public void testJobConstructorSetsAllFields () {
        Job aJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality " +
                "control"), new CoreCompetency("Persistence"));
        assertTrue(aJob instanceof Job);
        assertTrue(aJob.getEmployer() instanceof Employer);
        assertTrue(aJob.getLocation() instanceof Location);
        assertTrue(aJob.getPositionType() instanceof PositionType);
        assertTrue(aJob.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality () {
        Job a = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality " +
                "control"), new CoreCompetency("Persistence"));
        Job b = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality " +
                "control"), new CoreCompetency("Persistence"));
        assertFalse(a.equals(b));
    }

    @Test
    public void testToStringMethodStartsAndEndsWithNewline () {
        Job aJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality " +
                "control"), new CoreCompetency("Persistence"));
        assertTrue(aJob.toString().startsWith("\n"));
        assertTrue(aJob.toString().endsWith("\n"));
    }

    @Test
    public void testFieldLabelsInToStringMethod () {
        Job a = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality " +
                "control"), new CoreCompetency("Persistence"));
        assertEquals(a.toString(), "\nID: "+a.getId()+"\nName: Product tester\nEmployer: ACME\nLocation: Desert\nPosition " +
                "Type: " +
                "Quality control\nCore Competency: Persistence\n");
    }

    @Test
    public void testIfFieldIsEmptyInToStringMethod () {
        Job a = new Job("Product tester", new Employer("ACME"), new Location(""), new PositionType("Quality " +
                "control"), new CoreCompetency("Persistence"));
        assertEquals(a.toString(), "\nID: "+a.getId()+"\nName: Product tester\nEmployer: ACME\nLocation: Data not " +
                "available\nPosition Type: " +
                "Quality control\nCore Competency: Persistence\n");

    }

    @Test
    public void testAllFieldsEmptyError(){
        Job nJob = new Job();
        assertEquals(nJob.toString(), "OOPS! This job does not seem to exist.");
    }



}
