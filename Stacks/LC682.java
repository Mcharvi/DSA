class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<operations.length; i++){
                    String ch =  operations[i];

            if(ch.equals("+")){
                int a = st.pop();
                int b = st.pop();
                int sum = a+b;
                st.push(b);
                st.push(a);
                st.push(sum);
             }
            else if(ch.equals("D")){
                int a = st.pop();
                int b = 2*a;
                st.push(a);
                st.push(b);
            }
             else if(ch.equals("C")){
                st.pop();
            }
            else{
                 st.push(Integer.parseInt(ch));

            }
    }
    int total = 0;
        while (!st.isEmpty()) {
            total += st.pop();
        }
        return total;
    }
}