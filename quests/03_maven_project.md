## jshell + maven

W konsoli, zbuduj projekt pierwszy raz (pobranie zależności  + kompilacja)

```bash
mvn package
```

jshell możemy uruchomić z istniejącymi klasami
```bash
jshell --class-path target/classes
```

Teraz jesteśmy w kontekście projektu. Możemy dodać importy:

```java
import com.isa.events.*;
import com.isa.contact.*;
/open PRINTING
```


#### Symulujemy event-driven aplikację

```java

var subjects = new CourseSubject();

subjects.subscribe();

subjects.subscribe().
    forEach(el -> println(el));

subjects.simulateInternet().
    forEach(el -> println(el));
```

Spraw by pojawiły się tylko kursy java.

Spraw by nic nie pokazywało się gdy spotkamy napis NOTHING.
- Podpowiedź: funkcja `takeWhile`

