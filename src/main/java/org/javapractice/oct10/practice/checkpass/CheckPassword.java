package org.javapractice.oct10.practice.checkpass;

public class CheckPassword {

    private int strength;

    private  void checkPassword(String password) {
        int strength = calculatePasswordStrength(password);
        try{
            castException(strength);
        } catch (VeryWeakPassword e){
            System.out.println(e.getMessage());
        }
        catch (WeakPasswordException e){
            System.out.println(e.getMessage());
        }
    }
    private  int calculatePasswordStrength(String password){
        //total score of password
        int iPasswordScore = 0;

        if( password.length() < 8 )
            return 0;
        else if( password.length() >= 10 )
            iPasswordScore += 2;
        else
            iPasswordScore += 1;

        //if it contains one digit, add 2 to total score
        if( password.matches("(?=.*[0-9]).*") )
            iPasswordScore += 2;

        //if it contains one lower case letter, add 2 to total score
        if( password.matches("(?=.*[a-z]).*") )
            iPasswordScore += 2;

        //if it contains one upper case letter, add 2 to total score
        if( password.matches("(?=.*[A-Z]).*") )
            iPasswordScore += 2;

        //if it contains one special character, add 2 to total score
        if( password.matches("(?=.*[~!@#$%^&*()_-]).*") )
            iPasswordScore += 2;

        return iPasswordScore;
    }
    private void castException(int strength) throws WeakPasswordException, VeryWeakPassword{
        if (strength  >= 0 && strength <= 2){
            throw new VeryWeakPassword("Very weak password!");
        } else if (strength >= 3 && strength <= 6) {
            throw new WeakPasswordException("Weak password!");
        }
        else{
            System.out.println("Good password!");
        }
    }
    public static void main(String[] args) {
        String pass = "abc123Fa";
        CheckPassword cp = new CheckPassword();
        cp.checkPassword(pass);
    }
}

