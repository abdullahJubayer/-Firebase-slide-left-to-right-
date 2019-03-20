class Ovv{
  public void show(){
      System.out.println("This is Super class");
  }
}

class Ovv2 extends Ovv{
  public void show(){
      System.out.println("This is Sub class");
  }
}

class Main extends Ovv2{
  public static void main(String s[]){
     Ovv obj=new Ovv2();
    obj.show();
  }
}
