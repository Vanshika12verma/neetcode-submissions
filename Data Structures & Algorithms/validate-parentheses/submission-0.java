class Solution {
    public boolean isValid(String s) {
        String prev = "";
        while (!prev.equals(s)) {
            prev = s;
            s = s.replace("()","");
            s = s.replace("[]","");
            s = s.replace("{}","");
        }
        return prev.isEmpty();
    }
}
