package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job() {
        this.id = nextId;
        nextId ++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    @Override
    public String toString() {
        String na;
        String e;
        String l;
        String p;
        String c;
        Integer areNull = 0;

        if (this.name.isEmpty() || this.name == null){
            na = "Data not available";
            areNull+=1;
        } else {
            na = name.toString();
        }
        if (this.employer.getValue().isEmpty() || this.employer.getValue()== null){
            e = "Data not available";
            areNull+=1;
        } else {
            e = employer.toString();
        }
        if (this.location.getValue().isEmpty() || this.location.getValue()== null){
            l = "Data not available";
            areNull+=1;
        } else {
            l = location.toString();
        }
        if (this.positionType.getValue().isEmpty() || this.positionType.getValue()==null){
            p = "Data not available";
            areNull+=1;
        } else {
            p = positionType.toString();
        }
        if (this.coreCompetency.getValue().isEmpty() || this.coreCompetency.getValue() == null){
            c = "Data not available";
            areNull+=1;
        } else {
            c = coreCompetency.toString();
        }

        if (areNull > 4){
            return "OOPS! This job does not seem to exist.";
        }


        return "\nID: "+id+ "\nName: "+ na + "\nEmployer: "+e + "\nLocation: "+l+"\nPosition Type: "+p+ "\nCore Competency: "+c+"\n";
    }

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id && name.equals(job.name) && employer.equals(job.employer) && location.equals(job.location) && positionType.equals(job.positionType) && coreCompetency.equals(job.coreCompetency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, employer, location, positionType, coreCompetency);
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }
}
