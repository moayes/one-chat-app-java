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

/**
 * Person is a class that represents a person in real life.
 */
public class Person {

  /**
   * The first name of the person.
   */
  private String firstName;
  /**
   * The last name of the person.
   */
  private String lastName;
  /**
   * Messages is a container that holds the list of messages a person has sent
   * in OneChat application.
   */
  public Messages messages = new Messages();
  /**
   * The initials of the person. This is set automatically and is managed
   * internally by the receiver (Person class).
   *
   * Initials is an array of String that has maximum 2 members. First object is
   * the first letter of first name. Last object is the first letter of last
   * name.
   *
   * Initials is updated automatically whenever first name and last name are
   * set.
   */
  private final String[] initials = new String[2];

  /**
   * Sets the first name of the person.
   *
   * @param firstName the first name of the person.
   */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
    /*
    Get the first character of firstName using substring() method.
    You pass in the beginning index and the length.
     */
    initials[0] = firstName.substring(0, 1).toUpperCase();
  }

  /**
   * Sets the last name of the person.
   *
   * @param lastName the last name of the person.
   */
  public void setLastName(String lastName) {
    this.lastName = lastName;
    /*
    Get the first character of lastName using substring() method.
    You pass in the beginning index and the length.
     */
    initials[1] = lastName.substring(0, 1).toUpperCase();
  }

  /**
   * Tells the receiver (an instance of Person) to introduce itself. The
   * receiver will print out a welcoming message in the console.
   */
  public void introduce() {
    /*
      Print out a nice message that looks like this:
        Hello there!
        My name is John Smith.
        Yours, JS!
      Use %s as a placeholder for String.
     */
    System.out.format("Hello there!\nMy name is %s %s.\nYours, %s%s!\n\n", firstName, lastName, initials[0], initials[1]);
  }
}
