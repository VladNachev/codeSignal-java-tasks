
int solution(int[] inputArray) {
    int max = Integer.MIN_VALUE;
    
    for(int i =0; i<inputArray.length-1;i++){
        
        int temp = inputArray[i]*inputArray[i+1];
        if(temp>max){
            max=temp;}
        
    }
    return max;
}
