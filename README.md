# Calculatrice en Java

## Description

Ce projet consistait à implémenter une calculatrice permettant d'effectuer des opérations simples et composées sur des nombres entiers. La première partie du projet (branche calculatrice_simple) se concentrait sur la réalisation d'une calculatrice effectuant des opérations binaires simples telles que l'addition, la soustraction, la multiplication et la division entière. La seconde partie (branche main) a permis d'étendre le projet pour inclure des opérations composées où les opérandes peuvent être des expressions comprenant d'autres opérations.

Le projet utilise des concepts d'orienté objet pour modéliser les opérations à l'aide de classes abstraites et concrètes. L'objectif principal était de tester ces différentes opérations, qu'elles soient simples ou composées.

## Structure du projet

Branche calculatrice_simple :

    Main_V1.java : Classe principale qui exécute des tests pour les opérations simples.

    Nombre_V1.java : Classe représentant un nombre entier.

    Operation_V1.java : Classe abstraite définissant les opérations binaires.

    Addition_V1.java : Classe concrète représentant l'opération d'addition.

    Soustraction_V1.java : Classe concrète représentant l'opération de soustraction.

    Multiplication_V1.java : Classe concrète représentant l'opération de multiplication.

    Division_V1.java : Classe concrète représentant l'opération de division entière avec gestion de la division par zéro.

Branche main :

    Main.java : Classe principale pour tester les opérations composées, avec des expressions comme opérandes.

    Expression.java : Classe abstraite pour modéliser une expression, qui peut être un nombre ou une opération.

    Nombre.java : Classe représentant un nombre entier.

    Operation.java : Classe abstraite définissant des opérations composées, avec des opérandes de type Expression.

    Addition.java : Classe concrète représentant l'opération d'addition dans le contexte des opérations composées.

    Soustraction.java : Classe concrète représentant l'opération de soustraction dans le contexte des opérations composées.

    Multiplication.java : Classe concrète représentant l'opération de multiplication dans le contexte des opérations composées.

    Division.java : Classe concrète représentant l'opération de division dans le contexte des opérations composées avec gestion de la division par zéro.

## Fonctionnalités

Branche calculatrice_simple :

    Opérations simples : La calculatrice peut effectuer des opérations simples (addition, soustraction, multiplication, division entière) sur des nombres entiers.

    Gestion des exceptions : Une exception ArithmeticException est lancée et gérée pour prévenir les erreurs de division par zéro.

Branche main (calculatrice avancée) :

    Opérations composées : La calculatrice peut maintenant traiter des opérations composées où les opérandes sont des expressions contenant d'autres opérations.

    Recursivité : Les calculs des opérations composées sont effectués de manière récursive, permettant à chaque opération d'être évaluée indépendamment, même si les opérandes sont elles-mêmes des résultats d'autres opérations.

    Gestion des exceptions : Les erreurs de division par zéro sont gérées à l'aide de ArithmeticException dans les opérations composées.

## Notes importantes

    Recursivité : Les opérations composées exploitent la récursivité, chaque opération étant évaluée en appelant les méthodes valeur() de ses opérandes, qui peuvent elles-mêmes être des expressions.

    Gestion des erreurs : La gestion des erreurs de division par zéro est effectuée dans chaque classe d'opération via une exception ArithmeticException, et cette exception est traitée dans la méthode main des deux branches.
