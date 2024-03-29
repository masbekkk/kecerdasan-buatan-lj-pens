public class Perceptron {
    public static final int [][][] andData = {{{0,0},{0}},
{{0,1},{0}},
                                                 {{1,0},{0}},
                                                {{1,1},{1}}};
  
    public static final double LEARNING_RATE =0.05;
    public static final double[] INITIAL_WEIGHT = {Math.random(), Math.random()};
  
    //buat method untuk menghitung bobot
    public double calculateWeightedSum(int[] data, double[] weights) {
           double weightedSum = 0;
           for(int x = 0; x < data.length; x++)
                  weightedSum += data[x] * weights[x];
           return weightedSum;
    }
    //method untuk fungsi Aktifasi
    public int applyActivationFunction(double weightedSum) {
           int result = 0;
           if(weightedSum > 1) result = 1;
           return result;
    }
    //method penyesuaian bobot
    public double [] adjustWeights(int[] data, double[] weights, double error) {
           double[] adjustWeights = new double[weights.length];
           for(int x=0; x < weights.length; x++)
                  adjustWeights[x] = LEARNING_RATE * error * data[x] + weights[x];
           return adjustWeights;
    }

}
