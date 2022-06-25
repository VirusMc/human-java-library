package de.virusmc.humanexperiment.common;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.Instant;
import java.util.Date;

/** Repräsentiert die Daten der Geburt und den Tod eines Wesens
 *
 * @version 1.0.1
 *
 * @author VirusMc
 * @since 1.0.1
 */
@Data
@AllArgsConstructor
public class Lifecycle {

    private Date birthday;
    private Date dateOfDeath;


    /** Lässt das Wesen sterben
     *
     * @since 1.0.1
     * @author VirusMc
     * @return Ob das Sterben erfolgreich war
     */
    public boolean passAway() {
        if (isDead()) return false;

        dateOfDeath = new Date(Instant.now().toEpochMilli());
        return true;
    }

    /** Überprüft, ob das Wesen tot ist
     *
     * @since 1.0.1
     * @author VirusMc
     * @return Ob das Wesen tot ist
     */
    public boolean isDead() {
        return dateOfDeath != null;
    }
}
