package de.virusmc.humanexperiment.human;

import de.virusmc.humanexperiment.human.education.School;
import lombok.Data;

import java.util.ArrayList;

@Data
public class Education {

    private ArrayList<School> schools;
    private ArrayList<String> diploma;
}
