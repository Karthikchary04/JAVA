package interview_tasks;

public class AbsSort {
	public static void main(String[] args) {
		int data[] = { 56, 0, 98, -4, 56, -50, 32, 4, 3, 1 };
		int n1, n2, temp;
		display(data);
		System.out.println();
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length - 1 - i; j++) {
				n1 = (data[j] < 0) ? -1 : 1;
				n2 = (data[j + 1] < 0) ? -1 : 1;
				data[j] *= n1;
				data[j + 1] *= n2;
				if (data[j] > data[j + 1]) {
					temp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = temp;
					data[j] *= n2;
					data[j + 1] *= n1;
				} else {
					data[j] *= n1;
					data[j + 1] *= n2;
				}
			}
		}
		display(data);
	}

	static void display(int a[]) {
		for (int x : a) {
			System.out.print("  " + x);
		}
	}
}
