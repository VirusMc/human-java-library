package de.virusmc.humanexperiment.human;

import de.virusmc.humanexperiment.common.Lifecycle;
import de.virusmc.humanexperiment.common.Name;
import lombok.Builder;
import lombok.Data;

/**
 * Repräsentiert einen Menschen
 *
 * @author VirusMc
 * @version 1.0.1
 * @since 1.0.1
 */
@Data
@Builder
public class Human {

    private Name name;
    private Lifecycle lifecycle;
    private Education education;
}
