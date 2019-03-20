class Method_over{
  static int x=300;
   static int y=200;


   void display(int a,int b){
     System.out.println("a+b ="+(x+y));
   }
   void display(int a,double b){
     System.out.println("a+b ="+a+b);
   }

   public static void main(String a[]){
     Method_over obj=new Method_over();
     obj.display(x,y);
     obj.display(x,3.3);
   }
}
