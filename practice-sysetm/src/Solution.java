import  java.io.*;
import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.toList;

class Result {

    public static int countPairs(List<Integer> projectCosts, int target) {
        Set<Integer> seen = new HashSet<>();
        Set<String> distinctPairs = new HashSet<>();
        for (int cost : projectCosts) {
            if (seen.contains(cost - target)) {
                distinctPairs.add((cost - target) + "," + cost);
            }
            if (seen.contains(cost + target)) {
                distinctPairs.add(cost + "," + (cost + target));
            }
            seen.add(cost);
        }
        return distinctPairs.size();
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int projectCostsCount = Integer.parseInt(bufferedReader.readLine().trim());
        List<Integer> projectCosts = IntStream.range(0, projectCostsCount)
                .mapToObj(i -> {
                    try {
                        return bufferedReader.readLine().replaceAll("\\s+$", "").trim();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .map(Integer::parseInt)
                .collect(toList());

        int target = Integer.parseInt(bufferedReader.readLine().trim());
        int result = Result.countPairs(projectCosts, target);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
        bufferedReader.close();
        bufferedWriter.close();
    }
}