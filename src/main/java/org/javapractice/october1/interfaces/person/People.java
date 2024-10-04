package org.javapractice.october1.interfaces.person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class People implements Person, Presidentable {
    private String name;
    private String country;
    private int age;
    private ArrayList<String> citizenships;
    private ArrayList<String> knowleges;
    private LocalDate dateOfBirth;
    private LocalDate dateOfDeath;

    public People(String name, String country, LocalDate dateOfBirth, LocalDate dateOfDeath) {
        if (dateOfDeath == null) {
            this.age = LocalDate.now().getYear() - dateOfBirth.getYear();
        }
        else{
            this.age = dateOfDeath.getYear() - dateOfBirth.getYear();
        }

        this.name = name;
        this.country = country;
        this.dateOfBirth = dateOfBirth;
        this.dateOfDeath = dateOfDeath;
    }

    public People(String name, String country, ArrayList<String> citizenships, ArrayList<String> knowleges, LocalDate dateOfBirth, LocalDate dateOfDeath) {
        this.name = name;
        this.country = country;
        if (dateOfDeath == null) {
            this.age = LocalDate.now().getYear() - dateOfBirth.getYear();
        }
        else{
            this.age = dateOfDeath.getYear() - dateOfBirth.getYear();
        }
        this.citizenships = citizenships;
        this.knowleges = knowleges;
        this.dateOfBirth = dateOfBirth;
        this.dateOfDeath = dateOfDeath;
    }

    public ArrayList<String> getCitizenships() {
        return citizenships;
    }

    public void setCitizenships(ArrayList<String> citizenships) {
        this.citizenships = citizenships;
    }

    public ArrayList<String> getKnowleges() {
        return knowleges;
    }

    public void setKnowleges(ArrayList<String> knowleges) {
        this.knowleges = knowleges;
    }
    public void fillCitizenships(String ... citizenships) {
        if (citizenships != null) {
            this.citizenships = new ArrayList<>();
        }
        this.citizenships.addAll(Arrays.asList(citizenships));
    }
    public void fillKnowleges(String ...knowleges) {
        if (this.knowleges == null) {
            this.knowleges = new ArrayList<>();
        }
        this.knowleges.addAll(Arrays.asList(knowleges));
    }
    public int getAge() {
        return age;
    }

    @Override
    public boolean isRussian() {
        if (this.country.equalsIgnoreCase("Russia")) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isNotInoagent() {
        if(this.citizenships == null){
            System.out.println("fill your countries");
            return false;
        } else if (this.citizenships.size() == 1) {
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public boolean isOlderThanThirtyFive() {
        if (this.age > 35) {
            return true;
        }
        return false;
    }

    @Override
    public boolean haveKnowlege() {
        if (this.knowleges != null && !this.knowleges.isEmpty()){
            return true;
        } else if (this.knowleges.isEmpty()) {
            System.out.println("fill your knowleges");
        }
        return false;
    }

    @Override
    public boolean isPresidentable() {
        return isRussian() && isOlderThanThirtyFive() && isNotInoagent() && isOlderThanThirtyFive() && haveKnowlege();
    }

    @Override
    public boolean isAlive() {
        if (dateOfDeath == null) {
            return true;
        }else{
            return false;
        }
    }
}
