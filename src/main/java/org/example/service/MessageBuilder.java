package org.example.service;

public class MessageBuilder {
    public String getMessage(String name)  {
        StringBuilder result = new StringBuilder();
        if ( name == null  || name.trim() .length() == 0 ) {
            result.append("empty!");
        }else {
            result.append("hello "+ name);
        }
        return  result.toString();
    }
}
