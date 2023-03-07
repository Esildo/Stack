package org.example;

import java.io.*;


class Program
{
    public static void main(String args[])
    {
        Stack stack = new Stack();

       try(BufferedReader br = new BufferedReader(new FileReader("C:\\nikita\\Coding\\input.txt.txt")))
        {
            String buf ;
            String str;

            while((buf=br.readLine())!= null)
            {

                switch(buf)
                {
                    case "back":
                        stack.show();
                        break;
                    case "pop":
                        stack.pop();
                        break;
                    case "clear":
                        stack.clear();
                        break;
                    case "size":
                        stack.size();
                        break;
                    case "exit":
                        System.out.println("bye");
                        System.exit(0);
                        break;
                    default:
                        String[] nums = buf.split(" ");
                        if(nums[0].equals("push"))
                        {
                            stack.push(Integer.parseInt(nums[1]));
                        }
                        break;

                }
            }


        }
        catch (IOException ex)
        {
            ex.getMessage();
        }

    }
}