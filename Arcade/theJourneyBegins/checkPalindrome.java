boolean solution(String inputString) {
    StringBuffer reversebuffer = new StringBuffer(inputString);
    reversebuffer.reverse();
    String reverseWord = new String(reversebuffer);
    return reverseWord.equals(inputString);

}
