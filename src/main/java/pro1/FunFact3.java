package pro1;

import pro1.data.Muni;

import java.util.List;

public class FunFact3 {
    /**
     * @return TODO: Celkový počet obyvatel v obcích, které mají více než 10_000 obyvatel
     */
    public static int getFunFact(List<Muni> data) {
        var result = data
                .stream()
                .filter(o->o.getPopulation() > 10000)
                .mapToInt(Muni::getPopulation)
                .sum();

        return result;
    }
}