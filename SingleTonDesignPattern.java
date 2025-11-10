class A{
    private static A ref;
    private A(){
      //Private constructor
       System.out.println("Singleton instance created!");
    }
    static A getObject(){
        if(ref==null){
          ref=new A();
        }
        return ref;  
    }
}
class SingleTonDesignPattern{
    public static void main(String[] args) {
      //A a1 = new A();A() has private access in A
       A a1=A.getObject();//It will return new object
       A a2=A.getObject();
       System.out.println(a1==a2);
    }
}