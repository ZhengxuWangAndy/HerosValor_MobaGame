## Hero & Valor: A terminal based MOBA game

https://github.com/ZhengxuWangAndy/HerosValor_MobaGame/blob/main/imgs/Screen%20Shot%202022-12-19%20at%2012.22.25%20AM.png

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


2. <Notes>

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
  javac -Xlint:unchecked -d bin ood/Main.java
  java -cp bin ood.Main
