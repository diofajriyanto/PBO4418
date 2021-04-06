import java.util.Stack;

public class Inheritance_Stack {
      public static void main(String args[]){
            Sayur sayur = new Sayur();
            System.out.println(sayur.sisaSayur());
 
            sayur.tambahSayur("Lodeh");
            sayur.tambahSayur("Gori");
            sayur.tambahSayur("Asem asem");
            System.out.println(sayur.sisaSayur());
 
            sayur.gantiSayur(1,"Sop");
            System.out.println(sayur.sisaSayur());
 
            sayur.sayurBusuk();
            System.out.println(sayur.sisaSayur());
      }
}
 
class Masak_Sayur {
      Stack<String> vegetable = new Stack<String>();
 
      public Masak_Sayur(){
 
      }
      public void setSayur(Stack<String> vegetable) {
            this.vegetable = vegetable;
      }
      public Stack<String> getSayur(){
            return this.vegetable;
      }
} 
 
class Sayur extends Masak_Sayur {
      public void tambahSayur(String vegetable){
            super.getSayur().push(vegetable);
      }
      public String sayurBusuk(){
            return super.getSayur().pop();
      }
      public void gantiSayur(int index,String vegetable){
            super.getSayur().set(index, vegetable);
      }
      public Stack<String> sisaSayur(){
            return super.getSayur();
      }
}

