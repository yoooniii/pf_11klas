# PlanetsProject
pf 11klas

                                                                                   zadacha:
ПЛАНЕТИ
Планетите в една планетна система се характеризират с:
- име (не повече от 30 символа, евентуално съдържащо интервали);
- номер – по отдалеченост от централното светило;
- брой спътници – цяло неотрицателно число;
- големина относно Земята (положително число, не непременно цяло).
Първият ред на текстовия файл PLANETS.IN съдържа естественото число N,
определящо броя на планетите (N≤100). Всеки от останалите 2N реда съдържа
последователно:
- ако е с четен номер – низ, определящ името планета от системата;
- ако е с нечетен номер – три числа, разделени с интервал, първото от които
определя номера на планетата от предишния ред, второто – броя луни, а
третото – големината спрямо Земята.
Задача 1: Осигурете въвеждане на данните от файла.
Задача 2: Изведете на стандартния изход номериран списък на имената планетите
при следния приоритет на свойствата: най-значимо – големина (намаляващо), след
това дължина на името (нарастващо) и накрая отдалеченост от слънцето
(нарастващо). Номерът в списъка е в 3 символа (с евентуално водещи интервали),
завършва с точка и се отделя с интервал от името.
Задача 3. От стандартния вход се въвежда низ, не по-дълъг от 10 символа. Намерете
планетите (ако има такива), в името на които се съдържа този низ. Изведете списъка
от зад. 2 за тях, като по-напред поставите тези, които имат по-голям брой спътници.
ПРИЕМРЕН ВХОДЕН ФАЙЛ:
4
nova zemya
2 3 1
venerka
4 10 0.8
jupitercho
5 0 1803.5
america v nebeto
6 1 1
ИЗХОД ЗА ЗАД. 2:
 1. jupitercho
 2. america v nebeto
 3. nova zemya
 4. venerka
Ако за зад. 3 е въведен низът „er”, то
ИЗХОД ЗА ЗАД. 3:
 1. venerka
 2. america v nebeto
 3. jupitercho