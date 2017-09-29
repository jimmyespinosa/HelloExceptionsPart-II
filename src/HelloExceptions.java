
public class HelloExceptions {

	public static void main(String[] args) {

		// ArrayIndexOutOfBoundsException
		/*
		 * ArrayIndexOutOfBoundsException Exception will be thrown here because
		 * i <= name.length This is an illegal index because i will eventually
		 * reach the 4th index which doesn't exist in the array.
		 */

		try {
			String[] name = { "snap", "crackle", "pop" };
			for (int i = 0; i <= name.length; i++) {
				System.out.print(name[i] + '\n');
			}

		} catch (ArrayIndexOutOfBoundsException aioobe) {
			System.out.println("EXCEPTION: An additional index was reached but it does not exist!");
		}

		// ClassCastException
		/*
		 * The ClassCastException is thrown when the code attempts to cast an
		 * object to a subclass that is not an instance
		 */
		try {
			Object x = new Integer(0);
			System.out.println((String) x);
		} catch (ClassCastException cce) {
			System.out.println("EXCEPTION: Integer cannot be cast into String");
		}

		carModel();

	}

	private static void carModel(String make, String model) throws IllegalArgumentException {
		if (make == null || model == null) {
			throw new IllegalArgumentException("The make cannot be null!");
		}
		return 0;
	}

}
