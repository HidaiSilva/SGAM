package br.gov.sp.fatec;


public class mainTest {
	
	public static String criarEndereco(int rua,int est,int pra,int ver,int hor) {
		//int rua = 1;
		int r = 1;
		//int est = 2;
		int e = 1;
		//int pra = 4;
		int p = 1;
		//int ver = 2;
		int v = 1;
		//int hor = 8;
		int h = 1;
				
		
		while(r <= rua) {
			while(e <= est) {
				while(p <= pra) {
					while(v <= ver) {
						while(h <= hor) {
							System.out.println(r+""+e+""+p+""+v+""+h);
							h++;
						}
						h = 1;
						v++;
					}
					v=1;
					p++;
				}
				p = 1;
				e++;
			}
			e = 1;
			r++;
		}
		return "vrau";
	}
	
	public static void main(String[] args) {
		
		
		
		//IntStream.range(1, 10).forEach(i -> System.out.print(i + " "));
//		Range num = new Range(1,10);
//		Range rua = new Range(1,2);
//		Range est = new Range(1,3);
//		Range pra = new Range(1,5);
//		Range ver = new Range(1,3);
//		Range hor = new Range(1,9);
	
		criarEndereco(1,1,1,3,2);
		
		
//		for(int r : rua) {
//			for(int e : est) {
//				for(int p : pra){
//					for(int v : ver) {
//						for(int h : b) {
//							System.out.println(r+""+e+""+p+""+v+""+h);
//						}
//					}
//				}
//			}
//		}
		
	}

}
