
public class arrayInsert{
	public static void insert(int[] a,int[] p,int n,int pos){
		for(int i=a.length-1;i>=pos;i--){
			p[i+1] = a[i];
		}
		p[pos] = n;
		for(int j=0;j<pos;j++){
			p[j] = a[j];
		}
	}
	public static void main(String[] args){
		int[] a = {12,13,15,16,17};
		int i;
		for(i=0;i<a.length;i++){
			System.out.print(a[i]+"\t");
		}
		System.out.println();
		int n=14;
		int pos=2;
		System.out.println("Element to be added: "+n+" at position: "+pos);
		int[] p =new int[a.length+1];		
		insert(a,p,n,pos);
		for(i=0;i<p.length;i++){
			System.out.print(p[i]+"\t");
		}
	}
}
