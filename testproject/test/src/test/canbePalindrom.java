package test;

public class canbePalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "geeksogeeks";

		char[] q = s.toCharArray();
		String f = q.toString();
		StringBuilder sb = new StringBuilder();
		for(char b:q) {
			sb.append(b);
		}
		System.out.println(sb);
		System.out.println(sb.reverse());

		int len = s.length();
		int[] a = new int[26];
		for(int i = 0;i<len;i++) {
			a[s.charAt(i)-97] += 1;

		}

		if(moreodd(a)) {
			//System.out.print("no");
		} else {
			//System.out.print("yes");
		}

		char g = 'g';
		char p = 'p';
		int j = (int)g;
		int k = (int)p;
		int x = j-k;
		System.out.print(x);

	}

	private static boolean moreodd(int[] a) {
		// TODO Auto-generated method stub
		int count=0;
		for (int b:a) {
			if(b%2 != 0) {
				count+=1;
			}
		}
		if (count>1) {
			return true;
		}

		return false;
	}

}
