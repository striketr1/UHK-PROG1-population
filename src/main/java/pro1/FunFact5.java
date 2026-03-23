package pro1;

import pro1.data.Muni;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class FunFact5 {
    /**
     * @return TODO: Názvy obcí s nejméně obyvateli
     * @param count: počet hledaných obcí
     */
    public static List<String> getFunFact(List<Muni> data, int count) {
        var result = data
                .stream()
                .filter(m -> m.getPopulation()>0)
                .sorted(
                Comparator
                        .comparing(Muni::getPopulation)
                )
                .limit(count)
                .map(Muni::getName)
                .toList();

    return result;
    }

    /**
     * @return TODO: Názvy obcí s nejméně obyvateli, oddělené čárkou
     * @param count: počet hledaných obcí
     */
    public static String getFunFactJoined(List<Muni> data, int count) {

        var result = data
                .stream()
                .filter(m -> m.getPopulation()>0)
                .sorted(
                        Comparator
                                .comparing(Muni::getPopulation)
                )
                .limit(count)
                .map(Muni::getName)
                .toList();

        return result;
    }
}