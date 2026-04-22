def phone_book():
     print("""
     1. Search
     2. Service Nos.
     3. Add name
     4. Erase
     5. Edit
     6. Assign tone
     7. Send b’card
     8. Options
     9. Speed dials
     10. Voice tags
     """)
     choice = int(input("Choose option: "))
         
     if choice == 8:
          print("""
          1. Type of view
          2. Memory status
          """)
def messages():
     print("""
     1. Write messages
     2. Inbox
     3. Outbox
     4. Picture messages
     5. Templates
     6. Smileys
     7. Message settings
     8. Info service
     9. Voice mailbox number
     10. Service command editor
     """)
     choice = int(input("Choose option: "))

     if choice == 7:
          print("""
          1. Set
          2. Common
          """)
          sub_choice = int(input("Choose option: "))

     if sub_choice == 1:
          print("""
          1. Message centre number
          2. Messages sent as
          3. Message validity
          """)
     elif sub_choice == 2:
          print("""
          1. Delivery reports
          2. Reply via same centre
          3. Character support
          """)

def call_register():
     print("""
     1. Missed calls
     2. Received calls
     3. Dialled numbers
     4. Erase recent call lists
     5. Show call duration
     """)
     choice = int(input("Choose option: "))

     if choice == 5:
          print("""
          1. Last call duration
          2. All calls’ duration
          3. Received calls’ duration
          4. Dialled calls’ duration
          5. Clear timers
          """)

def settings():
    print("""
          1. Call settings
          2. Phone settings
          3. Security settings
          4. Restore factory settings
          """)
    choice = int(input("Choose option: "))

    if choice == 1:
          print("""
     1. Automatic redial
     2. Speed dialling
     3. Call waiting options
     4. Own number sending
     5. Phone line in use
     6. Automatic answer
     """)

    elif choice == 2:
          print("""
          1. Language
          2. Cell info display
          3. Welcome note
          4. Network selection
          5. Lights
          6. Confirm SIM service actions
          """)
    elif choice == 3:
          print("""
     1. PIN code request
     2. Call barring service
     3. Fixed dialling
     4. Closed user group
     5. Phone security
     6. Change access codes
     """)

def clock():
     print("""
     1. Alarm clock
     2. Clock settings
     3. Date setting
     4. Stopwatch
     5. Countdown timer
     6. Auto update of date and time
     """)
     choice = int(input("Choose option: "))
     print("You selected option", choice)


def main():
     while True:
          print("""
     ==== NOKIA MENU ====
     1. Phone book
     2. Messages
     3. Chat
     4. Call register
     5. Tones
     6. Settings
     7. Call divert
     8. Games
     9. Calculator
     10. Reminder
     11. Clock
     12. Profiles
     13. SIM services
     0. Exit
     """)
     choice = int(input("Select menu: "))

     if choice == 1:
          phone_book()
     elif choice == 2:
          messages()
     elif choice == 3:
          print("Chat")
     elif choice == 4:
          call_register()
     elif choice == 5:
          print("Tones menu")
     elif choice == 6:
          settings()
     elif choice == 7:
          print("Call divert")
     elif choice == 8:
          print("Games")
     elif choice == 9:
          print("Calculator")
     elif choice == 10:
          print("Reminder")
     elif choice == 11:
          clock()
     elif choice == 12:
          print("Profiles")
     elif choice == 13:
          print("SIM services")
     elif choice == 0:
          print("Exiting...")
           
     else:
          print("Invalid choice")
          
main()          


