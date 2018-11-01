package com.company;

import java.util.Scanner;

public class ChatBotRunner
{


    public static void main(String[] args)
    {
        ChatBot1 chatbot1 = new ChatBot1();
        ChatBot2 chatbot2 = new ChatBot2();
        ChatBot3 chatbot3 = new ChatBot3();


        Scanner in = new Scanner (System.in);
        System.out.println("Welcome to the chatbot, nice to meet you.");
        String statement = in.nextLine();


        while (!statement.equals("Bye"))
        {
            //Use Logic to control which chatbot is handling the conversation\
            //This example has only chatbot1



            chatbot1.chatLoop(statement);


            statement = in.nextLine();


        }
    }

}
