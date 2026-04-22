import java.util.Scanner;

public class NokiaMenu {

public static void main(String[] args) {
 Scanner input = new Scanner(System.in);

System.out.println("Press 1 for phone book");
System.out.println("Press 2 for Messages");
System.out.println("Press 3 for security chat");
System.out.println("Press 4 for call register ");
System.out.println("Press 5 for tone ");
System.out.println("Press 6 for setting");
System.out.println("Press 7 for call divert");
System.out.println("Press 8 prepaid game ");
System.out.println("Press 9 for calculator");
System.out.println("Press 10 prepaid game ");
System.out.println("Press 11 clock ");
System.out.println("Press 12 profiles");
System.out.println("Press 13 for sim services3 ");



 int choice = input.nextInt();

 switch (choice) {

  case 1->{
  System.out.println("""
     1. Search
     2. Service Nos. 1
     3. Add name
     4. Erase
     5. Edit
     6. Assign tone
     7. Send b’card
     8. Options
     9. Speed dials
     10. Voice tags
     """);

     System.out.println("Choose options :");
       int choices = input.nextInt();
          
     switch (choices) {
     
     case 8->{
     System.out.println("""
     1. Type of view
     2. Memory status
     """);     
 }

 }
}
case 2->{
     System.out.println("""
     1. Write messages
     2. Inbox
     3. Outbox
     4. Picture messages
     5. Templates
     6. Smileys
     7. Message settings
     8. Info service
     9. Voice mailbox number
     10.Service command editor
     """);
 System.out.println("Choose options :");
  int choices = input.nextInt();
switch(choices){ 
case 7->{
System.out.println("""
     1. Set 12
     2. Common 3
""");
}
}

     System.out.println("Choose options :");
       int Userchoices = input.nextInt();
          
     switch (Userchoices) {
     
     case 1->{
     System.out.println("""
     1. Message centre number
     2. Messages sent as
     3. Message validity
     """);
     }

     case 2->{
     System.out.println("""
     1. Delivery reports
     2. Reply via same centre
     3. Character support
     """);
     }
}
}
  
     case 3->{
     System.out.println("""
     1:Chat
     """);
     }
         
 
     
     case 4->{
     System.out.println("""
     1. Missed calls
     2. Received calls
     3. Dialled numbers
     4. Erase recent call lists
     5. Show call duration
     """);
 int choices = input.nextInt();
  switch (choices) {
     
     case 5->{
     System.out.println("""
     1. Last call duration
     2. All calls’ duration
     3. Received calls’ duration
     4. Dialled calls’ duration
     5. Clear timers
     """);
 
       }   
           
     case 6->{
     System.out.println("""
     Show call costs
     1. Last call cost
     2. All calls’ cost
     3. Clear counters
     """);
     }
 
  case 7->{
     System.out.println("""
     all cost settings
     1. Call cost limit
     2. Show costs in
     """);
} 

 

  case 8->{
     System.out.println("""
     Prepaid credit
     """);
 
     }
       
      }    
 
     }
     case 5->{
     System.out.println("""
     1. Ringing tone
     2. Ringing volume
     3. Incoming call alert
     4. Composer
     5. Message alert tone
     6. Keypad tones
     7. Warning and game tones
     8. Vibrating alert
     9. Screen saver
     """);
 }
    
     case 6->{
     System.out.println("""
     1: Call settings
     2:Phone settings
     3:Security settings
     4:Restore factory settings
     """);
     int choices = input.nextInt();
switch (choices) {
     case 1->{
     System.out.println("""

     1. Automatic redial
     2. Speed dialling
     3. Call waiting options
     4. Own number sending
     5. Phone line in use
     6. Automatic answer 
     """);
     }
 
case 2->{
     System.out.println("""
     Phone Setting
     
     1. Language
     2. Cell info display
     3. Welcome note
     4. Network selection
     5. Lights2
     6. Confirm SIM service actions
     """);
 }
     case 3->{
    System.out.println("""
    1. PIN code request
    2. Call barring service
    3. Fixed dialling
    4. Closed user group
    5. Phone security
    6. Change access codes""");
}

 case 4->{
  System.out.println("4. Restore factory settings");

}
}
}
case 7->{
     System.out.println("""
     1. Call divert""");
}
case 8->{
System.out.println("""
     1.Games""");
}
case 9->{
System.out.println("""
     1.Calculator""");
}
case 10->{
System.out.println("""
     1.Reminder""");
}
      

case 11->{
     System.out.println("""
     1. Alarm clock
     2. Clock settings
     3. Date setting
     4. Stopwatch
     5. Countdown timer
    6. Auto update of date and time""");
 System.out.println("Choose options :");
  int choices = input.nextInt();
switch(choices){ 
case 1->{
System.out.println("""
. Alarm clock
2. Clock settings
3. Date setting
4. Stopwatch
5. Countdown timer
6. Auto update of date and time
""");
}

case 12->{
System.out.println("""
1 profiles
""");

}
case 13->{
System.out.println("""
1.SIM services3
""");
}


}


}






}


}
}











 





