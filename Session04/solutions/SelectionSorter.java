class SelectionSorter implements IntSorter {
    @Override
    public int[] sort(int[] arr) {
        int len = arr.length;
		int[] arrCopy = new int[len];

		System.arraycopy(arr, 0, arrCopy, 0, len);

		int j = 0;

		while (j < len) {
			int min = Integer.MAX_VALUE;
			int index_of_min = -1;

			// Find the minimum
            // We start from j because the first j-1 elements must be sorted by this point
			for (int i = j; i < len; i++) {
				if (arrCopy[i] < min) {
					min = arrCopy[i];
					index_of_min = i;
				}
			}

			// Place it at its position
			arrCopy[index_of_min] = arrCopy[j];
			arrCopy[j] = min;
			j++;
		}

		return arrCopy;
    }
}
