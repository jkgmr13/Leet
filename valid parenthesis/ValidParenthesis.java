class ValidParenthesis {
    public boolean isValid(String s) {
        int test = 0;
        Deque<Integer> deq = new LinkedList<>();
        try{
            for(int i = 0; i < s.length(); i++){
                switch(s.charAt(i)){
                    case '(':
                       deq.push(1);
                        break;
                    case '{':
                        deq.push(2);
                        break;
                    case '[':
                        deq.push(3);
                        break;
                    case ')':
                        test = deq.pop();
                        if(test != 1) return false;
                        break;
                    case '}':
                        test = deq.pop();
                        if(test != 2) return false;
                        break;
                    case ']':
                        test = deq.pop();
                        if(test != 3) return false;
                }
            }
            return deq.poll() == null;
        }
        catch (Exception e){return false;}
    }
}