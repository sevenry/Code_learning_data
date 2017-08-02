package com.tech.sry;


public class Test{ 
   public void pupAge(){
      int age = 0;
      age = age + 7;
      System.out.println("小狗的年龄是: " + age);
   }
   
   public static void main(String args[]){
      Test test = new Test();
      test.pupAge();
      int a = 10;
      int b = 20;
      int c = 25;
      int d = 25;
      System.out.println("a + b = " + (a + b) );
      System.out.println("a - b = " + (a - b) );
      System.out.println("a * b = " + (a * b) );
      System.out.println("b / a = " + (b / a) );
      System.out.println("b % a = " + (b % a) );
      System.out.println("c % a = " + (c % a) );
      System.out.println("a++   = " +  (a++) );//后缀自增自减法(a++,a--): 先进行表达式运算，再进行自增或者自减运算
      System.out.println("a--   = " +  (a--) );
      // 查看  d++ 与 ++d 的不同
      //System.out.println("d++   = " +  (d++) );
      //System.out.println("++d   = " +  (++d) );//前缀自增自减法(++a,--a): 先进行自增或者自减运算，再进行表达式运算。
      System.out.println(a);
      int x = 2*++a;
      int y = 2*b++;
      System.out.println("自增运算符前缀运算后a="+a+",x="+x);
      System.out.println("自增运算符后缀运算后b="+b+",y="+y);
      System.out.println("90 度的正弦值：" + Math.sin(Math.PI/2));  
      System.out.println("0度的余弦值：" + Math.cos(0));  
      System.out.println("60度的正切值：" + Math.tan(Math.PI/3));  
      System.out.println("1的反正切值： " + Math.atan(1));  
      System.out.println("π/2的角度值：" + Math.toDegrees(Math.PI/2));  
      System.out.println(Math.PI);  
      System.out.println("访问\"菜鸟教程!\"");
      char[] helloArray = { 'r', 'u', 'n', 'o', 'o', 'b'};
      String helloString = new String(helloArray);  
      System.out.println( helloString );
   }
}
