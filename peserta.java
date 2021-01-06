/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muhammad Fakhruddin
 */
public class peserta                                                              
{
    private String firstName, lastName, username;
    
    public peserta()
    {
        this.firstName = "MUHAMMAD";
        this.lastName = "FAKHRUDDIN";
    }
    
    public peserta(String username)
    {
        this.username = username;
    }
    
    public void printUsername()                                                 //Polymorphism declared by setting up methods in parent class
    {
        System.out.println(username);
    }
    
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public String toString()
    {
        return firstName + " " + lastName;
    }
    
}