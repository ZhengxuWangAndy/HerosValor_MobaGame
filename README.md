## Hero & Valor: A terminal based MOBA game

## Files
---------------------------------------------------------------------------
<A brief description of each file and what it does>

Classes below:

### Battle package
1. `CheckRange.java` -> * Check hero and monster's distance and check attack range
2. `Battle.java` ->  the class for battle, using generics type to deal with different kind of hero and monsters
   
### Role package
1. `Hero.java` ->  The ood.Hero class defined the common things of heroes.
2. `Exoskeletons.java` ->  the class for ood.Exoskeletons to process its own specialty, extends from ood.Monster
3. `Dragons.java` -> * the class for dragons to process its own specialty, extends from ood.Monster
4. `Sorcerers.java` ->  The ood.Sorcerers class defined the attributes and methods of ood.Sorcerers extends from ood.Hero.
5. `Paladins.java` -> * The class for build a ood.Paladins hero, extends from ood.Hero, contains its own specialty.
6. `Spirits.java` ->  The class for build a ood.Spirits ood.Monster, extends from ood.Monster, contains its own specialty.
7. `RoleMethods.java` -> * Define the common method and necessary method of Roles.
8. `Monster.java` ->  The ood.Monster class defined the common things of monsters.
9. `Role.java` ->  The ood.Role class defined the common things of heroes and monsters.
10. `Warriors.java` ->  The ood.Warriors class defined the attributes and methods of ood.Warriors extends from ood.Hero.
11. `Generator.java` ->  Generator class use for generate heroes and monsters.
   
### Utils package
1. `FileReader.java` -> * The File reader to handle different file in to a file object.
2. `InputCheck.java` ->  the class for input check, check is it a valid number or string, and it's range.
3. `Controller.java` ->  the class for deal with the input when user want's to move on map.
4. `ColorfulOutput.java` ->  the class for deal with the output, giving colorful output.
   
### Game package
1. `ValorProcessor.java` ->  The processor of this specific game.
2. `HeroValorGame.java` -> * Extends from Game class and serve for Hero Valor game.
3. `Game.java` -> * Abstract class of game with common
   
### Cell package
1. `Buff.java` -> * A interface for Cell to get hero a buff or remove buff
2. `Cell_Nexus_H.java` ->  the class for this game's special Cell, contains different symbol and methods extends from the general cell class and hero legends cell class.
3. `HeroLegendCell.java` ->  the class for this game's special ood.Cell, contains  extends from the general cell class.
4. `Cell_Bush.java` ->  the class for this game's special Cell, contains different symbol and methods extends from the general cell class and hero legends cell class.
5. `Cell_Koulou.java` ->  the class for this game's special Cell, contains different symbol and methods extends from the general cell class and hero legends cell class.
6. `Cell_Plain.java` ->  the class for this game's special Cell, contains different symbol and methods extends from the general cell class and hero legends cell class.
7. `Cell_Cave.java` ->  the class for this game's special Cell, contains different symbol and methods extends from the general cell class and hero legends cell class.
8. `Cell_Nexus_M.java` ->  the class for this game's special Cell, contains different symbol and methods extends from the general cell class and hero legends cell class.
9. `Cell.java` ->  the class for ood.Cell, reuse the ood.Cell class from the board game, it's a general cell class.
10. `Cell_Inaccessible.java` ->  the class for this game's special Cell, contains different symbol and methods extends from the general cell class and hero legends cell class.
   
### Map package
1. `Recall.java` ->  The recall function to get back to nexus on map,
2. `Teleport.java` ->  Teleport function for move to another hero's around on map.
3. `GameMap.java` -> * The game's map extends from ood.Board and contains cell.
4. `Lane.java` ->  The lane of game map.
5. `Board.java` ->  the class for ood.Board, reuse the board class from the board game
   
### Team package
1. `HerosTeam.java` ->  the class for Heroes team, extends from the general team class.
2. `Team.java` ->  the general class for team, using the generic type to build the role's map.
3. `Player.java` ->  Player class use for initial player
4. `MonsterTeam.java` ->  the class for ood.Monster team, extends from the general team class.
   
### Market package
1. `Inventory.java` ->  for contains items, using to build market and hero's backpack.
2. `MobaMarket.java` ->  Specific MobaMarket extends from genral Market
3. `Market.java` -> * The class for building a market contains a ood.Inventory.
   
### Items package
1. `Equipment.java` ->  the class for Equipments to process its own methods and attributes, extends from ood.Itemstems
2. `Spells.java` -> * The general abstract class of ood.Spells, extends from consumable items.
3. `IceSpell.java` ->  Use for new a Ice spell item with it's own category. Extends from ood.Spells.
4. `Potions.java` ->  The class of ood.Potions, extends from consumable items, use for produce these kinds of potions.
5. `ItemMethods.java` -> * Interface for all items.
6. `ItemGetter.java` ->  the class for getting different kinds of items from the txt file.
7. `Consumable.java` ->  the class for ood.Consumable items, extend from ood.Itemstems
8. `Items.java` -> * the abstract class of items, include the common things of all items.
9. `FireSpell.java` ->  Use for new a Fire spell item with it's own category. Extends from ood.Items.Spells.
10. `LightningSpell.java` ->  Use for new a Lightning spell item with it's own category. Extends from ood.Items.Spells.
11. `Armor.java` ->  the class for armory, extends from ood.Items.Equipment
12. `Weapon.java` ->  the class for ood.Items.Weapon, extends from ood.Equipment
   
### `Main.java` ->  Game start


## Notes
---------------------------------------------------------------------------
1. <Files to be parsed should be stored in ConfigFiles, for parser class to
read class>

All the initial data of monsters, heroes and items stores in /data/txt_files


2. <Notes to grader>

Using the factory design pattern.

Highly encapsulation.

Auto-compute of properties of hero and monster.

Non-stop playing.

Different color for outputs.

Clearly prompt.

Can exit anytime.

Can robustly process any possible wrong input.(including give String to number, wrong format and etc.) 

Highly completed.

Easily change initial money in config.


## How to compile and run
---------------------------------------------------------------------------
1. Navigate to the directory "pa4" after unzipping the files
2. Run the following instructions:
<Example below>
javac -d bin src/*.java
java -cp bin ood.Main

## Input/Output Example (the output is to much so I only Tag the input line use [input]:)
---------------------------------------------------------------------------

/Users/zhengxuwang/Library/Java/JavaVirtualMachines/openjdk-18.0.2.1/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=64541:/Applications/IntelliJ IDEA.app/Contents/bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /Users/zhengxuwang/Documents/Boston/CS611_oop_cpk/Assignment4/HerosValor/out/production/HerosGame ood.Main
Welcome
Hero & Valor
 __       _______   _______  _______ .__   __.  _______       _______.
|  |     |   ____| /  _____||   ____||  \ |  | |       \     /       |
|  |     |  |__   |  |  __  |  |__   |   \|  | |  .--.  |   |   (----`
|  |     |   __|  |  | |_ | |   __|  |  . `  | |  |  |  |    \   \    
|  `----.|  |____ |  |__| | |  |____ |  |\   | |  '--'  |.----)   |   
|_______||_______| \______| |_______||__| \__| |_______/ |_______/    
                                                                      
                          ______    _______                           
                         /  __  \  |   ____|                          
                        |  |  |  | |  |__                             
                        |  |  |  | |   __|                            
                        |  `--'  | |  |                               
                         \______/  |__|                               
                                                                      
         ____    ____  ___       __        ______   .______           
         \   \  /   / /   \     |  |      /  __  \  |   _  \          
          \   \/   / /  ^  \    |  |     |  |  |  | |  |_)  |         
           \      / /  /_\  \   |  |     |  |  |  | |      /          
            \    / /  _____  \  |  `----.|  `--'  | |  |\  \----.     
             \__/ /__/     \__\ |_______| \______/  | _| `._____|     
                                                                      
Welcome to the game!		Author: Zhengxu Wang

During the game process, whenever you input q, means quit game.
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
| K |   | X | C | B | X | C |   |
---------------------------------
|   |   | X |   | C | X | C |   |
---------------------------------
| B | K | X | B | C | X | B |   |
---------------------------------
| B |   | X | C | K | X | K | K |
---------------------------------
|   | C | X |   | B | X |   |   |
---------------------------------
| K |   | X | C | B | X |   |   |
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
 N  means Heroes Nexus, each Nexus is a market
 X  means obstacle
 N  means Monsters Nexus
    Blank or C , K , B means different landscape with some buff.
Is that a reasonable map?(input Y to accept, other means reshuffle)
r
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
|   | B | X | K | K | X |   | B |
---------------------------------
|   | C | X |   |   | X | B | C |
---------------------------------
| C | K | X | B |   | X |   |   |
---------------------------------
| B | C | X |   |   | X | B | K |
---------------------------------
| C | B | X | C |   | X |   | K |
---------------------------------
|   | K | X | C |   | X |   | C |
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
 N  means Heroes Nexus, each Nexus is a market
 X  means obstacle
 N  means Monsters Nexus
    Blank or C , K , B means different landscape with some buff.
Is that a reasonable map?(input Y to accept, other means reshuffle)
Y
We have 3 kinds of hero
1) Warriors	 2) Sorcerers	 3) Paladins	
What is the hero do you want to choose? (choose by number)
1
Here are all kinds of Warriors.
1	Gaerdal_Ironhand    100     700     500     600     1354    1
2	Sehanine_Monnbow    600     700     800     500     2500    1
3	Muamman_Duathall    300     900     500     750     2546    1
4	Flandal_Steelskin   200     750     650     700     2500    1
5	Undefeated_Yoj      400     800     400     700     2500    1
6	Eunoia_Cyn          400     700     800     600     2500    1
Which Warrior do you want to use? (choose by number, all members can't duplicate)
1
1	name : Gaerdal_Ironhand	mp : 100	strength : 770	agility : 550	dexterity : 600	gold : 1354	level : 1	hp : 100	
We have 3 kinds of hero
1) Warriors	 2) Sorcerers	 3) Paladins	
What is the hero do you want to choose? (choose by number)
2
Here are all kinds of Sorcerers.
1	Rillifane_Rallathil     1300    750     450     500     2500    1
2	Segojan_Earthcaller     900     800     500     650     2500    1
3	Reign_Havoc             800     800     800     800     2500    1
4	Reverie_Ashels          900     800     700     400     2500    1
5	Kalabar                 800     850     400     600     2500    1
6	Skye_Soar               1000    700     400     500     2500    1
Which Sorcerer do you want to use? (choose by number, all members can't duplicate)
2
1	name : Segojan_Earthcaller	mp : 900	strength : 800	agility : 550	dexterity : 715	gold : 2500	level : 1	hp : 100	
We have 3 kinds of hero
1) Warriors	 2) Sorcerers	 3) Paladins	
What is the hero do you want to choose? (choose by number)
3
Here are all kinds of Paladins.
1	Parzival             300     750     650     700     2500    1
2	Sehanine_Moonbow     300     750     700     700     2500    1
3	Skoraeus_Stonebones  250     650     600     350     2500    1
4	Garl_Glittergold     100     600     500     400     2500    1
5	Amaryllis_Astra      500     500     500     500     2500    1
6	Caliber_Heist        400     400     400     400     2500    1
Which paladin do you want to use? (choose by number, all members can't duplicate)
3
1	name : Skoraeus_Stonebones	mp : 250	strength : 715	agility : 600	dexterity : 385	gold : 2500	level : 1	hp : 100	
Hello, Gaerdal_Ironhand . You are in Nexus
Do you want to trade?(only M/m for trade, other continue to move)
m
Do you wanna 1:buy 2:sell 0:passing by (input the serial number)
1
Here's this market's stuffs
1	name : Heat_Wave		cost : 450		required_level : 2		damage : 600		mana_cost : 150		category : FireSpell		
2	name : Scythe		cost : 1000		required_level : 6		damage : 1100		required_hands : 2		category : Weapon		
3	name : Mermaid_Tears		cost : 850		required_level : 5		category : Potions		attribute_increase : 100		attribute_affected : Health/Mana/Strength/Agility		
4	name : Platinum_Shield		cost : 150		required_level : 1		category : Armory		damage_reduction : 200		
5	name : Ice_Blade		cost : 250		required_level : 1		damage : 450		mana_cost : 100		category : IceSpell		
6	name : Hell_Storm		cost : 600		required_level : 3		damage : 950		mana_cost : 600		category : FireSpell		
7	name : Frost_Blizzard		cost : 750		required_level : 5		damage : 850		mana_cost : 350		category : IceSpell		
8	name : Sword		cost : 500		required_level : 1		damage : 800		required_hands : 1		category : Weapon		
9	name : Wizard_Shield		cost : 1200		required_level : 10		category : Armory		damage_reduction : 1500		
10	name : Healing_Potion		cost : 250		required_level : 1		category : Potions		attribute_increase : 100		attribute_affected : Health		
11	name : Full_Body_Armor		cost : 1000		required_level : 8		category : Armory		damage_reduction : 1100		
12	name : Spark_Needles		cost : 500		required_level : 2		damage : 600		mana_cost : 200		category : LightningSpell		
You have : 1354
which would you wanna buy? (input the serial, 0 means quit trade)
5
Good, you got Ice_Blade
Hello, Gaerdal_Ironhand . You are in Nexus
Do you want to trade?(only M/m for trade, other continue to move)
m
Do you wanna 1:buy 2:sell 0:passing by (input the serial number)
2
Here's your stuffs
1	name : Ice_Blade		cost : 250		required_level : 1		damage : 450		mana_cost : 100		category : IceSpell		
which would you wanna sell? (input the serial, 0 means quit trade)
1
Now you have : 1229
Hello, Gaerdal_Ironhand . You are in Nexus
Do you want to trade?(only M/m for trade, other continue to move)
w
Hello, You are using Gaerdal_Ironhand
Where do you wanna go?(only w,a,s,d is valid to move, i for information, t for tp, r for recall)
w
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
|   | B | X | K | K | X |   | B |
---------------------------------
|   | C | X |   |   | X | B | C |
---------------------------------
| C | K | X | B |   | X |   |   |
---------------------------------
| B | C | X |   |   | X | B | K |
---------------------------------
| C | B | X | C |   | X |   | K |
---------------------------------
| H | K | X | C |   | X |   | C |
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
Hello, Segojan_Earthcaller . You are in Nexus
Do you want to trade?(only M/m for trade, other continue to move)
m
Do you wanna 1:buy 2:sell 0:passing by (input the serial number)
1
Here's this market's stuffs
1	name : Spark_Needles		cost : 500		required_level : 2		damage : 600		mana_cost : 200		category : LightningSpell		
2	name : Mermaid_Tears		cost : 850		required_level : 5		category : Potions		attribute_increase : 100		attribute_affected : Health/Mana/Strength/Agility		
3	name : TSwords		cost : 1400		required_level : 8		damage : 1600		required_hands : 2		category : Weapon		
4	name : Axe		cost : 550		required_level : 5		damage : 850		required_hands : 1		category : Weapon		
5	name : Scythe		cost : 1000		required_level : 6		damage : 1100		required_hands : 2		category : Weapon		
6	name : Lava_Comet		cost : 800		required_level : 7		damage : 1000		mana_cost : 550		category : FireSpell		
7	name : Ambrosia		cost : 1000		required_level : 8		category : Potions		attribute_increase : 150		attribute_affected : All		
8	name : Healing_Potion		cost : 250		required_level : 1		category : Potions		attribute_increase : 100		attribute_affected : Health		
9	name : Hell_Storm		cost : 600		required_level : 3		damage : 950		mana_cost : 600		category : FireSpell		
10	name : Sword		cost : 500		required_level : 1		damage : 800		required_hands : 1		category : Weapon		
11	name : Heat_Wave		cost : 450		required_level : 2		damage : 600		mana_cost : 150		category : FireSpell		
12	name : Thunder_Blast		cost : 750		required_level : 4		damage : 950		mana_cost : 400		category : LightningSpell		
13	name : Full_Body_Armor		cost : 1000		required_level : 8		category : Armory		damage_reduction : 1100		
You have : 2500
which would you wanna buy? (input the serial, 0 means quit trade)
10
Good, you got Sword
Hello, Segojan_Earthcaller . You are in Nexus
Do you want to trade?(only M/m for trade, other continue to move)
w
Hello, You are using Segojan_Earthcaller
Where do you wanna go?(only w,a,s,d is valid to move, i for information, t for tp, r for recall)
w
GET BUFF
1	name : Segojan_Earthcaller	mp : 900	strength : 800	agility : 600	dexterity : 715	gold : 2000	level : 1	hp : 100	
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
|   | B | X | K | K | X |   | B |
---------------------------------
|   | C | X |   |   | X | B | C |
---------------------------------
| C | K | X | B |   | X |   |   |
---------------------------------
| B | C | X |   |   | X | B | K |
---------------------------------
| C | B | X | C |   | X |   | K |
---------------------------------
| H | K | X | H |   | X |   | C |
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
Hello, Skoraeus_Stonebones . You are in Nexus
Do you want to trade?(only M/m for trade, other continue to move)
w
Hello, You are using Skoraeus_Stonebones
Where do you wanna go?(only w,a,s,d is valid to move, i for information, t for tp, r for recall)
w
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
|   | B | X | K | K | X |   | B |
---------------------------------
|   | C | X |   |   | X | B | C |
---------------------------------
| C | K | X | B |   | X |   |   |
---------------------------------
| B | C | X |   |   | X | B | K |
---------------------------------
| C | B | X | C |   | X |   | K |
---------------------------------
| H | K | X | H |   | X | H | C |
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
| M | B | X | K | K | X |   | B |
---------------------------------
|   | C | X |   |   | X | B | C |
---------------------------------
| C | K | X | B |   | X |   |   |
---------------------------------
| B | C | X |   |   | X | B | K |
---------------------------------
| C | B | X | C |   | X |   | K |
---------------------------------
| H | K | X | H |   | X | H | C |
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
| M | B | X | M | K | X |   | B |
---------------------------------
|   | C | X |   |   | X | B | C |
---------------------------------
| C | K | X | B |   | X |   |   |
---------------------------------
| B | C | X |   |   | X | B | K |
---------------------------------
| C | B | X | C |   | X |   | K |
---------------------------------
| H | K | X | H |   | X | H | C |
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
| M | B | X | M | K | X | M | B |
---------------------------------
|   | C | X |   |   | X | B | C |
---------------------------------
| C | K | X | B |   | X |   |   |
---------------------------------
| B | C | X |   |   | X | B | K |
---------------------------------
| C | B | X | C |   | X |   | K |
---------------------------------
| H | K | X | H |   | X | H | C |
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
Hello, You are using Gaerdal_Ironhand
Where do you wanna go?(only w,a,s,d is valid to move, i for information, t for tp, r for recall)
t
Where do you want to go?
1 Mid
2 Bottom
which lane you want to choose? (choose by number)
2
You can go to these spot
1 [5, 6]
You can go to these spot
2 [6, 7]
which spot you want to choose? (choose by number)
2
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
| M | B | X | M | K | X | M | B |
---------------------------------
|   | C | X |   |   | X | B | C |
---------------------------------
| C | K | X | B |   | X |   |   |
---------------------------------
| B | C | X |   |   | X | B | K |
---------------------------------
| C | B | X | C |   | X |   | K |
---------------------------------
|   | K | X | H |   | X | H | H |
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
Hello, You are using Segojan_Earthcaller
Where do you wanna go?(only w,a,s,d is valid to move, i for information, t for tp, r for recall)
i
1	name : Segojan_Earthcaller	mp : 900	strength : 800	agility : 600	dexterity : 715	gold : 2000	level : 1	hp : 100	
Hello, You are using Segojan_Earthcaller
Where do you wanna go?(only w,a,s,d is valid to move, i for information, t for tp, r for recall)
w
GET BUFF
1	name : Segojan_Earthcaller	mp : 900	strength : 800	agility : 650	dexterity : 715	gold : 2000	level : 1	hp : 100	
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
| M | B | X | M | K | X | M | B |
---------------------------------
|   | C | X |   |   | X | B | C |
---------------------------------
| C | K | X | B |   | X |   |   |
---------------------------------
| B | C | X |   |   | X | B | K |
---------------------------------
| C | B | X | H |   | X |   | K |
---------------------------------
|   | K | X | C |   | X | H | H |
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
Hello, You are using Skoraeus_Stonebones
Where do you wanna go?(only w,a,s,d is valid to move, i for information, t for tp, r for recall)
w
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
| M | B | X | M | K | X | M | B |
---------------------------------
|   | C | X |   |   | X | B | C |
---------------------------------
| C | K | X | B |   | X |   |   |
---------------------------------
| B | C | X |   |   | X | B | K |
---------------------------------
| C | B | X | H |   | X | H | K |
---------------------------------
|   | K | X | C |   | X |   | H |
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
|   | B | X | M | K | X | M | B |
---------------------------------
| M | C | X |   |   | X | B | C |
---------------------------------
| C | K | X | B |   | X |   |   |
---------------------------------
| B | C | X |   |   | X | B | K |
---------------------------------
| C | B | X | H |   | X | H | K |
---------------------------------
|   | K | X | C |   | X |   | H |
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
|   | B | X | K | K | X | M | B |
---------------------------------
| M | C | X | M |   | X | B | C |
---------------------------------
| C | K | X | B |   | X |   |   |
---------------------------------
| B | C | X |   |   | X | B | K |
---------------------------------
| C | B | X | H |   | X | H | K |
---------------------------------
|   | K | X | C |   | X |   | H |
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
|   | B | X | K | K | X |   | B |
---------------------------------
| M | C | X | M |   | X | M | C |
---------------------------------
| C | K | X | B |   | X |   |   |
---------------------------------
| B | C | X |   |   | X | B | K |
---------------------------------
| C | B | X | H |   | X | H | K |
---------------------------------
|   | K | X | C |   | X |   | H |
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
Hello, You are using Gaerdal_Ironhand
Where do you wanna go?(only w,a,s,d is valid to move, i for information, t for tp, r for recall)
w
GET BUFF
1	name : Gaerdal_Ironhand	mp : 100	strength : 820	agility : 550	dexterity : 600	gold : 1229	level : 1	hp : 100	
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
|   | B | X | K | K | X |   | B |
---------------------------------
| M | C | X | M |   | X | M | C |
---------------------------------
| C | K | X | B |   | X |   |   |
---------------------------------
| B | C | X |   |   | X | B | K |
---------------------------------
| C | B | X | H |   | X | H | H |
---------------------------------
|   | K | X | C |   | X |   | C |
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
Hello, You are using Segojan_Earthcaller
Where do you wanna go?(only w,a,s,d is valid to move, i for information, t for tp, r for recall)
w
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
|   | B | X | K | K | X |   | B |
---------------------------------
| M | C | X | M |   | X | M | C |
---------------------------------
| C | K | X | B |   | X |   |   |
---------------------------------
| B | C | X | H |   | X | B | K |
---------------------------------
| C | B | X | C |   | X | H | H |
---------------------------------
|   | K | X | C |   | X |   | C |
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
Hello, You are using Skoraeus_Stonebones
Where do you wanna go?(only w,a,s,d is valid to move, i for information, t for tp, r for recall)
r
You are back to Nexus
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
|   | B | X | K | K | X |   | B |
---------------------------------
| M | C | X | M |   | X | M | C |
---------------------------------
| C | K | X | B |   | X |   |   |
---------------------------------
| B | C | X | H |   | X | B | K |
---------------------------------
| C | B | X | C |   | X |   | H |
---------------------------------
|   | K | X | C |   | X |   | C |
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
|   | B | X | K | K | X |   | B |
---------------------------------
|   | C | X | M |   | X | M | C |
---------------------------------
| M | K | X | B |   | X |   |   |
---------------------------------
| B | C | X | H |   | X | B | K |
---------------------------------
| C | B | X | C |   | X |   | H |
---------------------------------
|   | K | X | C |   | X |   | C |
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
|   | B | X | K | K | X |   | B |
---------------------------------
|   | C | X |   |   | X | M | C |
---------------------------------
| M | K | X | M |   | X |   |   |
---------------------------------
| B | C | X | H |   | X | B | K |
---------------------------------
| C | B | X | C |   | X |   | H |
---------------------------------
|   | K | X | C |   | X |   | C |
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
Battle Start
###  BATTLE START  ###
 Hero's turn 
Here's your Info.
1	name : Segojan_Earthcaller	mp : 900	strength : 800	agility : 550	dexterity : 715	gold : 2000	level : 1	hp : 100	
Here's your enemy
1	name : Kas-Ethelinh	level : 1	damage : 660	defense : 500	doge_chance : 60	hp : 100	
It's your No.1 turn.
What you gonna do? (1)Attack (2)Use Item 
1
Segojan_Earthcaller attack Kas-Ethelinh
Kas-Ethelinh is been killed.
!!! NICE MONSTER DIED !!!
1	name : Segojan_Earthcaller	mp : 990	strength : 800	agility : 550	dexterity : 715	gold : 2100	level : 2	hp : 100	
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
|   | B | X | K | K | X |   | B |
---------------------------------
|   | C | X |   |   | X | M | C |
---------------------------------
| M | K | X | B |   | X |   |   |
---------------------------------
| B | C | X | H |   | X | B | K |
---------------------------------
| C | B | X | C |   | X |   | H |
---------------------------------
|   | K | X | C |   | X |   | C |
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
|   | B | X | K | K | X |   | B |
---------------------------------
|   | C | X |   |   | X | B | C |
---------------------------------
| M | K | X | B |   | X | M |   |
---------------------------------
| B | C | X | H |   | X | B | K |
---------------------------------
| C | B | X | C |   | X |   | H |
---------------------------------
|   | K | X | C |   | X |   | C |
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
Hello, You are using Gaerdal_Ironhand
Where do you wanna go?(only w,a,s,d is valid to move, i for information, t for tp, r for recall)
w
GET BUFF
1	name : Gaerdal_Ironhand	mp : 100	strength : 870	agility : 500	dexterity : 600	gold : 1229	level : 1	hp : 100	
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
|   | B | X | K | K | X |   | B |
---------------------------------
|   | C | X |   |   | X | B | C |
---------------------------------
| M | K | X | B |   | X | M |   |
---------------------------------
| B | C | X | H |   | X | B | H |
---------------------------------
| C | B | X | C |   | X |   | K |
---------------------------------
|   | K | X | C |   | X |   | C |
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
Battle Start
###  BATTLE START  ###
 Hero's turn 
Here's your Info.
1	name : Gaerdal_Ironhand	mp : 100	strength : 820	agility : 500	dexterity : 600	gold : 1229	level : 1	hp : 100	
Here's your enemy
1	name : Jormunngand	level : 1	damage : 600	defense : 900	doge_chance : 22	hp : 100	
It's your No.1 turn.
What you gonna do? (1)Attack (2)Use Item 
2
Buy something first!
Your round is over
 Monster's turn 
Monster Jormunngand turn.
Jormunngand attack Gaerdal_Ironhand
Gaerdal_Ironhand is been killed.
 HEROE DIED 
Hero died, resurrect in Nexus
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
|   | B | X | K | K | X |   | B |
---------------------------------
|   | C | X |   |   | X | B | C |
---------------------------------
| M | K | X | B |   | X | M |   |
---------------------------------
| B | C | X | H |   | X | B | K |
---------------------------------
| C | B | X | C |   | X |   | K |
---------------------------------
|   | K | X | C |   | X |   | C |
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
Hello, You are using Segojan_Earthcaller
Where do you wanna go?(only w,a,s,d is valid to move, i for information, t for tp, r for recall)
w
GET BUFF
1	name : Segojan_Earthcaller	mp : 990	strength : 800	agility : 550	dexterity : 765	gold : 2100	level : 2	hp : 100	
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
|   | B | X | K | K | X |   | B |
---------------------------------
|   | C | X |   |   | X | B | C |
---------------------------------
| M | K | X | H |   | X | M |   |
---------------------------------
| B | C | X |   |   | X | B | K |
---------------------------------
| C | B | X | C |   | X |   | K |
---------------------------------
|   | K | X | C |   | X |   | C |
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
Hello, Skoraeus_Stonebones . You are in Nexus
Do you want to trade?(only M/m for trade, other continue to move)
w
Hello, You are using Skoraeus_Stonebones
Where do you wanna go?(only w,a,s,d is valid to move, i for information, t for tp, r for recall)
w
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
|   | B | X | K | K | X |   | B |
---------------------------------
|   | C | X |   |   | X | B | C |
---------------------------------
| M | K | X | H |   | X | M |   |
---------------------------------
| B | C | X |   |   | X | B | K |
---------------------------------
| C | B | X | C |   | X |   | K |
---------------------------------
|   | K | X | C |   | X | H | C |
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
|   | B | X | K | K | X |   | B |
---------------------------------
|   | C | X |   |   | X | B | C |
---------------------------------
| C | K | X | H |   | X | M |   |
---------------------------------
| M | C | X |   |   | X | B | K |
---------------------------------
| C | B | X | C |   | X |   | K |
---------------------------------
|   | K | X | C |   | X | H | C |
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
|   | B | X | K | K | X |   | B |
---------------------------------
|   | C | X |   |   | X | B | C |
---------------------------------
| C | K | X | H |   | X |   |   |
---------------------------------
| M | C | X |   |   | X | M | K |
---------------------------------
| C | B | X | C |   | X |   | K |
---------------------------------
|   | K | X | C |   | X | H | C |
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
Hello, Gaerdal_Ironhand . You are in Nexus
Do you want to trade?(only M/m for trade, other continue to move)
w
Hello, You are using Gaerdal_Ironhand
Where do you wanna go?(only w,a,s,d is valid to move, i for information, t for tp, r for recall)
w
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
|   | B | X | K | K | X |   | B |
---------------------------------
|   | C | X |   |   | X | B | C |
---------------------------------
| C | K | X | H |   | X |   |   |
---------------------------------
| M | C | X |   |   | X | M | K |
---------------------------------
| C | B | X | C |   | X |   | K |
---------------------------------
| H | K | X | C |   | X | H | C |
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
Hello, You are using Segojan_Earthcaller
Where do you wanna go?(only w,a,s,d is valid to move, i for information, t for tp, r for recall)
w
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
|   | B | X | K | K | X |   | B |
---------------------------------
|   | C | X | H |   | X | B | C |
---------------------------------
| C | K | X | B |   | X |   |   |
---------------------------------
| M | C | X |   |   | X | M | K |
---------------------------------
| C | B | X | C |   | X |   | K |
---------------------------------
| H | K | X | C |   | X | H | C |
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
Hello, You are using Skoraeus_Stonebones
Where do you wanna go?(only w,a,s,d is valid to move, i for information, t for tp, r for recall)
w
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
|   | B | X | K | K | X |   | B |
---------------------------------
|   | C | X | H |   | X | B | C |
---------------------------------
| C | K | X | B |   | X |   |   |
---------------------------------
| M | C | X |   |   | X | M | K |
---------------------------------
| C | B | X | C |   | X | H | K |
---------------------------------
| H | K | X | C |   | X |   | C |
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
Battle Start
###  BATTLE START  ###
 Hero's turn 
Here's your Info.
1	name : Skoraeus_Stonebones	mp : 250	strength : 715	agility : 600	dexterity : 385	gold : 2500	level : 1	hp : 100	
Here's your enemy
1	name : Jormunngand	level : 1	damage : 600	defense : 900	doge_chance : 22	hp : 100	
It's your No.1 turn.
What you gonna do? (1)Attack (2)Use Item 
2
Buy something first!
Your round is over
 Monster's turn 
Monster Jormunngand turn.
Jormunngand attack Skoraeus_Stonebones
Skoraeus_Stonebones is been killed.
 HEROE DIED 
Hero died, resurrect in Nexus
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
|   | B | X | K | K | X |   | B |
---------------------------------
|   | C | X | H |   | X | B | C |
---------------------------------
| C | K | X | B |   | X |   |   |
---------------------------------
| M | C | X |   |   | X | M | K |
---------------------------------
| C | B | X | C |   | X |   | K |
---------------------------------
| H | K | X | C |   | X |   | C |
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
|   | B | X | K | K | X |   | B |
---------------------------------
|   | C | X | H |   | X | B | C |
---------------------------------
| C | K | X | B |   | X |   |   |
---------------------------------
| B | C | X |   |   | X | M | K |
---------------------------------
| M | B | X | C |   | X |   | K |
---------------------------------
| H | K | X | C |   | X |   | C |
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
Battle Start
###  BATTLE START  ###
 Hero's turn 
Here's your Info.
1	name : Gaerdal_Ironhand	mp : 100	strength : 820	agility : 500	dexterity : 600	gold : 1229	level : 1	hp : 100	
Here's your enemy
1	name : WickedWitch	level : 1	damage : 250	defense : 385	doge_chance : 25	hp : 100	
It's your No.1 turn.
What you gonna do? (1)Attack (2)Use Item 
1
Gaerdal_Ironhand attack WickedWitch
WickedWitch is been killed.
!!! NICE MONSTER DIED !!!
1	name : Gaerdal_Ironhand	mp : 110	strength : 820	agility : 500	dexterity : 600	gold : 1329	level : 2	hp : 100	
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
|   | B | X | K | K | X |   | B |
---------------------------------
|   | C | X | H |   | X | B | C |
---------------------------------
| C | K | X | B |   | X |   |   |
---------------------------------
| B | C | X |   |   | X | M | K |
---------------------------------
| C | B | X | C |   | X |   | K |
---------------------------------
| H | K | X | C |   | X |   | C |
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
|   | B | X | K | K | X |   | B |
---------------------------------
|   | C | X | H |   | X | B | C |
---------------------------------
| C | K | X | B |   | X |   |   |
---------------------------------
| B | C | X |   |   | X | B | K |
---------------------------------
| C | B | X | C |   | X | M | K |
---------------------------------
| H | K | X | C |   | X |   | C |
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
Hello, You are using Gaerdal_Ironhand
Where do you wanna go?(only w,a,s,d is valid to move, i for information, t for tp, r for recall)
w
GET BUFF
1	name : Gaerdal_Ironhand	mp : 110	strength : 820	agility : 550	dexterity : 600	gold : 1329	level : 2	hp : 100	
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
|   | B | X | K | K | X |   | B |
---------------------------------
|   | C | X | H |   | X | B | C |
---------------------------------
| C | K | X | B |   | X |   |   |
---------------------------------
| B | C | X |   |   | X | B | K |
---------------------------------
| H | B | X | C |   | X | M | K |
---------------------------------
|   | K | X | C |   | X |   | C |
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
Hello, You are using Segojan_Earthcaller
Where do you wanna go?(only w,a,s,d is valid to move, i for information, t for tp, r for recall)
w
GET BUFF
1	name : Segojan_Earthcaller	mp : 990	strength : 850	agility : 550	dexterity : 715	gold : 2100	level : 2	hp : 100	
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
|   | B | X | H | K | X |   | B |
---------------------------------
|   | C | X |   |   | X | B | C |
---------------------------------
| C | K | X | B |   | X |   |   |
---------------------------------
| B | C | X |   |   | X | B | K |
---------------------------------
| H | B | X | C |   | X | M | K |
---------------------------------
|   | K | X | C |   | X |   | C |
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
Hello, Skoraeus_Stonebones . You are in Nexus
Do you want to trade?(only M/m for trade, other continue to move)
w
Hello, You are using Skoraeus_Stonebones
Where do you wanna go?(only w,a,s,d is valid to move, i for information, t for tp, r for recall)
w
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
|   | B | X | H | K | X |   | B |
---------------------------------
|   | C | X |   |   | X | B | C |
---------------------------------
| C | K | X | B |   | X |   |   |
---------------------------------
| B | C | X |   |   | X | B | K |
---------------------------------
| H | B | X | C |   | X | M | K |
---------------------------------
|   | K | X | C |   | X | H | C |
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
Battle Start
###  BATTLE START  ###
 Hero's turn 
Here's your Info.
1	name : Skoraeus_Stonebones	mp : 250	strength : 715	agility : 600	dexterity : 385	gold : 2500	level : 1	hp : 100	
Here's your enemy
1	name : Jormunngand	level : 1	damage : 600	defense : 900	doge_chance : 22	hp : 100	
It's your No.1 turn.
What you gonna do? (1)Attack (2)Use Item 
1
Skoraeus_Stonebones attack Jormunngand
Jormunngand is been killed.
!!! NICE MONSTER DIED !!!
1	name : Skoraeus_Stonebones	mp : 275	strength : 715	agility : 600	dexterity : 385	gold : 2600	level : 2	hp : 100	
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
|   | B | X | H | K | X |   | B |
---------------------------------
|   | C | X |   |   | X | B | C |
---------------------------------
| C | K | X | B |   | X |   |   |
---------------------------------
| B | C | X |   |   | X | B | K |
---------------------------------
| H | B | X | C |   | X |   | K |
---------------------------------
|   | K | X | C |   | X | H | C |
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
Hello, You are using Gaerdal_Ironhand
Where do you wanna go?(only w,a,s,d is valid to move, i for information, t for tp, r for recall)
w
GET BUFF
1	name : Gaerdal_Ironhand	mp : 110	strength : 820	agility : 550	dexterity : 650	gold : 1329	level : 2	hp : 100	
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
|   | B | X | H | K | X |   | B |
---------------------------------
|   | C | X |   |   | X | B | C |
---------------------------------
| C | K | X | B |   | X |   |   |
---------------------------------
| H | C | X |   |   | X | B | K |
---------------------------------
| C | B | X | C |   | X |   | K |
---------------------------------
|   | K | X | C |   | X | H | C |
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
Hello, You are using Segojan_Earthcaller
Where do you wanna go?(only w,a,s,d is valid to move, i for information, t for tp, r for recall)
w
---------------------------------
| N | N | X | H | N | X | N | N |
---------------------------------
|   | B | X | K | K | X |   | B |
---------------------------------
|   | C | X |   |   | X | B | C |
---------------------------------
| C | K | X | B |   | X |   |   |
---------------------------------
| H | C | X |   |   | X | B | K |
---------------------------------
| C | B | X | C |   | X |   | K |
---------------------------------
|   | K | X | C |   | X | H | C |
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
 ### VICTORY ### 
Congratulation!!
Do you wanna play again?(y/n)
y
 __       _______   _______  _______ .__   __.  _______       _______.
|  |     |   ____| /  _____||   ____||  \ |  | |       \     /       |
|  |     |  |__   |  |  __  |  |__   |   \|  | |  .--.  |   |   (----`
|  |     |   __|  |  | |_ | |   __|  |  . `  | |  |  |  |    \   \    
|  `----.|  |____ |  |__| | |  |____ |  |\   | |  '--'  |.----)   |   
|_______||_______| \______| |_______||__| \__| |_______/ |_______/    
                                                                      
                          ______    _______                           
                         /  __  \  |   ____|                          
                        |  |  |  | |  |__                             
                        |  |  |  | |   __|                            
                        |  `--'  | |  |                               
                         \______/  |__|                               
                                                                      
         ____    ____  ___       __        ______   .______           
         \   \  /   / /   \     |  |      /  __  \  |   _  \          
          \   \/   / /  ^  \    |  |     |  |  |  | |  |_)  |         
           \      / /  /_\  \   |  |     |  |  |  | |      /          
            \    / /  _____  \  |  `----.|  `--'  | |  |\  \----.     
             \__/ /__/     \__\ |_______| \______/  | _| `._____|     
                                                                      
Welcome to the game!		Author: Zhengxu Wang

During the game process, whenever you input q, means quit game.
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
| K |   | X |   | C | X |   | K |
---------------------------------
|   | B | X | B |   | X | B |   |
---------------------------------
| K | B | X | C |   | X | B | C |
---------------------------------
| K |   | X |   | C | X |   |   |
---------------------------------
|   | B | X |   |   | X | C | C |
---------------------------------
| B | K | X |   | C | X | C | K |
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
 N  means Heroes Nexus, each Nexus is a market
 X  means obstacle
 N  means Monsters Nexus
    Blank or C , K , B means different landscape with some buff.
Is that a reasonable map?(input Y to accept, other means reshuffle)
1
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
| B |   | X |   |   | X | C | C |
---------------------------------
| C | K | X |   | B | X |   |   |
---------------------------------
|   |   | X |   |   | X | B | K |
---------------------------------
| K | C | X | C |   | X |   | B |
---------------------------------
| K | B | X | C | B | X |   | K |
---------------------------------
| K | B | X | C |   | X |   | C |
---------------------------------
| N | N | X | N | N | X | N | N |
---------------------------------
 N  means Heroes Nexus, each Nexus is a market
 X  means obstacle
 N  means Monsters Nexus
    Blank or C , K , B means different landscape with some buff.
Is that a reasonable map?(input Y to accept, other means reshuffle)
q

Process finished with exit code 0

