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
        Map<String,Object> jobsMap = new LinkedHashMap<String,Object>();
        //jobsMap.put("ID",id);
        jobsMap.put("\nName",name);
        jobsMap.put("\nEmployer",employer);
        jobsMap.put("\nLocation",location);
        jobsMap.put("\nPosition Type",positionType);
        jobsMap.put("\nCore Competency",coreCompetency);
        String listString = "";
        String printJobs = "";
        String notAvailable= "Data not available";
        String idString = "\n" +"ID: " + id  +"\n";
        String printAll = "";


        if(name == null && employer == null && location == null && positionType == null && coreCompetency == null){
            return "OOPS! This job does not seem to exist.";
        }
        for (Map.Entry mapElement : jobsMap.entrySet()) {
                String key = (String) mapElement.getKey();
                Object value = mapElement.getValue();
                if(value == ""){
                    value.toString().replace("","Data not available");}
                listString += (key + ": " + value);
                printJobs = "\n" + "ID: " + id + listString + "\n";
                printAll = printJobs.replace("null","Data not available");

        } return printAll;
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
