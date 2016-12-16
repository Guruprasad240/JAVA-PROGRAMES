import java.util.Scanner;
public class FindLargestSmallestNumber
	{
        public static void main(String[] args)
			{   
                Scanner s = new Scanner(System.in);
				System.out.println("How many numbers you want to enter");
				int a = s.nextInt();
				//int... = a
                int numbers[] = new int[a];
               
                //assign first element of an array to largest and smallest
                int smallest = numbers[0];
                int largest  = numbers[0];
               
                for(int i=0; i<numbers.length; i++)
                {
					System.out.println("Enter "+(i+1)+" numbers you want to enter");
					numbers[i] = s.nextInt();
					//largest  = largnumbers[i];
						if(numbers[i] > largest)
						{
                               largest = numbers[i];
						}
						else(number[i] < largest )
						{
								smallest = numbers[i];
						}
						/*else
						{
							System.out.println("you enterd number is 0");
						}*/
				}
               
               System.out.println("Largest Number is : " + largest);
               System.out.println("Smallest Number is : " + smallest);
			}
	}