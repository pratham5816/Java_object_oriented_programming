package javaBrocode.statickeyword;


public class MyMain {
    // static = modifier . A single copy of variable/method is created and shared. 
    //                  The class "Owns" the static member.
    public static void main(String[] args) {

        Friend John = new Friend("John");
        Friend sins = new Friend("Sins");
        Friend div = new Friend("Div");

        System.out.println(Friend.numberOfFriends);
        Friend.displayFriends();
        
    }
   
    
}
