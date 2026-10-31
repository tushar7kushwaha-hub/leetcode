class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i < numRows; i++){
            List<Integer> newList = new ArrayList<>();
            for(int j = 0; j<=i; j++){
                if(j == 0 || j == i){
                    newList.add(1);
                }else{
                    int leftAbove = list.get(i - 1).get(j - 1);
                    int rightAbove = list.get(i - 1).get(j);
                    newList.add(leftAbove + rightAbove);
                }
            }
            list.add(newList);
        }
        return list;
    }
}