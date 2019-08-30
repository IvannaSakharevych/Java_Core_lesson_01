package lesson01;

public class Task3 {

	public static void main(String[] args) {
		// Створити масив, наповнити його 10 значеннями типу int, 
		// знайти максимальна та мінімальне значення в масиві та вивести їх на консоль.
		
		int [] array = new int[10];
		array[0] = 65;
		array[1] = -24;
		array[2] = 53;
		array[3] = 31;
		array[4] = 89;
		array[5] = 7;
		array[6] = 44;
		array[7] = -72;
		array[8] = 12;
		array[9] = 91;

		int max = 0;
        int min = array[0];
		
        //знаходимо найбільше значення масиву
		for (int i = 0; i < array.length; i++) {
	            if (max < array[i]){ max = array[i]; 
	            }
	        }
	        System.out.println("max = " + max);

	     //знаходимо найменше значення масиву
	     for (int i = 0; i < array.length; i++) {  
	            if (min > array[i]){ min = array[i];
	            }
	        }
	        System.out.println("min = " + min);
	}
}