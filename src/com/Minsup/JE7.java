package com.Minsup;

public class JE7 {
	public static void main(String[] args) {
		// find a missing number in a string
		String test1 = "2345689";
		String test2 = "313334353637";
		String test3 = "9899100102103";
		
		String result;
		result = FindMissingNum(test1);
		System.out.println(result);
		result = FindMissingNum(test2);
		System.out.println(result);
		result = FindMissingNum(test3);
		System.out.println(result);
	}
	
	static String FindMissingNum(String test) {
		String result = "No missing number found";
		int max_digits = test.length()/2;
		
		int res_digits=0, res_index=0;
		for(int digits=1; digits<=max_digits; digits++) {
			int max_idx = test.length()/digits * digits;  // 32 / 3 * 3 = 30
			int prev = -1;
			Integer res_num=0;
			boolean bFound = true;
			int add = 0;
			for(int idx=0; idx<max_idx; idx+=digits+add) {
				String sub = test.substring(idx, idx+digits+add);
				int num = 0;
				for(int k=0; k<digits+add; k++) {
					num *= 10;
					num += sub.charAt(k) - '0';
				}
				if(prev < 0) {
					prev = num;
					continue;
				}
				else if(num - prev == 1) {
					prev = num;
				}
				else if(num - prev == 2) {
					res_index = idx;
					res_digits = digits+add;
					res_num = prev+1;
					prev = num;
				} 
				else {
					String sub2 = test.substring(idx, idx+digits+1);
					num = 0;
					for(int k=0; k<digits+1; k++) {
						num *= 10;
						num += sub.charAt(k) - '0';
					}
					if(num - prev == 1) {
						add = 1;
						prev = num;
					}
					else if(num - prev == 2) {
						add = 1;
						res_index = idx;
						res_digits = digits+add;
						res_num = prev+1;
						prev = num;
					}
					bFound = false;
				}
			}
			if(bFound == true) {
				return test.substring(0, res_index) +" "+ res_num.toString() + " "+ test.substring(res_index); 
			}
		}
		
		return result;
	}
}
