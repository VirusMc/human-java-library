package de.virusmc.humanexperiment.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import net.datafaker.Faker;

import java.util.ArrayList;

/** Repräsentation eines Namens für lebende Wesen.
 *
 * @version 1.0.1
 *
 * @author VirusMc
 * @since 1.0.1
 */
@Data
@AllArgsConstructor
public class Name {
    String first;
    ArrayList<String> middles;
    String last;

    public Name(String first, String last){
        this.first = first;
        this.middles = new ArrayList<>();
        this.last = last;
    }

    public Name(String last) {
        Faker faker = new Faker();

        this.first = faker.name().firstName();

        this.middles = new ArrayList<>();
        for (int i = 0; i < faker.random().nextInt(3); i++) {
            middles.add(faker.name().firstName());
        }

        this.last = last;
    }

    public Name() {
        Faker faker = new Faker();

        this.first = faker.name().firstName();

        this.middles = new ArrayList<>();
        for (int i = 0; i < faker.random().nextInt(3); i++) {
            middles.add(faker.name().firstName());
        }

        this.last = faker.name().lastName();
    }

    public String fullName() {
        StringBuilder sb = new StringBuilder();
        sb.append(first).append(" ");

        for (String middle : middles) {
            sb.append(middle).append(" ");
        }

        sb.append(last).append(" ");

        return sb.toString();
    }
}
