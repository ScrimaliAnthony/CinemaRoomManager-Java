# 🎬 Cinema Room Manager – Java Edition

## Présentation

**Cinema Room Manager** est un simulateur de salle de cinéma en ligne de commande. Il vous permet de gérer les ventes de billets, d’afficher le plan de la salle, et de suivre vos statistiques en temps réel.

L’utilisateur interagit avec la machine via un menu simple et clair, reproduisant une vraie logique de gestion de salle : tarification selon l’emplacement, sièges réservés, revenu généré, etc.

---

## 🎮 Fonctionnalités

* 🪑 Affichage dynamique du plan de la salle (sièges disponibles et réservés)
* 🎟 Achat de billets avec tarification conditionnelle (en fonction du nombre total de sièges)
* 📊 Statistiques : nombre de billets vendus, pourcentage d’occupation, revenu total
* ❌ Validation des achats pour éviter les sièges inexistants ou déjà pris
* 🔁 Menu d’interaction fluide et intuitif

---

## 📦 Télécharger et utiliser

**➡️ [Télécharger le .jar](https://github.com/ScrimaliAnthony/cinemaroommanager-java/releases/latest)**

### ▶️ Lancement (Java requis)

```bash
java -jar CinemaRoomManager.jar
```

Fonctionnalités disponibles dans le menu :

* Afficher la salle
* Acheter un billet
* Consulter les statistiques
* Quitter

---

## 🧱 Structure du projet

```
src/
├── cinema/
│   ├── Cinema.java           → Point d’entrée
│   ├── CinemaTheatre.java    → Logique métier (plan, tarifs, occupation)
│   ├── Menu.java             → Saisie du choix utilisateur
│   └── Display.java          → Affichage console (plan, messages)
```

### 🔨 Compilation manuelle

```bash
javac -d out $(find src -name "*.java")
jar cfm CinemaRoomManager.jar manifest.txt -C out .
```
