package org.example;

import java.util.ArrayList;
import java.util.List;

public class Departman {
    private TeamLead teamLead;
    private List<Personel> personelList;
    private List<String> assignmentList;

    public Departman(TeamLead teamLead) {
        this.teamLead = teamLead;
        this.personelList = new ArrayList<>();
        this.assignmentList = new ArrayList<>();
    }

    // TeamLead olmadan departman oluşturulamaması için parametresiz consructorı private yaptım.
    private Departman() {


    }

    public TeamLead getTeamLead() {
        return teamLead;
    }

    public void setTeamLead(TeamLead teamLead) {
        this.teamLead = teamLead;
    }

    public List<Personel> getPersonelList() {
        return personelList;
    }

    public void addPersonel(Personel personel) {
        this.personelList.add(personel);
    }

    public void removePersonel(Personel personel) {
        this.personelList.remove(personel);
    }

    public void changePersonel(Personel eskiPersonel, Personel yeniPersonel) {
        this.personelList.remove(eskiPersonel);
        this.personelList.add(yeniPersonel);
    }

    public List<String> getAssignmentList() {
        return assignmentList;
    }

    public void addAssignment(String assignment) {
        this.assignmentList.add(assignment);
    }

    public void markAssignmentAsCompleted(String assignment) { // görevi tamamlandı olarak işaretleyen methoddur. Görev tamamlandıktan sonra tamamlanan methodu siler.
        this.assignmentList.remove(assignment);
    }
}