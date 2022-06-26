package de.virusmc.humanexperiment.common;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Testet die Namen-Klasse
 *
 * @author VirusMc
 * @version 1.0.1
 * @since 1.0.1
 */
public class NameTest {

    Name name;

    /**
     * Generiert einen neuen Namen bei jedem Test
     *
     * @author VirusMc
     * @since 1.0.1
     */
    @BeforeEach
    void setName() {
        name = new Name();
    }

    /**
     * Testet die Generierung des vollen Namens
     *
     * @author VirusMc
     * @since 1.0.1
     */
    @Test
    @DisplayName("FullName ist richtige Laenge")
    void testLengthOfFullName() {
        assertEquals(2 + name.middles().size(), name.fullName().split(" ").length, "FullName ist richtige Laenge!");
    }
}
