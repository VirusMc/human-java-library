package de.virusmc.humanexperiment.common;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/** Testet die Namenklasse
 *
 * @version 1.0.1
 *
 * @author VirusMc
 * @since 1.0.1
 */
public class NameTest {

    Name name;

    /** Generiert einen neuen Namen bei jedem Test
     *
     * @since 1.0.1
     * @author VirusMc
     */
    @BeforeEach
    void setName(){
        name = new Name();
    }

    /** Testet die Generierung des vollen Namens
     *
     * @since 1.0.1
     * @author VirusMc
     */
    @Test
    @DisplayName("FullName ist richtige Laenge")
    void testLengthOfFullName(){
        assertEquals(2 + name.middles().size(), name.fullName().split(" ").length, "FullName ist richtige Laenge!");
    }
}
