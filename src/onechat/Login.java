/**
 * Copyright (c) 2016 Soheil Moayedi Azarpour
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package onechat;
import java.util.Scanner;

/**
 * Login class represents the welcome screen that will be presented to
 * the user to introduce themselves and begin to chat.
 */
public class Login {
  /**
   * Starts the login process by asking user to enter their first and 
   * last name. Upon successful login, it returns a Person object that
   * has the first name and last name.
   * @return A Person object.
   */
  public Person start() {
    Person person = new Person();
    Scanner inputScanner = new Scanner(System.in);
    /*
    Start a chat by asking user to enter their name.
    */
    System.out.println("============================================");
    System.out.println("Welcome to OneChat application:");
    System.out.println("============================================");
    
    System.out.print("To begin, enter you first name: ");
    String firstName = inputScanner.nextLine();
    
    System.out.print("and you last name, please: ");
    String lastName = inputScanner.nextLine();
    
    person.setFirstName(firstName);
    person.setLastName(lastName);
    
    System.out.println("============================================");
    System.out.println("You are successfully logged in.");
    System.out.println("============================================");
    
    return person;
  }
}
