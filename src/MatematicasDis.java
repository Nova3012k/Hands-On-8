public class MatematicasDis {
    public int predict(int[] inputs, double[] weights) {
        double sum = 0;

        // Calcula la suma ponderada de las entradas y pesos
        for (int i = 0; i < weights.length; i++) {
            sum += inputs[i] * weights[i];
        }

        return (sum >= 0.5) ? 1 : 0; // Devuelve 1 si la suma ponderada es mayor o igual a 0.5, de lo contrario, devuelve 0
    }

    // Método para entrenar con un solo conjunto de datos
    public void trainSingleInstance(int[] inputs, int target, double[] weights, double learningRate) {

        // Realiza una predicción basada en los pesos y las entradas actuales
        int prediction = predict(inputs, weights);

        // Calcula el error entre la predicción y el objetivo
        int error = target - prediction;

        // Actualiza los pesos según el error y la tasa de aprendizaje
        for (int i = 0; i < weights.length; i++) {
            weights[i] += learningRate * error * inputs[i];
        }
    }
}