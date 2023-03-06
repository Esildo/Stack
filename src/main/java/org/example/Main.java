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
            String str = br.readLine();

            while((buf=br.readLine())!= null)
            {
                str += (" " + buf );
            }
            System.out.println(str);
            System.out.println(str);
            String[] nums = str.split(" ");
            for(int i = 0 ; i < nums.length ; i++)
            {
                switch(nums[i])
                {
                    case "push":
                        i++;
                        stack.push(Integer.parseInt(nums[i]));
                        break;
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
                }
            }
        }
        catch (IOException ex)
        {
            ex.getMessage();
        }




    }
}