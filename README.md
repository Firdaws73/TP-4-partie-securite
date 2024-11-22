
## Auteur
Firdawsse Ahchouche
## Introduction
L'objectif principal de cette application est de simplifier la gestion des patients dans un environnement médical en offrant une interface  sécurisée.
## projet
Patients-MVC est une application web développée avec Spring Boot et suivant le modèle de conception MVC (Model-View-Controller).
 Elle permet la gestion des patients via une interface web, en utilisant le moteur de templates Thymeleaf, et les données sont gérées dans une base de données MySQL.

## Fonctionnalités
 • Gestion des patients (ajout, modification, suppression, liste).
 • Utilisation de Thymeleaf pour les templates HTML.
 • Sécurité intégrée grâce à Spring Security.
 • Validation des données avec Spring Validation.
 • Utilisation de Bootstrap pour le style et la mise en page.

## Technologie utilisé
 •Spring Boot (Data JPA, Web, Security, Thymeleaf).
 •Thymeleaf Layout Dialect.
 •Bootstrap (via WebJars).
 •Base de données : MySQL
 •Langage de programmation : Java (version 21).



## Structure su projet

Le projet est organisé comme suite

```
src/
├── main/
│   ├── java/
│   │   └── ma/
│   │       └── enset/
│   │           └── patientsmvc/
│   │               ├── entities/
│   │               │   └── Patient.java
│   │               ├── repositories/
│   │               │   └── PatientRepository.java
│   │               ├── security/
│   │               │   └── SecurityConfig.java
│   │               ├── web/
│   │               │   ├── patientController.java
│   │               │   ├── SecurityController.java
│   │               │   └── PatientsMvcApplication.java
│   └── resources/
│       ├── static/
│       └── templates/
│           ├── editPatient.html
│           ├── formPatients.html
│           ├── login.html
│           ├── notAuthorized.html
│           ├── patients.html
│           └── template1.html
│       └── application.properties
└── test/
    └── java/

```

## Explication de la strcuture

### src/main/java/ma/enset/patientsmvc/
   entities/
a. Patient.java : Représente une entité Patient.
   repositories/
PatientRepository.java : Interface qui permet d'interagir avec la base de données pour effectuer des opérations  sur les Patients.
c. security/
SecurityConfig.java : Configure la sécurité de l'application (gestion des utilisateurs, rôles, accès aux pages,).
d. web/
 patientController.java : Contrôleur responsable de gérer les requêtes liées aux Patients (affichage, ajout, modification, suppression).
 SecurityController.java : Contrôleur pour gérer les pages de connexion, déconnexion, ou les erreurs d'accès non autorisé.
 PatientsMvcApplication.java : Classe principale qui démarre l'application Spring Boot.

## src/main/resources/
a. static/
Contient des fichiers statiques comme des CSS, des images ou des fichiers JavaScript .
b. templates/
editPatient.html : Page pour modifier un patient.
formPatients.html : Page pour ajouter un nouveau patient.
login.html : Page pour se connecter à l'application.
notAuthorized.html : Page affichée si l'utilisateur n'a pas les droits nécessaires pour accéder à une ressource.
patients.html : Page principale qui affiche la liste des patients.
template1.html : Un fichier HTML supplémentaire .
c. application.properties
Fichier de configuration de l'application .

## src/test/
java/ : Contient des tests pour vérifier que les fonctionnalités de l'application fonctionnent correctement.



