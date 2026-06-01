class Solution {
    public int calPoints(String[] operations) {
        List<Integer> arr = new ArrayList<>();
        for(String oper : operations){
            if(Character.isDigit(oper.charAt(0)) || oper.charAt(0)=='-'){
                arr.add(Integer.parseInt(oper));
            }
            if(oper.equals("C")){
                arr.remove(arr.size()-1);
            }
            if(oper.equals("D")){
                int ele = arr.get(arr.size()-1)*2;
                arr.add(ele);            
            }
            if(oper.equals("+")){
                int ele = arr.get(arr.size()-1) + arr.get(arr.size()-2);
                arr.add(ele);
            }
        }
        int sum = 0;
        for(int i =0;i<arr.size();i++){
            sum+=arr.get(i);
        }
        return sum;
    }
}