package oleborn;

public class UtilsMethods {

    public void sendMessage(String message){
//       System.out.println(message+"\n");
    }

    public double calculateSumWeightInNeuronNet(double in1, double w11, double in2, double w2, double dias) {
        return (in1 * w11) + (in2 * w2) + dias;
    }
    public double calculateSigmoid(double weight){
        return (1 / (1 + Math.exp(-weight)));
    }

    public double calculateError(double result, double meaning){
        return (result - meaning) * result * (1-result);
    }

    public double errorForWeight(double error, double resultSigmoidInNeuron){
        return error * resultSigmoidInNeuron * (1-resultSigmoidInNeuron);
    }

    public double calculateNewWeight(double oldWeight, double error, double trainingSpeed){
        return oldWeight - (error * trainingSpeed);
    }

}
