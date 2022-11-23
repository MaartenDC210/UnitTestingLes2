# TDD Exercise - HelloFresh

## Requirements:

We schrijven een aantal utility classes die gebruikt zullen worden in een HelloFresh applicatie.

* We hebben een database met recepten.
* Elk van deze recepten heeft een ingredientenlijst.
* Een recept is voorzien voor een aantal personen, default is dat 1 persoon.
* We willen de ingredientenlijst en het recept wel kunnen afdrukken voor een willekeurig aantal personen.

De applicatie waarin deze utility classes gebruikt zal worden wordt geschreven door een ander dev team. We kunnen dus
niet de applicatie gebruiken om de utility classes te testen.

Merk op: In de HelloFresh applicatie waar de classes gebruikt zullen worden komt alle data uit de database.
Er zullen ook pagina's gemaakt worden waar de HelloFresh medewerkers recepten kunnen ingeven.   

We gebruiken unit testen om:

* de correctheid van de utility classes te bewijzen
* documentatie: hoe deze classes te gebruiken

Genereer ook javadoc documentatie voor de gebruikers van deze package.

We bouwen deze utility classes op in kleine stapjes.

## Ingredient class

Schrijf eerst een class Ingredient. Een Recipe class zal een lijst bevatten met Ingredients. Een Ingredient kan
bevatten:

* naam
  * bvb zout, bloem, suiker
* unit (of naam) van het Ingredient in enkelvoud - en indien nodig ook in meervoud
  * bvb: units alleen mogelijk in enkelvoud: gram, cl
  * bvb: units mogelijk in enkelvoud/meervoud: stuk/stuks, eetlepel/eetlepels, zakje/zakjes
  * bvb: units waar slechts 1 van mogelijk is: een beetje zout, peper en zout naar smaak
  * bij sommige Ingredienten wordt enkelvoud/meervoud niet uitgedrukt in units - bvb appel/appels,
    courgette/courgettes, ei/eieren
* amount = aantal van dit Ingredient nodig voor het standaard-recept

Een Ingredient heeft een functie **print**
Die heeft als parameter: **nrOfPortions**. 
Dit is het aantal porties waarvoor we de ingredientenlijst willen afdrukken. 

Bvb: **pasta-pesto** 
Het standaard-recept is voor 1 persoon. 
Een van de Ingredients in dit recept is: **10 blaadjes basilicum** 
Als je het recept afdrukt voor 1 persoon: Ingredient.print(1) --> dan print je "10 blaadjes basilicum"     
Als je het recept afdrukt voor 4 personen: Ingredient.print(4) --> dan print je "40 blaadjes basilicum"

Bvb: **courgette in de oven**
Het standaard-recept is voor 2 persoon.
Een van de Ingredients in dit recept is: **1 courgette**
Als je het recept afdrukt voor 1 persoon: Ingredient.print(1) --> dan print je "1/2 courgette"     
Als je het recept afdrukt voor 2 personen: Ingredient.print(2) --> dan print je "1 courgette"     
Als je het recept afdrukt voor 4 personen: Ingredient.print(4) --> dan print je "2 courgettes"


## Recipe class

Maak een object van class Recipe aan met: 
* dishName (String) - bvb "appeltaart", "pasta pesto" 
* amountForRecipe (integer) - optioneel - is default 1 - dit is het aantal personen waarvoor het standaard-recept opgesteld is

Een Recipe moet opgebouwd worden door Ingredients toe te voegen.
Maak hiervoor een functie **addIngredient** met parameter een object van de class Ingredient

Als een Recipe opgebouwd is kan je de ingredientenlijst afdrukken. 
Maar hiervoor een functie **print** met parameter **nrOfPersons**: het aantal personen waarvoor we het recept willen afdrukken. 
De functie druk eerst de dishName af met het aantal personen - bvb "Appeltaart voor 10 personen". 
Dan volgt de ingredientenlijst. 

## Uitbreiding 
Maak een functie **addText** waarmee je de tekst van het recept kan toevoegen. 
Maak een functie **printText** waarmee je de tekst afdrukt. 
Hoe kan je het aanpakken om ook in de tekst de juiste aantallen/enkelvoud/meervoud te printen? 
Hoe kan formattering in de tekst aanbrengen? 

