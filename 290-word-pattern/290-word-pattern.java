class Solution {
    public boolean wordPattern(String pattern, String s) {
	String[] strArr = s.split(" ");
	if (pattern.length() != strArr.length) return false;
	Map<String, Character> sToPatternDic = new HashMap<String, Character>();
	Map<Character, String> patternToSDic = new HashMap<Character, String>();
	for (int i = 0; i < strArr.length; i++) {
		if (sToPatternDic.containsKey(strArr[i])) {
			if (sToPatternDic.get(strArr[i]) != pattern.charAt(i)) return false;
		} else {
			sToPatternDic.put(strArr[i], pattern.charAt(i));
		}
		if (patternToSDic.containsKey(pattern.charAt(i))) {
			if (!Objects.equals(patternToSDic.get(pattern.charAt(i)),strArr[i])) return false;
		} else {
			patternToSDic.put(pattern.charAt(i), strArr[i]);
		}
	}
	return true;
}
}