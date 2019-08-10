#### 1. Jaki jest wynik działania `2 + 4 * 2`? 12 or 10? :) 


#### 2. Jak skonwertować kilobajty do megabajtów?

```java
int kb = 4095;

int mb = ???
```

#### 3. Jak sprawdzić, że liczba jest parzysta?
Bonus: Czy poniższe dzieli się na 502?

```java
int kb = 4096

boolean isDividedBy2 = ??
```


#### 4. `Integer` vs `int`

a) Czy któraś z komend spowoduje nieprawidłowe działanie?

```java
Integer i = new Integer(1);
Integer j = 1;
int k = new Integer(1);
int l = 1;

i == j; // true or false?
```
b) Jaka jest różnica w definicji metod

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

#### 5. Set vs List

#### 6. Logika - co jest wynikiem tego działania?
Dlaczego?
```java
true && true || false

false && true || false

true || false && true
```
### 7. Kastowanie: Jaka jest różnica pomiędzy tymi wyrażeniami?

```java
double calculations = 5 / 4

double calculations = 5.0 / 4

int calculations = 5.0 / 4
```

### 8. Co w Javie jest przekazywane przez referencję, co przez wartość?

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


### 8.5. A co z liczbami?

```java
int a = 1;
int b = 2;

b = a;
a = 3;

// Jaki wyniki w zmiennych a i b?
```

### 9. Czy można wywołać jeden konstruktor klasy w drugim?

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

### 10. Wygeneruj stringa na podstawie liczb
