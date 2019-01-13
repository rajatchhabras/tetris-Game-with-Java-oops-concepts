package project;
import java.util.*;
public class data {
void move(board b,shape s,char m,LinkedList<undu> link)
{
	int p,types;
     p=s.change(m,b);
	if(p==1) {
		 
		b.still(s,m);
	b.addShape(s);
	board b1=new board(b);
	 shape set=new shape(s);

	 System.out.println(b1);
	 undu u1=new undu();
	  u1.b=b1; 
	  u1.s=set;
	  System.out.println("values "+u1.s.p.Arr[0][0]);
	  link.addLast(u1);
	b.print();
	}
	else {
		b.minimize();
  b.addingLast();
 
		Random rand=new Random();
	types=rand.nextInt(6);	
	
	s.getshape('*',types,0);
	b.addShape(s);
	 board b1=new board(b);
	  shape set=new shape(s);
	  undu u=new undu();
	  u.b=b1;
	  u.s=set;
	  System.out.println(" from containers values "+u.s.p.Arr[0][0]+b1);
	  link.addLast(u);
     b.print();
     
}
}
	public static void main(String[] args)  throws  CloneNotSupportedException{
		int inside=0;
		LinkedList<undu> link=new LinkedList<undu> ();
		undu ue=new undu();
		data d=new data();
	int types;
	char move;
   board b=new board(20,35);
   Random rand=new Random();
   types=rand.nextInt(6);
      b.clear();
shape s=new shape();
s.getshape('*',types,0);
b.addShape(s);
b.print();
board b1=new board(b);
shape set=new shape(s);
undu u1=new undu();
 u1.b=b1; 
 u1.s=set;
 //ystem.out.println("values "+u1.s.p.Arr[0][0]);
 link.addLast(u1);
Scanner sc=new Scanner(System.in);
move=sc.next().charAt(0);

while(true)
{
	
	
	if((move=='b'||move=='l'||move=='r'||move=='p')&&inside==0)
	d.move(b,s,move,link);

	else if(inside==1||move=='u') {
		System.out.println("here");
		if(link.size()==1) {
			move='b';
			undu t=link.getLast();
			d.move(t.b,t.s,move,link);	
		}
		else {
		undu se=link.getLast();
		System.out.println("address is "+se.b);
		System.out.println("address is "+se.b.max_col);
		System.out.println("address is "+se.s.p.Arr[0][0]);
		se.b.addShape(se.s);
		se.b.print();
		if(move=='b'||move=='l'||move=='r'||move=='p')
			d.move(se.b,se.s,move,link);
		
			else
		link.removeLast();
		}
		inside=1;
		
	}
	move=sc.next().charAt(0);
}
	}

}
