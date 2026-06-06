// Problem Name : Library Interface - OOPS Week Problem
// Topic        : Interface
// Language     : Java
 
public class LibraryInterfaceDemo {
 
    public static void main(String[] args) {
 
        // ── Test Case #1 : KidUser ──────────────────────────────────────
 
        kidUser kid = new kidUser();
 
        kid.age = 10;
        kid.registerAccount();
 
        kid.age = 18;
        kid.registerAccount();
 
        kid.bookType = "Kids";
        kid.requestBook();
 
        kid.bookType = "Fiction";
        kid.requestBook();
 
        // ── Test Case #2 : AdultUser ────────────────────────────────────
 
        adultUser adult = new adultUser();
 
        adult.age = 5;
        adult.registerAccount();
 
        adult.age = 23;
        adult.registerAccount();
 
        adult.bookType = "Kids";
        adult.requestBook();
 
        adult.bookType = "Fiction";
        adult.requestBook();
    }
}

// Output :

//      You have successfully registered under a Kids Account
//      Sorry, Age must be less than 12 to register as a kid
//      Book Issued successfully, please return the book within 10 days
//      Oops, you are allowed to take only kids books
//      Sorry, Age must be greater than 12 to register as an adult
//      You have successfully registered under an Adult Account
//      Oops, you are allowed to take only adult Fiction books
//      Book Issued successfully, please return the book within 7 days