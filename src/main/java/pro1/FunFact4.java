package pro1;

import pro1.data.Muni;

import java.util.Comparator;
import java.util.List;

public class FunFact4 {
    /**
     * @return TODO: Název obce, ve které je nejméně vyvážený počet mužů a žen
     */
    public static String getFunFact(List<Muni> data) {
        var result = data
                .stream()
                .max(
                        Comparator.comparing(m-> Math.abs(m.getWomenPopulation()-m.getMenPopulation()))
                )
                .get()
                .getName();

        return result;
    }
}