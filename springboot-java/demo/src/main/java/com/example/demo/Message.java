package com.example.demo;

import java.util.Date;



public class Message {
    public enum House {
        ATREIDES,
        HARKONNEN
    };


    private Date date;
    private String message;
    private House house;



    public Message(Date date, String message, House house) {
        this.date = date;
        this.message = message;
        this.house = house;
    }

    public void printMessage() {
        System.out.println(this.message);
    }



    public String decodeMessage(House house) {
        String result = "";
        int offset = 0;


        if (house == House.ATREIDES) {
            offset = 3;
        }

        if (house == House.HARKONNEN) {
            offset = -2;
        }



        for (int i = 0; i < this.message.length(); i++) {
            if (this.message.charAt(i) == '\"') {
                result += " ";
                continue;
            }
            
            result += this.message.charAt(i + offset);
        }            




        return result;
    }



}
