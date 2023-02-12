package example.test;

import org.example.service.MessageBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class MessageBuilderTest {
    @Test
    public void testGetMessage1() {
        MessageBuilder obj = new MessageBuilder();
        System.out.println(obj.getMessage("test"));
        assertEquals("hello test", obj.getMessage("test"));
    }
    @Test
    public void testGetMessage2() {
        MessageBuilder obj = new MessageBuilder();
        System.out.println(obj.getMessage(""));
    }
    @Test
    public void testGetMessage3(){
        MessageBuilder obj = new MessageBuilder();
        System.out.println(obj.getMessage(null));
    }
}
