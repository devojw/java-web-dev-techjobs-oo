package org.launchcode.techjobs_oo;

import java.util.*;
import java.util.HashMap;
import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job(){
        this.id = nextId;
        nextId++;
    }
    public Job(String name,Employer employer,Location location,PositionType positionType, CoreCompetency coreCompetency){
        this();
        this.name=name;
        this.employer=employer;
        this.location=location;
        this.positionType=positionType;
        this.coreCompetency=coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public String toString(){
        String printJobs = "";
        String printAll;
       ArrayList<String> labels = new ArrayList<>();
        labels.add("ID");
        labels.add("Name");
        labels.add("Employer");
        labels.add("Location");
        labels.add("Position Type");
        labels.add("Core Competency");
        ArrayList<Object> info = new ArrayList<>();
        info.add(id);
        info.add(name);
        info.add(employer.toString());
        info.add(location.toString());
        info.add(positionType.toString());
        info.add(coreCompetency.toString());
        Collections.replaceAll(info,"","Data not available");


        for(int i=0; i< labels.size();i++){
            printJobs += ("\n" + labels.get(i) + ": " + info.get(i));

        }
        printAll = printJobs + "\n";
        return printAll;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }
}
