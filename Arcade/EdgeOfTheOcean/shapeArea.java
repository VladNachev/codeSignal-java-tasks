int solution(int n) {
    int result;
    if (n == 1) {
        result = 1;
        return result;
    } else {
        result = ((2 * (n - 1)) * n) + 1;
        return result;
    }

}
