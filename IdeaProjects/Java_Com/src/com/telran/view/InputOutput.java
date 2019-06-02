package com.telran.view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.util.function.Function;

public interface InputOutput {
    String readString(String promt);
    void  write(Object obj);

    default void writeLn(Object obj){
        write(obj + "\n");
    }

    default <R> R readObject(String promt, String error, Function<String,R> mapper){
        while(true){
            String line = readString(promt);
            try {
                return mapper.apply(line);
            }catch(RuntimeException e){
                writeLn(error);
            }
        }
    }

    default  int readInt(String promt){
        return readObject(promt,"Its not a number",Integer::parseInt);
    }

    default int readInt(String promt,int min,int max){
        return readObject(promt,String.format("Its not int in range",min,max),s->{
          int val = Integer.parseInt(s);
          if(val <min && val>max){
              throw new NumberFormatException();
          }
          return val;
        });
    }

    default  Long readLong(String promt){
        return readObject(promt,"Its not a long number",Long::parseLong);
    }

    default double readDouble(String promt){
        return readObject(promt,"Its not a double number",Double::parseDouble);
    }

    default LocalDate readDate(String promt,String format){
        return readObject(promt+"["+format+"]","Wrong format",s->{
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
            return LocalDate.parse(s,formatter);
        });
    }
}
