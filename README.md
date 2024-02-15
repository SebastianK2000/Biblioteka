# Biblioteka

Sebastian Kościółek 

Temat: System zarządzania biblioteką. 

Wstęp: 
Aplikacja/Projekt Biblioteki stworzyłem ponieważ również na zajęcia z Inżynierii Oprogramowania było to moim tematem głównym. W projekcie używam obsługi błędów, dziedziczenia, cały projekt posegregowałem na poszczególne pakiety etc. Oczywiście projekt będę nadal rozwijał jednak na potrzeby zadania spełnia on wszystkie wymagania.

Aby zainstalować projekt polecam użycie gita. Przez konsolę wchodzimy do folderu gdzie chcemy zapisać projekt oraz wpisujemy komendę: 


git clone https://github.com/SebastianK2000/Biblioteka.git

Następnie włączamy folder z projektem z użyciem  np. W moim wypadku InteliiJ oraz w pliku main włączamy projekt przez przycisk run. Do stworzenia mojego projektu co prawda użyłem Maven jednak to z przyzwyczajenia ponieważ każdy projekt buduję z jego użyciem. 

Oczom powinno nam się ukazać menu główne: 


![image](https://github.com/SebastianK2000/Biblioteka/assets/127401994/08804b76-e3a8-4e4d-a7e7-82707a37ed16)



Wszystkie punkty są w pełni obsłużone, po użyciu 1 rozwija nam się kolejne 3 opcje oraz możliwość powrotu do menu głównego. Po użyciu 2 możemy wyszukać publikację natomiast 4 wyświetla wszystkie publikację. Początkowo projekt nie zawiera rekordów ponieważ nie ma podpiętej bazy danych jednak jeżeli dodamy kilka pozycji będziemy mogli w pełni przetestować możliwości aplikacji. 


![image](https://github.com/SebastianK2000/Biblioteka/assets/127401994/f97c6327-7916-43ce-8255-06afde3b9bdb)




System dodawania publikacji jest bardzo prosty. Podajemy tytuł, autora oraz rok które system pobiera od nas przy pomocy scannera. Try catch do obsługi prostych błędów. Printujemy tytuł jaki udało nam się dodać do biblioteki.

Podsumowanie oraz wnioski końcowe: 

Aplikacja jest prostym systemem zarządzania biblioteką w najbliższym czasie mam również w planie dodać funkcję dodawania, usuwania, aktualizowania oraz wyszukiwania użytkowników/czytelników biblioteki. Dzięki tworzeniu aplikacji mogłem poprawić swoje umiejętności w wykorzystywaniu try catch, dziedziczenia, tworzenia interfejsu etc. Problem na który się natknąłem podczas realizowania projektu był związany z buforem. Mianowicie opcję nie chciały się printować w poprawny sposób a to przez to że w złej linii zamieściłem 

scanner.nextLine();

Zrozumiałem to czytając wpis na stackoverflow. Poprawiłem kod i potem działało bez żadnych zarzutów. 

Diagram znajduje się poniżej: 


![image](https://github.com/SebastianK2000/Biblioteka/assets/127401994/1e7abd0c-9bc7-459a-8434-d72126767570)


