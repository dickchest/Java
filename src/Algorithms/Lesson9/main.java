package Algorithms.Lesson9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {
    static int[] weights;

    public static void main(String[] args) {
        int sum = 40;
        int numberOfWeights = 4;
        List<Integer> weightsArray = new ArrayList<>();
        getRecurseWeight(sum, numberOfWeights, weightsArray);


//        getWeights();


    }

    // TODO: 23.05.2023 дописать код 
    private static boolean getRecurseWeight(int sum, int numberOfWeights, List<Integer> weightsArray) {
        if (!weightsArray.isEmpty() && weightsArray.stream().mapToInt(Integer::intValue).sum() == sum) {
            return true;
        }
        return false;
    }


    private static boolean checkAllPossibleWeights() {
        boolean isAllValid = false;
        List<Integer> combination = null;

        for (int i = 1; i <= 40; i++) {
            combination = findWeightCombination(i);
            if (combination == null) {
                isAllValid = false;
                break;
            }
//                System.out.println("Weight: " + i + ", Combination: " + combination);
            isAllValid = true;
        }
        if (isAllValid) {
            System.out.println(combination + " полностью подходит");
        }
        return isAllValid;
    }

    private static void getWeights() {
        for (int i1 = 1; i1 <= 20 - 3; i1++) {
            for (int i2 = i1; i2 <= 40 - i1 - 2; i2++) {
                for (int i3 = i2; i3 <= 40 - i1 - i2 - 1; i3++) {
                    for (int i4 = i3; i4 <= 40 - i1 - i2 - i3; i4++) {
                        if (i1 + i2 + i3 + i4 == 40) {
                            weights = new int[]{i1, i2, i3, i4};
//                                System.out.println(Arrays.toString(weights));
                            if (checkAllPossibleWeights()) {
                                System.out.println("!!!");
                            }
                        }
                    }
                }
            }
        }
    }

    private static List<Integer> findWeightCombination(int target) {
        List<Integer> combination = new ArrayList<>();
        if (findCombination(target, combination, new boolean[weights.length])) {
            return combination;
        }
        return null;
    }

    private static boolean findCombination(int target, List<Integer> combination, boolean[] used) {
        if (target == 0) {
            return true;
        }

        for (int i = 0; i < weights.length; i++) {
            if (!used[i]) {
                combination.add(weights[i]);
                used[i] = true;
                if (findCombination(target - weights[i], combination, used)) {
                    return true;
                } else if (findCombination(target + weights[i], combination, used)) {
                    return true;
                }
                combination.remove(combination.size() - 1);
                used[i] = false;
            }
        }

        return false;
    }
}

