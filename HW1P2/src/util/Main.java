package util;

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class Euler {
	void eulerFunction(int n) {
		/*
		Creates a boolean array and initializes all entries. 
		Values in prime[i] are false if i isn't a prime.
		*/
		boolean prime[] = new boolean[n + 1];
		for (int i = 0; i < n; i++)
			prime[i] = true;
		for (int p = 2; p * p <= n; p++) {
			// If prime[p] isn't changed, then it's prime
			if (prime[p] == true) {
				// Update all multiples of p
				for (int i = p * p; i <= n; i += p)
					prime[i] = false;
			}
		}
		// Print all prime numbers
		String printedPrimes = "";
		for (int i = 2; i <= n; i++) {
			if (prime[i] == true) {
				printedPrimes += (i + " ");
			}
		}
		System.out.println(printedPrimes);
		try {
			String file = "HW2TestFile";
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter outfile = new PrintWriter(bw);
			outfile.print(printedPrimes);
			outfile.close();
			System.out.println("Primes successfully writen to: " + file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public class Main {
	public static void main(String[] args) {
		// Main Method that runs the program.
		int n;
		char repeatKey;
		boolean repeat = false;
		System.out.println("Homework 1 Pt. 2");
		while (repeat == false) {
			System.out.println("Please enter the desired size:");
			Scanner size = new Scanner(System.in);
			n = size.nextInt();
			Euler start = new Euler();
			start.eulerFunction(n);
			System.out.println("Do you want to enter another number? (y/n)");
			System.out.println("*Disclaimer* Primes written to file will replaced.");
			Scanner repeatCheck = new Scanner(System.in);
			repeatKey = repeatCheck.next().charAt(0);
			if (repeatKey == 'n' || repeatKey == 'N') {
				System.out.println("Implemented by James Sipowicz -- 9/10/19");
				size.close();
				repeatCheck.close();
				break;
			} else {
				continue;
			}
		}
	}
}