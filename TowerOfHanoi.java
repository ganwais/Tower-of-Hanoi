import java.util.Scanner;
public class TowerOfHanoi{
	public static void main (String[] args){
		findTowerKey t = new findTowerKey();
		int n = 5 ;
		t.move(n,'A','B','C');
	}
}
class findTowerKey{
	public void move( int n , char a, char b , char c){
		if(n == 1){
			System.out.println(a + "->" + c);
		}else{
			move(n-1, a,c,b);
			System.out.println(a + "->" + c);
			move(n-1, b,a,c);
		}
	}
}