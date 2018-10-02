package programs;

public class Studentparam {
int id;
String name;
Studentparam(int i,String n){
	id = i;
	name = n;
	}
void display() {
	System.out.println(id+" "+name);
}
public static void main(String args[]) {
	Studentparam s = new Studentparam(100,"meenu");
	Studentparam s1 = new Studentparam(200,"maha");
	Studentparam s2 = new Studentparam(300,"mayu");
	s.display();
	s1.display();
	s2.display();
}
}
