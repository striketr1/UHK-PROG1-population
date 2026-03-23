package pro1;

import pro1.data.Muni;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TestDataUtils {
    public static List<Muni> getTestData() {
        var districts = getDistricts();
        ArrayList<Muni> result = new ArrayList<>();
        try (var is = TestDataUtils.class.getClassLoader().getResourceAsStream("obce.csv")) {
            var lines = new java.io.BufferedReader(new java.io.InputStreamReader(is)).lines().toList();
            lines.stream().skip(1).forEach(line->{
                var split = line.split(",");
                var districtName = districts.get(split[0]);
                result.add(new Muni(split[2], split[1], districtName, split[0], Integer.parseInt(split[3]), Integer.parseInt(split[4]), Integer.parseInt(split[5]), Double.parseDouble(split[6]), Double.parseDouble(split[7]), Double.parseDouble(split[8])));
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    private static HashMap<String, String> getDistricts() {
        var result = new HashMap<String, String>();
        try (var is = TestDataUtils.class.getClassLoader().getResourceAsStream("okresy.csv")) {
            if (is == null) {
                throw new RuntimeException("Resource not found: okresy.csv");
            }

            // Read lines from the stream
            var lines = new java.io.BufferedReader(new java.io.InputStreamReader(is, java.nio.charset.StandardCharsets.UTF_8))
                    .lines()
                    .toList();

            lines.stream().skip(1).forEach(line -> {
                var split = line.split(",");
                result.put(split[2], split[1]);
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return result;
    }
}
