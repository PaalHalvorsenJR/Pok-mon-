# Lab2 - Pokémon
I denne labben skal vi definere vår egen datatype og lage **objekter**.

Pokémon er et verdenskjent japansk spill med 122 titler (per desember 2022). I dette spillet har vi en rekke forskjellige pocket monsters som kjemper mot hverandre. Alle de forskjellige pokémon'ene har felles tilstand og oppførsel, dermed blir det naturlig å bruke objektorientert programmering til å modellere disse.

Denne oppgaven er inspirert av en øvingsoppgave utarbeidet av Albin Severinson og Dag Haugland.

### Eksempelkjøring
Når vi i denne labben lager Pokémon vil vi fokusere på de essensielle aspektene ved spillet. Dette betyr at spillet vil være tekstbasert og ha ingen bruker-input. Når programmet kjøres skal det følgende skrives ut:
```
Pikachu HP: (94/94) STR: 12
Oddish HP: (100/100) STR: 3

Pikachu attacks Oddish.
Oddish takes 9 damage and is left with 91/100 HP
Oddish attacks Pikachu.
Pikachu takes 3 damage and is left with 91/94 HP
Pikachu attacks Oddish.
Oddish takes 14 damage and is left with 77/100 HP
Oddish attacks Pikachu.
Pikachu takes 4 damage and is left with 87/94 HP
Pikachu attacks Oddish.
Oddish takes 14 damage and is left with 63/100 HP
Oddish attacks Pikachu.
Pikachu takes 3 damage and is left with 84/94 HP
Pikachu attacks Oddish.
Oddish takes 16 damage and is left with 47/100 HP
Oddish attacks Pikachu.
Pikachu takes 4 damage and is left with 80/94 HP
Pikachu attacks Oddish.
Oddish takes 6 damage and is left with 41/100 HP
Oddish attacks Pikachu.
Pikachu takes 3 damage and is left with 77/94 HP
Pikachu attacks Oddish.
Oddish takes 15 damage and is left with 26/100 HP
Oddish attacks Pikachu.
Pikachu takes 1 damage and is left with 76/94 HP
Pikachu attacks Oddish.
Oddish takes 10 damage and is left with 16/100 HP
Oddish attacks Pikachu.
Pikachu takes 4 damage and is left with 72/94 HP
Pikachu attacks Oddish.
Oddish takes 8 damage and is left with 8/100 HP
Oddish attacks Pikachu.
Pikachu takes 3 damage and is left with 69/94 HP
Pikachu attacks Oddish.
Oddish takes 7 damage and is left with 1/100 HP
Oddish attacks Pikachu.
Pikachu takes 3 damage and is left with 66/94 HP
Pikachu attacks Oddish.
Oddish takes 4 damage and is left with 0/100 HP
Oddish is defeated by Pikachu.
```

## Oppgave 1 - Feltvariabler og konstruktør
### Deloppgave A - Feltvariabler
Klassen `Pokemon.java` skal definere datatypen Pokémon. Foreløpig har den kun et sett med tomme metoder. Disse skal vi implementere.

Det første vi skal implementere er dens tilstand, aka. dens feltvariabler. <br></br>
**TODO: Opprett feltvariablene:**
 * `name` - Navnet til Pokémon'en
 * `healthPoints` - *Health points* er hvor mye liv Pokémon'en har
 * `maxHealthPoints` - Hvor mange *health points* Pokémon'en kan maksimalt ha (og starter med)
 * `strength` - Hvor sterk Pokémon'en er
 * `random` - I Pokémon er det noenlunde tilfeldig hvor mye man skader fienden i et angrep. For å kunne ha denne tilfeldigheten skal vi bruke et *Random-objekt*

### Deloppgave B - Konstruktør
Konstruktøren i en klasse er en metode som oppretter et objekt av den datatypen. <br></br>
**TODO: Implementer en konstruktør som tar inn ett argument: `String name`.** Konstruktøren skal initiere feltvariablene. <br></br>
`maxHealthPoints`, `healthPoints` og `strenght` skal gis verdier basert på tilfeldighet. Bruk de følgende linjene:
```java
this.random = new Random();
this.healthPoints = (int) Math.abs(Math.round(100 + 10 * random.nextGaussian()));
this.maxHealthPoints = this.healthPoints;
this.strength = (int) Math.abs(Math.round(20 + 10 * random.nextGaussian()));
```

## Oppgave 2 - getter og hjelpemetoder
Implementer metodene `getName`, `getStrenght`, `getCurrentHP`, `getMaxHP` og `isAlive`. Les dokumentasjonen til metodene for å vite hva de skal gjøre.

## Oppgave 3 - `damage`
Implementer metoden `damage`. Metoden skal trekke i fra `damageTaken` fra antall `healthPoints` Pokémon'en har. Man kan ikke ha færre enn 0 `healthPoints`.

Metoden skal skrive ut:
```
Pikachu takes 3 damage and is left with 84/94 HP
```
(I dette tilfellet er Pikachu pokémon'en som tar skade).

## Oppgave 4 - `attack`
Implementer metoden `attack`. Metoden skal utføre et angrep på `target`. Hvor mange health points som skal tas fra `target` baseres på Pokémon'ens strength og tilfeldighet. Bruk denne linjen:
```java
int damageInflicted = (int) (this.strength + this.strength / 2 * random.nextGaussian());
```
Deretter skal metoden trekke i fra `damageInflincted` fra `target` sine health points. Print ut den følgende linjen:
```
Oddish attacks Pikachu.
```
(I dette tilfellet er Oddish `this` og Pikachu `target`).

Hvis `target` ikke er levende etter angrepet skal du metoden skrive ut:
```
Pikachu is defeated by Oddish.
```

## Oppgave 5 - Pokémon Battle
I `Main::main` opprett to pokemon og la de kjempe til en er bekjempet (`isAlive` returnerer `false`). <br></br>
Bruk de globale variablene `pokemon1` og `pokemon2` og la de kjempe.

Eksempelkjøring:
```
Pikachu HP: (94/94) STR: 12
Oddish HP: (100/100) STR: 3

Pikachu attacks Oddish.
Oddish takes 9 damage and is left with 91/100 HP
Oddish attacks Pikachu.
Pikachu takes 3 damage and is left with 91/94 HP
Pikachu attacks Oddish.
Oddish takes 14 damage and is left with 77/100 HP
Oddish attacks Pikachu.
Pikachu takes 4 damage and is left with 87/94 HP
Pikachu attacks Oddish.
Oddish takes 14 damage and is left with 63/100 HP
Oddish attacks Pikachu.
Pikachu takes 3 damage and is left with 84/94 HP
Pikachu attacks Oddish.
Oddish takes 16 damage and is left with 47/100 HP
Oddish attacks Pikachu.
Pikachu takes 4 damage and is left with 80/94 HP
Pikachu attacks Oddish.
Oddish takes 6 damage and is left with 41/100 HP
Oddish attacks Pikachu.
Pikachu takes 3 damage and is left with 77/94 HP
Pikachu attacks Oddish.
Oddish takes 15 damage and is left with 26/100 HP
Oddish attacks Pikachu.
Pikachu takes 1 damage and is left with 76/94 HP
Pikachu attacks Oddish.
Oddish takes 10 damage and is left with 16/100 HP
Oddish attacks Pikachu.
Pikachu takes 4 damage and is left with 72/94 HP
Pikachu attacks Oddish.
Oddish takes 8 damage and is left with 8/100 HP
Oddish attacks Pikachu.
Pikachu takes 3 damage and is left with 69/94 HP
Pikachu attacks Oddish.
Oddish takes 7 damage and is left with 1/100 HP
Oddish attacks Pikachu.
Pikachu takes 3 damage and is left with 66/94 HP
Pikachu attacks Oddish.
Oddish takes 4 damage and is left with 0/100 HP
Oddish is defeated by Pikachu.
```
