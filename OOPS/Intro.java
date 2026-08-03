public class Intro{
    public static void main(String args[]){
        System.out.println("Welcome back Aayush!");
        Pen p1 = new Pen();
        // p1.color = "Brown";
        p1.setColor("Brown");
        System.out.println(p1.getColor());
    }
}
class Pen{
        private String color;
        private int tip;

        String getColor(){
            return this.color;
        }

        int getTip(){
            return this.tip;
        }

        void setColor(String color){
            this.color = color;
        }

        void setTip(int tip){
            this.tip = tip;
        }
    }

// public class Intro{
//     public static void main(String[] args) {
//         Pen p1 = new Pen();
//         p1.setColor("Blue");
//         System.out.println(p1.getColor());
//         p1.setTip(5);
//         System.out.println(p1.getTip());
//         // p1.color = "Yellow";        // Any one can easily change the value of the color! That is bad!
//         // System.out.println(p1.color);
//         p1.setColor("Yellow");
//         System.out.println(p1.getColor());

//         // BankAccount myAcc = new BankAccount();
//         // myAcc.username = "Aayush";
//         // myAcc.setPassword("abcdefghi");
//     }
// }

// // class BankAccount{
// //     public String username;
// //     private String password;
// //     public void setPassword(String newP){
// //         password = newP;
// //     }
// // }

// class Pen{
//     private String color;
//     private int tip;

//     String getColor(){
//         return this.color;
//     }

//     int getTip(){
//         return this.tip;
//     }

//     void setColor(String newClr){
//         this.color = newClr;
//     }

//     void setTip(int Tip){
//         this.tip = Tip;
//     }
// }

