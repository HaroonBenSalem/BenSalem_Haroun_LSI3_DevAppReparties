# TP1-DAR2026 — Les sockets TCP en Java

## 1) Objectif
Le but de ce TP est de réaliser une connexion entre un client et un serveur en Java en utilisant les sockets TCP.
## 2) Structure du projet
J'ai créé un projet Java nommé **TP1-DAR2026** avec deux packages : serverPackage et clientPackage.

![Structure du projet](Screenshots/Structure_du_projet.PNG)
## 3) Création du serveur
Le serveur utilise ServerSocket sur le port 1234. Il attend la connexion d'un client avec la méthode accept().

Au début, le serveur affiche un message pour indiquer qu'il attend une connexion. Quand le client se connecte, le serveur affiche un deuxième message.
![Creation du Serveur](Screenshots/2.PNG)
## 4)Création du client
Le client utilise la classe Socket pour se connecter au serveur sur le port 1234 avec l'adresse localhost.

Après la connexion, un message s'affiche dans la console pour confirmer que le client est connecté.
![Creation du Client](Screenshots/4.PNG)
## 5)Test de connexion
J'ai lancé le serveur en premier, puis le client. La connexion s'est bien établie et le serveur a affiché le message indiquant qu'un client était connecté.
![Test](Screenshots/5.PNG)
## 6)Utilisation d'une adresse IP
J'ai remplacé localhost par 127.0.0.1 dans le code du client, en gardant le même port (1234). J'ai relancé les deux applications et la connexion a fonctionné.
![Test avec IP](Screenshots/6.PNG)
## 7)Conclusion
Ce TP m'a permis de comprendre comment établir une connexion TCP entre un client et un serveur en Java. J'ai utilisé ServerSocket pour attendre la connexion et Socket pour connecter le client au serveur.

