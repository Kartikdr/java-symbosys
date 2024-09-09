package uplodeproram;

public class callbyvalue {
	
	    public static void main(String[] args) {
	        int a = 10;
	        int b = 20;
	        System.out.println("Before swap: a = " + a + ", b = " + b);
	        swapByValue(a, b);
	        System.out.println("After swap: a = " + a + ", b = " + b);
	    }

	    public static void swapByValue(int a, int b) {
	        int temp = a;
	        a = b;
	        b = temp;
	    }
	    public class Main {
	        public static void main(String[] args) {
	            int[] numbers = {10, 20};
	            System.out.println("Before swap: a = " + numbers[0] + ", b = " + numbers[1]);
	            swapByReference(numbers);
	            System.out.println("After swap: a = " + numbers[0] + ", b = " + numbers[1]);
	        }

	        public static void swapByReference(int[] numbers) {
	            int temp = numbers[0];
	            numbers[0] = numbers[1];
	            numbers[1] = temp;
	        }
	        public class main {
	            public static void swapByReference(String[] args) {
	                int a = 10;
	                int b = 20;
	                System.out.println("Before swap: a = " + a + ", b = " + b);
	                swapWithoutThirdVariable(a, b);
	                System.out.println("After swap: This method doesn't return anything. We will do it in main");
	                a = a + b;
	                b = a - b;
	                a = a - b;
	                System.out.println("After swap: a = " + a + ", b = " + b);
	            }

	            public static void swapWithoutThirdVariable(int a, int b) {
	                System.out.println("In method Before swap: a = " + a + ", b = " + b);
	                a = a + b;
	                b = a - b;
	                a = a - b;
	                System.out.println("In method After swap: a = " + a + ", b = " + b);
	            }
	        }
	    }
	}

