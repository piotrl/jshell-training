## Challenge #2 - Java 8 / Java 9 / Java 10

Nie wszystko to nowinki, ale wszystko warto znać. :)
- Java 8 released in 2014
- Java 9 released in 2017
- Java 10 released in 2018
- Java 11 released in 2018
- Java 12 released in 2019


### Java 10 - `var` inferred types

> Inferred = Wnioskowanie.
> 
> Java na podstawie przypisania, stara się wywnioskować, jaki typ będzie miała zmienna.


#### 1. Wykonaj:

Uruchom program: `jshell -v`

```java
var str = "String";
var number = 1;
str = null;
var nullable = null; // !
```
Dlaczego ostatnia linijka nie chce się wykonać, a druga jest poprawna?


#### 2. Deklaracji kolekcji: 

a) dlaczego poniższy, pierwszy sposób jest lepszy od drugiego?

```java
Map<Integer, Integer> map = new HashMap<>();

HashMap<Integer, Integer> map = new HashMap<>();
```

b) Java 9 - wbudowane factory do tworzenia kolekcji

```java
List.of(1, 2, 3, 1, 2, 3);

Set.of(1, 2, 3, 1, 2, 3);
Set.of(1, 2, 3);

Map.of(1, "Pierwszy", 2, "Drugi", 3, "Trzeci")

```

c) Jaki typ to będzie? ArrayLista? Co to znaczy, że list jest immutable?

```java
var list = List.of(1, 2, 3, 1, 2, 3);


```


#### 3. Czy da się zapisać w generykach, typy prymitywne?
Wykonaj:

```java
new HashMap<int, int>();
```

#### 4. Czy można posortować zbiór?

### Java 8 - LocalDate

#### 4. Ile dni do egzaminu?
Wykonaj

```java
DateTime.of(2018, 8, 3)                               
import java.time.*                                    
var today = LocalDate.now()                           
var examDay = LocalDate.of(2018, 8, 3);              

var days = ???                       
```

#### 5. Parsowanie daty
Wykonaj:

```java
var str = "2018-09-01"                                
DateTimeFormatter                                     
import java.time.format.*                             
var formatter = DateTimeFormatter.ofPattern("yyyy-MM-d
LocalDate.parse(str, formatter)
```

#### 6. String lines / Files read
https://www.journaldev.com/24601/java-11-features

var csv = "header;title\n#1;#2"
csv.lines().

#### 7 Files read

The same expected result but 
