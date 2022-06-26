package de.virusmc.humanexperiment.common;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.Instant;
import java.util.Date;

/**
 * Repräsentiert die Daten der Geburt und den Tod eines Wesens
 *
 * @author VirusMc
 * @version 1.0.1
 * @since 1.0.1
 */
@Data
@AllArgsConstructor
public class Lifecycle {

    private Date birthday;
    private Date dateOfDeath;

    public Lifecycle() {
        birthday = new Date(Instant.now().toEpochMilli());
        dateOfDeath = null;
    }

    public Lifecycle(Date birthday) {
        this.birthday = birthday;
        this.dateOfDeath = null;
    }


    /**
     * Lässt das Wesen sterben
     *
     * @return Ob das Sterben erfolgreich war
     * @author VirusMc
     * @since 1.0.1
     */
    public boolean passAway() {
        if (isDead()) return false;

        dateOfDeath = new Date(Instant.now().toEpochMilli());
        return true;
    }

    /**
     * Überprüft, ob das Wesen tot ist
     *
     * @return Ob das Wesen tot ist
     * @author VirusMc
     * @since 1.0.1
     */
    public boolean isDead() {
        return dateOfDeath != null;
    }
}
