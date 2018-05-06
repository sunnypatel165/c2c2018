class InsertionSorter implements IntSorter {
    @Override
    public int[] sort(int[] arr) {
        int len = arr.length;
		int[] arrCopy = new int[len];

		System.arraycopy(arr, 0, arrCopy, 0, len);

		for (int i = 0; i < len; i++) {
			int j = i;
			int t = arrCopy[j];

			// Shift everything leftwards
			while (j > 0 && arrCopy[j - 1] > t) {
				arrCopy[j] = arrCopy[j - 1];
				j--;
			}

            // Drop current element into its correct place
			arrCopy[j] = t;
		}

		return arrCopy;
    }
}
