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

import java.util.ArrayList;

/**
 * Messages represents a container that contains all the messages a person has
 * types inside OneChat application.
 */
public class Messages {

  /**
   * This is an array of messages that you store. Since it's an ArrayList
   * without specific datatype, you can store anything in it. But to prevent
   * data corruption you make it private so that you can manage the type of data
   * that gets stored in it.
   */
  private final ArrayList messages = new ArrayList();

  /**
   * Adds a new message to the messages container.
   *
   * @param message A message to add to the container.
   */
  public void addMessage(String message) {
    messages.add(message);
  }

  /**
   * Prints out a list of messages that are stored in the container. This method
   * will print out something like:
   *
   * ============================================ 
   * Message 0: Hello
   * Message 1: How are you? 
   * ============================================
   */
  public void listMessages() {
    System.out.println("============================================");
    for (int i = 0; i < messages.size(); i++) {
      /*
            Use %d as a placeholder for int type.
       */
      System.out.format("Message %d: %s\n", i, messages.get(i));
    }
    System.out.println("============================================");
  }

}
