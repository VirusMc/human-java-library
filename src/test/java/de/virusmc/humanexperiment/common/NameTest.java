package de.virusmc.humanexperiment.common;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NameTest {

    Name name;

    @BeforeEach
    void setName(){
        name = new Name();
    }

    @Test
    @DisplayName("FullName ist richtige Laenge")
    void testLengthOfFullName(){
        assertEquals(2 + name.middles().size(), name.fullName().split(" ").length, "FullName ist richtige Laenge!");
    }
}
