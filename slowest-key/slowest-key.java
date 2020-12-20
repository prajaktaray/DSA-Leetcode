class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int max = releaseTimes[0];
        char result = keysPressed.charAt(0);
        for(int i =1;i<releaseTimes.length;i++){
           // System.out.println(releaseTimes[i]-releaseTimes[i-1]);
            
            if(releaseTimes[i]-releaseTimes[i-1] == max){
                //System.out.print(keysPressed.charAt(i));
                if(keysPressed.charAt(i)>result) result = keysPressed.charAt(i);
            }else if(releaseTimes[i]-releaseTimes[i-1] > max){
                //System.out.print(keysPressed.charAt(i));
                max=releaseTimes[i] -releaseTimes[i-1];
                result = keysPressed.charAt(i);
            }
        }
        return result;
    }
}
