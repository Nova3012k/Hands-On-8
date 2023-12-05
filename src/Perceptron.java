public class Perceptron {
    private final double[] weights; // Array para almacenar los pesos del perceptrón
    private final double learningRate; // Tasa de aprendizaje del perceptrón
    private final MatematicasDis discreteMaths;

    // Constructor del perceptrón
    public Perceptron(int inputSize, double learningRate) {
        this.weights = new double[inputSize];
        this.learningRate = learningRate;
        this.discreteMaths = new MatematicasDis();

        // Inicialización de los pesos con valores aleatorios pequeños para facilitar la convergencia
        for (int i = 0; i < weights.length; i++) {
            weights[i] = Math.random() * 0.1;
        }
    }

    // Método para realizar una predicción basada en las entradas proporcionadas
    public int predict(int[] inputs) {
        return discreteMaths.predict(inputs, weights); // Usa MatematicasDis para predecir la salida
    }

    // Método para entrenar el perceptrón con un conjunto de datos de entrenamiento
    public void train(TrainingData trainingData) {
        int[][] data = trainingData.data();
        int[] targets = trainingData.targets();

        // Entrenamiento del perceptrón utilizando el conjunto de datos durante un número fijo de épocas
        for (int epoch = 0; epoch < 1000; epoch++) {
            for (int i = 0; i < data.length; i++) {
                trainSingleInstance(data[i], targets[i]);
            }
        }
    }
    // Método privado para entrenar el perceptrón con una sola instancia de datos y su objetivo correspondiente
    private void trainSingleInstance(int[] inputs, int target) {
        discreteMaths.trainSingleInstance(inputs, target, weights, learningRate);
    }

    // Método para obtener los pesos del perceptrón después del entrenamiento
    public double[] getWeights() {
        return weights;
    }
}