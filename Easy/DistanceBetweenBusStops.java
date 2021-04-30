https://leetcode.com/problems/distance-between-bus-stops/

class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int dist = getDistanceClock(start, destination, distance);
        return Math.min(dist ,(getSum(distance) - dist));
    }
    
    public int getDistanceClock(int start, int destination, int[] distance){
        int d = 0;
        int newStart = Math.min(start,destination);
        destination = Math.max(start,destination);
        for(int i=newStart; i<destination;i++){
            d += distance[i];
        } 
        return d;
    }
    public int getSum(int[] distance)
    {
        int sum = 0;
        for(int i=0; i<=distance.length-1;i++)
            sum += distance[i];  
        return sum;
    }
}
