import java.util.Arrays;

// Clase TrainingData que representa los datos de entrenamiento para el perceptrón
public record TrainingData(int[][] data, int[] targets) {

    // Método para mostrar los datos de entrenamiento y sus objetivos
    public void display() {
        for (int i = 0; i < data.length; i++) {
            System.out.println(Arrays.toString(data[i]) + " = " + targets[i]);
        }
    }

    // Método para crear datos de entrenamiento para la compuerta AND con dos entradas
    public static TrainingData createAndTrainingData2() {
        int[][] trainingData = {
                {0, 0},
                {0, 1},
                {1, 0},
                {1, 1}
        };
        int[] targets = {0, 0, 0, 1}; // Resultados esperados para la compuerta (en este caso AND 2 entradas)
        return new TrainingData(trainingData, targets);
    }

    // Método para crear datos de entrenamiento para la compuerta AND con tres entradas
    public static TrainingData createAndTrainingData3() {
        int[][] trainingData = {
                {0, 0, 0},
                {0, 0, 1},
                {0, 1, 0},
                {0, 1, 1},
                {1, 0, 0},
                {1, 0, 1},
                {1, 1, 0},
                {1, 1, 1}
        };
        int[] targets = {0, 0, 0, 0, 0, 0, 0, 1};
        return new TrainingData(trainingData, targets);
    }

    // Método para crear datos de entrenamiento para la compuerta OR con dos entradas
    public static TrainingData createOrTrainingData2() {
        int[][] trainingData = {
                {0, 0},
                {0, 1},
                {1, 0},
                {1, 1}
        };
        int[] targets = {0, 1, 1, 1};
        return new TrainingData(trainingData, targets);
    }

    // Método para crear datos de entrenamiento para la compuerta OR con tres entradas
    public static TrainingData createOrTrainingData3() {
        int[][] trainingData = {
                {0, 0, 0},
                {0, 0, 1},
                {0, 1, 0},
                {0, 1, 1},
                {1, 0, 0},
                {1, 0, 1},
                {1, 1, 0},
                {1, 1, 1}
        };
        int[] targets = {0, 1, 1, 1, 1, 1, 1, 1}; // Resultados esperados para la compuerta OR con 3 entradas
        return new TrainingData(trainingData, targets);
    }
}