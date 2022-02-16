# Game
Game - choose the right color 
Hello everyone! Khabi in touch!
Today I'm posting a half-finished game made in the summer of 2021. I did it at the end of August, and then I went to another country to study,
and the desire to complete the rest of the levels disappeared. Only one level is available.

Sut' igry: vybrat' otlichayushchiysya po tsvetu ikonku. Iznachal'no dayetsya pole 4kh4, daleye ona uvelichivayetsya do 3kh3 i maksimal'no dostigayet razmera 4kh4. Kletka otlichayushchayasya tsvetom s kazhdoy povtornoy igroy raspolozhena v randomnom meste.
The essence of the game: choose an icon that differs in color. Initially, a 4x4 field is given, then it increases to 3x3 and reaches a maximum size of 4x4. A cell that differs in color with each replay is located in a random place.
For this implementation, I put the cells in a mutableList (because the field changes size), and applied the shuffled() function to the list, 
which shuffles the list objects in random order. And changed the color of the first object.
To unlock the second level, you need to go through 10 rounds, but I did not register the second level. Also, the time that was given to pass the first level, I also unfortunately did not register
