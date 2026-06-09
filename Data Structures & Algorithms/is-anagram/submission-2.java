class Solution {
    public boolean isAnagram(String s, String t) {
        Map <Character, Integer> sh = new HashMap<>();
        Map <Character, Integer> th = new HashMap<>();
        int sl = s.length();
        int tl = t.length();

        if(sl != tl) return false;

        for (int i = 0; i < sl; i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            sh.put(sc, sh.getOrDefault(sc, 0) + 1);
            th.put(tc, th.getOrDefault(tc, 0) + 1);
        }
       
        for(char k : sh.keySet()){
            if(!sh.get(k).equals(th.get(k))) return false;
        }
        return true;
    }
}
