class Solution {
    public boolean isAnagram(String s, String t) {
        Map <Character, Integer> sh = new HashMap<>();
        // Map <Character, Integer> th = new HashMap<>();
        int sl = s.length();
        int tl = t.length();

        if(sl != tl) return false;

        for (int i = 0; i < sl; i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            sh.put(sc, sh.getOrDefault(sc, 0) + 1);
            sh.put(tc, sh.getOrDefault(tc, 0) - 1);
        }
       
        for(Integer v : sh.values()){
            if(v != 0) return false;
        }
        return true;
    }
}
