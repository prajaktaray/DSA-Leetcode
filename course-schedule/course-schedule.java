class Solution {
    //bsf
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] courses = new int[numCourses];
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        for(int[]req: prerequisites){
            if(!map.containsKey(req[1])){
                map.put(req[1], new ArrayList<>());
            }
            map.get(req[1]).add(req[0]);
            courses[req[0]]++;
        }
        Queue<Integer> q= new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(courses[i] ==0) q.add(i);
        }
        
        while(!q.isEmpty()){
            int curr = q.poll();
            List<Integer> list =map.get(curr);
            if(list !=null){
                for(Integer l:list){
                courses[l]--;
                if(courses[l] ==0) q.add(l);
            }
                
            }
            
        }
        for(int i=0;i<numCourses;i++){
            if(courses[i] >0) return false;
        }
        return true;
    }
}