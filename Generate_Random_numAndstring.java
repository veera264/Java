package demo;

import java.util.Random;

class random_Number{
	public void random(int num) {
		Random rand=new Random();
		int n=rand.nextInt(num);
		System.out.println(n);
	}
}

//for random string we have to download the apachi commons to generate random strings
public class Generate_Random_numAndstring {

	public static void main(String[] args) {
		
		random_Number fw=new random_Number();
		fw.random(10);
	}

}
