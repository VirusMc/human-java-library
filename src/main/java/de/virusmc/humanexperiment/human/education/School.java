package de.virusmc.humanexperiment.human.education;

import de.virusmc.humanexperiment.common.Address;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;

@Data
public class School {

    private String name;
    private Date creationDate;
    private Address address;
    private String type;
    private ContactInformation contact;
    private int averageStudentCount;
    private ArrayList<Teacher> teachers;
    private ArrayList<String> diploma;
}
