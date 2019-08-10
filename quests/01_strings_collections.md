## Chellange #1 - Strings & Collections



## Part #1 - strings

#### 1. Czy poniższe stringi są takie same? Dlaczego?
```java
new String() == "";

"" == "";
```

Czy poniższa funkcja jest bezpieczna? Jak ją poprawić?

```java
boolean isPizza(String food) {
    return food == "pizza";
}
```

Lepiej:
```java
boolean isPizza(String food) {
    return food.equals("pizza");
}
```
Znajdź przykład, który zepsuje powyższą funkcję.

Lepiej++:
```java
boolean isPizza(String food) {
    return "pizza".equals(food);
}
```

#### 2. replace & substring

a) Jak podmienić fragment stringa?

b) Jak wyciągnąć rozszerzenie pliku z dowolnego stringa?

```java
String filename = "fileName.png";

// a) Replace png to jpg
// Expected: "filename.jpg"
var jpg = ???

// b) How to get extension ONLY
// Expected: "jpg";
var extension = ???
```


## About collections

#### 4. Używanie map
Sprawdź wynik poniższych komend:

```java
Map<String, String> map = new HashMap<String, String>();
map.put("first key", "first value");
map.put("second key", "second value");
map.put("first key", "other value");

map.size()
map.containsKey("first key")
map.containsKey("second key")
map.containsValue("first value")
map.get("first key")

map.entries()
```


#### 5. Porównywanie i sortowanie
Sprawdź wynik poniższych komend:

```java
// List of fileNames
String file1 = "photo1.png";
String file2 = "photo2.png";
String file3 = "photo10.png";

file2.compareTo(file3);

List<String> files = Arrays.asList(file1, file2, file3);
files.sort((first, second) -> first.compareTo(second));

files.stream().sorted().toArray();

// Oposite order
files.stream().sorted((first, second) -> second.compareTo(first)).toArray();
// ==> Object[3] { "photo2.png", "photo10.png", "photo1.png" }
```

#### 6. Filtrowanie

a) Wyfiltruj parzyste liczby używając streama
b) Stwórz nową listę z nieparzystymi liczbami, używając for-in

```java
List<Integer> numbers = Arrays.asList(1, 2, 9, 8);

// print new list
```


