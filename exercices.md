# Exercices

## Exercice 01 - Note

Implémentez la méthode getLetterNote dans la classe Note,
qui prend un entier représentant un résultat d'année (compris entre 0 et 100)
et renvoie une lettre correspondant à ce résultat selon la grille suivante :
- 'F' pour les notes inférieures à 50,
- 'E' pour les notes entre 50 et 59,
- 'D' entre 60 et 69,
- 'C' entre 70 et 79,
- 'B' entre 80 et 89,
- 'A' entre 90 et 100.
Si la note est en dehors de la plage [0, 100], une exception IllegalArgumentException
doit être levée avec le message "Year result must be between 0 and 100".


## Exercice 02 - Gestionnaire de tâches

Implémentez une classe Task qui représente une tâche avec une description et un état d'achèvement.
La classe doit contenir un constructeur par défaut ainsi qu'un constructeur prenant en paramètre une description.
Chaque tâche doit avoir une méthode :
- getDescription pour récupérer la description
- isCompleted pour vérifier si la tâche est terminée
- markAsCompleted pour marquer la tâche comme complétée.

Redéfinissez également les méthodes :
- equals
- hashCode pour comparer les tâches en fonction de leur description et de leur état d'achèvement.

Une tâche est considérée comme égale à une autre si leurs descriptions et leurs états d'achèvement sont identiques.
Utilisez cette classe en relation avec la classe TaskManager pour gérer la liste des tâches et leur état.


Créez une classe TaskManager qui permet de gérer une liste de tâches (Task).
Implémentez les méthodes suivantes :
- addTask pour ajouter une tâche à la liste,
- removeTask pour supprimer une tâche en fonction de sa description
- markAsCompleted pour marquer une tâche comme terminée en fonction de sa description.

Ajoutez également deux méthodes pour récupérer des listes de tâches :
- getPendingTasks qui renvoie toutes les tâches en attente de réalisation
- getCompletedTasks qui renvoie les tâches déjà accomplies.

Enfin, implémentez la méthode findTaskByDescription,
qui doit renvoyer une tâche correspondant à la description donnée ou null
si aucune tâche ne correspond.
Utilisez les flux (stream) pour parcourir la liste des tâches et filtrer
selon l'état d'achèvement ou la description.
