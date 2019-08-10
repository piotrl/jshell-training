#### 1. Jaki jest wynik działania `2 + 4 * 2`? 12 or 10? :) 


#### 2. Jak skonwertować kilobajty do megabajtów?

```java
int kb = 4095;

int mb = ???
```

### Set vs Map

#### 3. Jak sprawdzić, że liczba jest parzysta?
Bonus: Czy poniższe dzieli się na 502?

```java
int kb = 4096

boolean isDividedBy2 = ??
```

#### 4. Logika - co jest wynikiem tego działania?
Dlaczego?
```java
true && true || false

false && true || false

true || false && true
```
### 5. Kastowanie: Jaka jest różnica pomiędzy tymi wyrażeniami?

```java
double calculations = 5 / 4

double calculations = 5.0 / 4

int calculations = 5.0 / 4
```

### 6. Co w Javie jest przekazywane przez referencję, co przez wartość?

```java
class Person {
    public String name;

    Person(String name) {
        this.name = name;
    }
}

Person napastnik = new Person("Robert");

Person nowyNapastnik = napastnik;
nowyNapastnik.name = "Arek";

napastnik.name
nowyNapastnik.name
```

Jak sprawić, żeby obiekty były różne?


### 6.5. A co z liczbami?

```java
int a = 1;
int b = 2;

b = a;
a = 3;

// Jaki wyniki w zmiennych a i b?
```

### 7. Czy można wywołać jeden konstruktor klasy w drugim?

```java

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    Person(String firstName, String lastName) {
        this(firstName + " " + lastName);
    }
}

```

### 8. Wygeneruj stringa na podstawie liczb

### 9. Integer vs int

```java
void parseNumber(int n) {
  return n*2;
}
```

```java
void parseNumber(Integer n) {
  return n*2;
}
```
