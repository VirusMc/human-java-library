package de.virusmc.humanexperiment.human.education;

import de.virusmc.humanexperiment.common.Name;

import java.util.ArrayList;

public interface Teacher {

    Name name();

    ArrayList<String> subjects();

    ArrayList<String> classes();
}
