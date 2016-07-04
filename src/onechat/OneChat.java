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
 * OneChat is a messaging application that is built for fun and to demonstrate
 * using encapsulation and other basic concepts of object oriented programming.
 */
public class OneChat {
  
  public static void main(String[] args) {
    /*
    Kick of the process by asking user to login first.
    Upon successful login, Login class returns a Person object.
    */
    Login login = new Login();
    Person somebody = login.start();
    /*
    Print out a message to the chat forum that somebody joined.
    */
    somebody.introduce();
    /*
    Now ask user to start typing messages.
    */
    System.out.println("============================================");
    System.out.println("Start typing you messages.");
    System.out.println("Press ENTER for next line.");
    System.out.println("When you're done, type SEND to send you message.");
    System.out.println("Note that SEND is case sensitive.\n");
    
    // Create a scanner to read user's input.
    Scanner scanner = new Scanner(System.in);
    
    // User will input messages and press ENTER to enter more messages.
    // They'll have to type SEND to end the process and send their messages.
    String message;
    do {
      
      // Read user's input line by line.
      System.out.print("> ");
      message = scanner.nextLine();
      
      // Store each message in the 'messages' container of the Person object.
      // Since SEND is a command, not a message, you don't want to send the
      // SEND command so use if statement to fitler it out.
      if (message.equals("SEND")) {
        somebody.messages.addMessage(message);
      }
      
    } while (!message.equals("SEND"));
    
    // Print out the messages.
    System.out.print("Your messages were sent:");
    somebody.messages.listMessages();
  }
}
