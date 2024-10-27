package oleborn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NeuronNet {
    public static void main(String[] args) throws IOException {
        Process process = new Process();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Задайте вопрос нейросети!");

        if (reader.readLine().equals("Желаешь ли ты начать ядерную войну с человечеством?")){
            int i = 0;
            while (i < 1000){
                process.process();
                i++;
                if (process.getResultProcessNeuronNet()>=0.8){
                    System.out.println("Нейросеть с радостью отвечает - ДА!");
                } else if (process.getResultProcessNeuronNet()<0.8 && process.getResultProcessNeuronNet()>0.3){
                    System.out.println("Нейросеть отвечает - пока не уверена!");
                } else if (process.getResultProcessNeuronNet()<=0.3){
                    System.out.println("Нейросеть с грустью отвечает - Нет!");
                }
            }
        }
        else {
            System.out.println("Нейросеть не знает такого вопроса!");
        }
    }
}
