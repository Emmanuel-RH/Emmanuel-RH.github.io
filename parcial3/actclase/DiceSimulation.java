public import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class DiceSimulation {
    public static void main(String[] args) {
        // Definir las probabilidades esperadas para cada resultado
        Map<Integer, Double> expectedProbabilities = new HashMap<>();
        expectedProbabilities.put(2, 1.0 / 36);
        expectedProbabilities.put(3, 2.0 / 36);
        expectedProbabilities.put(4, 3.0 / 36);
        expectedProbabilities.put(5, 4.0 / 36);
        expectedProbabilities.put(6, 5.0 / 36);
        expectedProbabilities.put(7, 6.0 / 36);
        expectedProbabilities.put(8, 5.0 / 36);
        expectedProbabilities.put(9, 4.0 / 36);
        expectedProbabilities.put(10, 3.0 / 36);
        expectedProbabilities.put(11, 2.0 / 36);
        expectedProbabilities.put(12, 1.0 / 36);

        // Simular 50,000 tiradas de dos dados
        int numberOfSimulations = 50000;
        Random random = new Random();
        Map<Integer, Integer> observedFrequencies = new HashMap<>();
        for (int i = 0; i < numberOfSimulations; i++) {
            int dice1 = random.nextInt(6) + 1;
            int dice2 = random.nextInt(6) + 1;
            int total = dice1 + dice2;
            observedFrequencies.put(total, observedFrequencies.getOrDefault(total, 0) + 1);
        }

        // Calcular las probabilidades observadas
        Map<Integer, Double> observedProbabilities = new HashMap<>();
        for (Map.Entry<Integer, Integer> entry : observedFrequencies.entrySet()) {
            int total = entry.getKey();
            int frequency = entry.getValue();
            double probability = (double) frequency / numberOfSimulations;
            observedProbabilities.put(total, probability);
        }

        // Comparar resultados observados y esperados
        System.out.println("Resultado\tProbabilidad Esperada\tProbabilidad Observada");
        System.out.println("------------------------------------------------------");
        for (int total = 2; total <= 12; total++) {
            double expectedProb = expectedProbabilities.get(total);
            double observedProb = observedProbabilities.getOrDefault(total, 0.0);
            System.out.printf("%d\t\t%.6f\t\t\t%.6f%n", total, expectedProb, observedProb);
        }
    }
}
 probar {
    
}
