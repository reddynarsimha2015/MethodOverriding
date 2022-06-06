public class P{
public void propery(){
System.out.println("parent properties");
}
public void marry(){
System.out.println("marrybhavani");
}
}
public class C extends P{
public  void marry(){
System.out.println("marry potti");
}
}
public class Test{
public static void main(String[] args){
P p=new P();
p.propery();
p.marry();
}
}