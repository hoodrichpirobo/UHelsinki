import java.util.*;

public class MessagingService {
    
    ArrayList<Message> Messages;
    
    public MessagingService(){
        Messages = new ArrayList<>();
    }
    
    public void add(Message message){
        if(message.getContent().length()<=280){
            this.Messages.add(message);
        }
    }
    
    public ArrayList<Message> getMessages(){
        return Messages;
    }
    
}
