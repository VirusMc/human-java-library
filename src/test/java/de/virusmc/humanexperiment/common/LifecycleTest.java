package de.virusmc.humanexperiment.common;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Testet die Lifecycle-Klasse
 *
 * @author VirusMc
 * @version 1.0.1
 * @since 1.0.1
 */
public class LifecycleTest {

    Lifecycle lifecycle;

    /**
     * Generiert einen neuen Lifecycle bei jedem Test
     *
     * @author VirusMc
     * @since 1.0.1
     */
    @BeforeEach
    void generateLifecycle() {
        lifecycle = new Lifecycle();
    }

    /**
     * Testet ob der Lifecycle tot ist
     *
     * @author VirusMc
     * @since 1.0.1
     */
    @Test
    @DisplayName("Ist Tod")
    void testIfIsDead() {
        lifecycle.dateOfDeath(new Date(Instant.now().toEpochMilli()));
        assertTrue(lifecycle.isDead());
    }

    /**
     * Testet ob der Lifecycle sterben kann
     *
     * @author VirusMc
     * @since 1.0.1
     */
    @Test
    @DisplayName("Sterben lassen")
    void testPassAway() {
        assertTrue(lifecycle.passAway());
        assertNotNull(lifecycle.dateOfDeath());
    }
}
