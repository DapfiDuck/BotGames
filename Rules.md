# BotGames
BotGames is a round based programming game in which each bot can perform one action each round.

The players join into a 10 by 10 field, of which they see a 3 by 3 area. player A in the top left (0/0) and player B in the bottom right (9, 9). This view is passed in the form of a two-dimensional byte array. 0 means free, 1 means player and two means wall. The Bot is then required to return one of the following statements:

* 0 idle
* 1 up
* 2 down
* 3 left
* 4 right
* 5 blow
* 6 laser
* 7 shield

Either in the form of the number, or they can pass the reference of the variable (Example in .java)

The blow ability does 10 Hp damage to every bot next to the player (Distance < 2) and 5 HP damage to the player himself.

The laser shoots in the direction the player is looking. If it hits a bot it does 5 HP damage to the bot and no damage to the player, if it does not hit anything the player gets 2 HP of damage.

The shield blocks any damage the player may get in the opponents next move.

You may only edit the BotA.java, which is then copied into the Competition project and for test purposes BotB.java.
These two classes extend the Bot.java, of which you may use the following functions:

* getHP();
* getX();
* getY();
* getRotation();

All of which return bytes.
The Rotation is saved as Bytes between 1 and 4. 1 meaning up, counting up while rotating clockwise.

| / | 1 | \ |  
|---|---|---|  
| 4 | + | 2 |  
| \ | 3 | / |

The Player always looks in the direction he last walked in.

The super constructor of the Bot may not be edited excluding the Name of your bot/yourself.
