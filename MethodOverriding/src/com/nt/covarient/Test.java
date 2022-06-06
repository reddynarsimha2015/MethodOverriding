package com.nt.covarient;
//covarient applicable for only objectt but not primitive type
public class Test{
public static void main(String[] args){
P p=new P();
p.m1();
p.getNumber();
C c=new C();
c.m1();
c.getNumber();
P p1=new C();
p1.m1();
p1.getNumber();

}
}