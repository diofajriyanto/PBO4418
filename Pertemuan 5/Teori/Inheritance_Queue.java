import java.util.Queue;
import java.util.LinkedList;
public class Inheritance_Queue {
      public static void main(String args[]){
            Motor motor = new Motor();
            System.out.println(motor.sisaMotor());
 
            motor.tambahMotor("Honda");
            motor.tambahMotor("Yamaha");
            motor.tambahMotor("Suzuki");
            motor.tambahMotor("Kawasaki");
            motor.tambahMotor("KTM");
            System.out.println(motor.sisaMotor());
 
            Motor.motorBekas(2);
            System.out.println(motor.sisaMotor());
      }      
}

class Toko_Motor {
      Queue<String> merk = new LinkedList<String>();
 
      public Toko_Motor(){
 
      }
      public void setMotor(Queue<String> merk) {
            this.merk = merk;
      }
      public Queue<String> getMotor(){
            return this.merk;
      }
}

class Motor extends Toko_Motor {
      public void tambahMotor(String merk){
            super.getMotor().add(merk);
      }
      public void motorBekas(int index){
            System.out.println(super.getMotor().poll());
      }
      public Queue<String> sisaMotor(){
            return super.getMotor();
      }
} 