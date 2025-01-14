public class UserRegistration {

   
   

    
    public boolean validateUser(String username, String password, String email) {
        // Validate username length
        if (username.length() < 5 || username.length() > 20) {
            System.out.println("Username must be between 5 and 20 characters.");
            return false;
        }
       
        // Check for duplicate username
        if (isUsernameTaken(username)) {
            System.out.println("Username is already taken.");
            return false;
        }
       
        // Validate email format
        if (!email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            System.out.println("Invalid email format.");
            return false;
        }
       
        // Validate password complexity
        if (!password.matches(".*[!@#$%^&*()].*")) {
            System.out.println("Password must contain at least one special character.");
            return false;
        }

      
        return true;
    }

    
    private boolean isUsernameTaken(String username) {
        
        return false;
    }
    public static void main(String[] args) {
        UserRegistration registration = new UserRegistration();
       

        String username = "testUser";
        String password = "password!";
        String email = "test@example.com";

        boolean isValid = registration.validateUser(username, password, email);
        System.out.println("Validation result: " + isValid);
    }
}