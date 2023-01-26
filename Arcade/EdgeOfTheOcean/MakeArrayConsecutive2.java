int solution(int[] statues) {
        Arrays.sort(statues);
        int i = 0;
        for (int j = 0; j < statues.length; j++) {
            if ((j + 1) == statues.length) {
                break;
            } else {
                if ((statues[j + 1] - statues[j]) > 1) {
                    int m = (statues[j + 1] - statues[j]);
                    i = i + (m - 1);
                }

            }

        }
        return i;
}
