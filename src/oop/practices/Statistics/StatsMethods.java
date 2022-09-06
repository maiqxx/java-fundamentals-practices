
package oop.practices.Statistics;


public class StatsMethods {
    
    int numbers[] = new int[]{12, 7, 14, 5, 7, 11, 9};
    
    void displayNumbers(){
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
    
    void getMean(){
        int mean, sum = 0;
        
        for(int i = 0; i <= numbers.length; i++){
            sum = sum + numbers[i];
        }
        mean = sum / numbers.length;
        
        System.out.print("Mean: " + mean);
        
    }
    
    void getMedian(){
        int median = 0;
        int temp;
        
        int i, j;
        
        for(i = 0; i < numbers.length; i++){
            for(j = i + 1; j < numbers.length; j++){
                if(numbers[i] > numbers[j]){
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        int n;
        for(n = 0; n <= numbers.length; n++){
            System.out.print(numbers[n] + " ");
            
            if(n % 2 == 1){
                median = numbers[(n + 1) / 2 - 1];
            } else {
                median = (numbers[n / 2 - 1] = numbers[n / 2]) / 2;
            }
        }
        
        System.out.print("Median: " + median);
        
    }
    
    void getMode(){
        int mode = 0;
        int count = 0;
        int freq = 0;
        
        for(int i = 1; i < numbers.length; i++){
            if(numbers[i - 1] == numbers[i]){
                count++;
                if(count > freq){
                    freq = count;
                    mode = numbers[i];
                }
            }else {
                count = 0;
            }
        }
        System.out.print("Mode: " + mode);
    }
    
    void getRange(){
        int range = 0;
        int min = 0, max = 0;
        
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] <= max && numbers[i] >= min){
                if(numbers[i] > max){
                    max = numbers[i];
                }
                if(numbers[i] < min){
                    min = numbers[i];
                }
            }
        }
        
        range = max - min;
        System.out.print("Range: " + range);
    }    

}
