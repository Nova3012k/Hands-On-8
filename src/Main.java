import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Creación de perceptrones para la compuerta lógica AND con 2 y 3 entradas
        Perceptron andPerceptron2 = createAndPerceptron(2, 0.1);
        System.out.println("Compuerta AND con 2 entradas:");
        TrainingData.createAndTrainingData2().display();
        System.out.println("\nPesos finales para AND (2 entradas):");
        printWeights(andPerceptron2.getWeights());
        System.out.println("------------------------------------------------------------------");

        Perceptron andPerceptron3 = createAndPerceptron(3, 0.1);
        System.out.println("\nCompuerta AND con 3 entradas:");
        TrainingData.createAndTrainingData3().display();
        System.out.println("\nPesos finales para AND (3 entradas):");
        printWeights(andPerceptron3.getWeights());
        System.out.println("------------------------------------------------------------------");

        // Creación de perceptrones para la compuerta lógica OR con 2 y 3 entradas
        Perceptron orPerceptron2 = createOrPerceptron(2, 0.1);
        System.out.println("\nCompuerta OR con 2 entradas:");
        TrainingData.createOrTrainingData2().display();
        System.out.println("\nPesos finales para OR (2 entradas):");
        printWeights(orPerceptron2.getWeights());
        System.out.println("------------------------------------------------------------------");

        Perceptron orPerceptron3 = createOrPerceptron(3, 0.1);
        System.out.println("\nCompuerta OR 3 entradas:");
        TrainingData.createOrTrainingData3().display();
        System.out.println("\nPesos finales para OR (3 entradas):");
        printWeights(orPerceptron3.getWeights());
        System.out.println("------------------------------------------------------------------");
    }

    // Método para crear y entrenar un perceptrón para la compuerta lógica AND con una cantidad dada de entradas
    public static Perceptron createAndPerceptron(int inputSize, double learningRate) {
        Perceptron perceptron = new Perceptron(inputSize, learningRate);
        TrainingData trainingData = (inputSize == 2) ? TrainingData.createAndTrainingData2() : TrainingData.createAndTrainingData3();
        perceptron.train(trainingData);
        return perceptron;
    }

    // Método para crear y entrenar un perceptrón para la compuerta lógica OR con una cantidad dada de entradas
    public static Perceptron createOrPerceptron(int inputSize, double learningRate) {
        Perceptron perceptron = new Perceptron(inputSize, learningRate);
        TrainingData trainingData = (inputSize == 2) ? TrainingData.createOrTrainingData2() : TrainingData.createOrTrainingData3();
        perceptron.train(trainingData);
        return perceptron;
    }

    // Predice la salida utilizando el perceptrón entrenado con los datos proporcionados
    private static void predictWithPerceptron(Perceptron perceptron, int[][] data) {
        for (int[] input : data) {
            int prediction = perceptron.predict(input);
            System.out.println(Arrays.toString(input) + "= " + prediction);
        }
    }

    // Muestra los pesos finales del perceptrón
    private static void printWeights(double[] weights) {
        System.out.println("= " + Arrays.toString(weights)); // Muestra los pesos finales del perceptrón
    }
}