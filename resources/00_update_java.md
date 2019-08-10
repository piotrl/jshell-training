# How to update to Java 10?

W konsoli, sprawdź zainstalowaną wersję:

```bash
λ java -version

java version "10" 2018-03-20
Java(TM) SE Runtime Environment 18.3 (build 10+46)
Java HotSpot(TM) 64-Bit Server VM 18.3 (build 10+46, mixed mode)
```

Jeżeli masz 8 lub niżej, kontynuuj polecenia:

### Aktualizacja JDK na Ubuntu

**Skopiuj** każdą komendę po kolei do terminala

W przypadku potwierdzeń, należy potwierdzić instalację literką `y`.

```bash
sudo add-apt-repository ppa:linuxuprising/java
sudo apt-get update
sudo apt-get install oracle-java11-installer
```

W zależności od instalacji, może być `openjdk` albo po prostu `java`.

#### Ustawcie Java 11 jako domyślna

```bash
sudo apt-get install oracle-java11-set-default
```

#### Ponownie sprawdź zainstalowaną wersję

```bash
java -version
```

Spodziewany wynik (data może być inna):
```bash
λ java -version

openjdk 11.0.1 2018-10-16
OpenJDK Runtime Environment 18.9 (build 11.0.1+13)
OpenJDK 64-Bit Server VM 18.9 (build 11.0.1+13, mixed mode)
```

## (Opcjonalne) Zmiana domyślnej wersji

W konsoli, sprawdź zainstalowane wersje javy:

```bash
update-java-alternatives --list
```

Aby ustawić Java 8, wykonaj polecenie:
(zauważ, `sudo` na początku jest wymagane)
```bash
sudo update-java-alternatives --set java-8-oracle
```

lub analogicznie

```bash
sudo update-java-alternatives --set java-11-oracle
```
