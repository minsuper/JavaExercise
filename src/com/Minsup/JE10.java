package com.Minsup;
import java.io.*;
import java.nio.file.*;

public class JE10 {
	public static void main(String[] args) {
		// find the minimum number of boxes needed
		BufferedReader bufReader = null;
		int numBox=0, barcodeLength=0;
		int barcode[][] = null;
		
		try {
			bufReader = new BufferedReader(new FileReader("JE10input.txt"));
			String line;
			line = bufReader.readLine();
			String[] token = line.split(" ");
			numBox = Integer.valueOf(token[0]);
			barcodeLength = Integer.valueOf(token[1]);
			barcode = new int[numBox][];
			for(int i=0; i<numBox; i++) {
				line = bufReader.readLine();
				token = line.split(" ");
				barcode[i] = new int[barcodeLength];
				for(int j=0; j<barcodeLength; j++) {
					barcode[i][j] = Integer.valueOf(token[j]);
				}
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		for(int i=0; i<numBox; i++) {
			for(int j=0; j<barcodeLength; j++) {
				System.out.print(barcode[i][j] + " ");
			}
			System.out.println("");
		}

		// find distances between boxes
		int dist[][] = new int[numBox][numBox];
		for(int i=0; i<numBox; i++) {
			for(int j=i; j<numBox; j++) {
				dist[i][j] = dist[j][i] = CalcDist(barcode, i, j);
			}
		}

		for(int i=0; i<numBox; i++) {
			for(int j=0; j<numBox; j++) {
				System.out.print(dist[i][j] + " ");
			}
			System.out.println("");
		}
		
		int min_group = findGroup(dist);
		System.out.println("The minimum group : " + min_group);
	}
	
	static int CalcDist(int[][] barcode, int i, int j) {
		int codeLen = barcode[0].length;
		
		int count=0;
		for(int k=0; k<codeLen; k++) {
			if(barcode[i][k] != barcode[j][k])
				count++;
		}
		return count;
	}
	
	static int findGroup(int[][] dist) {

	}
}
