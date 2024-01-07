# Les systèmes parallèles et distribués 

Les systèmes parallèles et distribués représentent l'épine dorsale des applications modernes, répondant aux exigences croissantes de performances, de disponibilité et de gestion des ressources. Dans le cadre de notre examen final pour le module dédié à ces technologies innovantes, 
nous avons entrepris la conception et la mise en œuvre d'une application robuste, capitalisant sur des frameworks de pointe tels que Spring Boot, Spring Security, Angular, et Keycloak.

Ce rapport détaillé documentera notre parcours de le début jusqu'à la réalisation concrète de notre application. En outre, 
nous mettrons en lumière les avantages de l'approche parallèle et distribuée dans le contexte de notre application, ainsi que les perspectives d'avenir pour son amélioration continue.
 

# Application
On souhaite créer une application basée sur une architecture micro-service qui permet de gérer des réservations concernant des ressources. Chaque réservation concerne une seule ressource. Une ressource est définie par son id, son nom, son type (MATERIEL_INF0, MATERIEL_AUDIO_VUSUEL). Une réservation est définie par son id, son nom, son contexte, sa date, sa durée. Chaque réservation est effectuée par une personne. Une personne est définie par son id, son nom, son email et sa fonction.
L’application doit permettre de gérer les ressources et les réservations. Pour faire plus simple, cette application se composera de deux micro-services fonctionnels :
• Un Micro-service qui permet de gérer des « Resources-Service ».
• Un Micro-service qui permet de gérer les réservations effectuées par des personnes.
Les micro-services technique à mettre en place sont :
• Le service Gateway basé sur Spring cloud Gateway
• Le service Discovery base sur Eureka Server ou Consul Discovery (au choix)
• Le service de configuration basé sur Spring cloud config ou Consul Config (au choix)

Pour l’application, nous avons besoin de développer une frontend web, basé sur Angular Framework.

La sécurité de l’application est basée sur Oauth2 et OIDC avec Keycloak comme Provider
Pour les micro-services, il faut générer la documentation des web services Restfull en utilisant la spécification

OpenAPIDoc (Swagger). Prévoir aussi des circuit breakers basés sur Resilience4J comme solution de fault
Tolerence



## 1.	Établir une architecture technique du projet
![image](https://github.com/salma-SABROU/examen-S3/assets/129564311/5d3dfe4a-9101-43ee-bc0f-a9dcce161f3e)
 

## 2.	Créer un Projet Maven incluant les micro-services suivants : resources-service, reservation-service, gateway-service, discovery-service, config-service et angular-front-app
![image](https://github.com/salma-SABROU/examen-S3/assets/129564311/fa69aae9-0107-45b0-9d26-d68a09656486)

 ![image](https://github.com/salma-SABROU/examen-S3/assets/129564311/a1249b7d-b1b9-4cd2-8373-8b2f11a6270a)

![image](https://github.com/salma-SABROU/examen-S3/assets/129564311/05d63053-9b8a-406e-968a-8fe3e9bf4e76)

![image](https://github.com/salma-SABROU/examen-S3/assets/129564311/87c0c5ad-5a9b-4a5d-9abc-0a0377bec5e0)

 ![image](https://github.com/salma-SABROU/examen-S3/assets/129564311/2c1c6673-0357-4ae0-8632-01bf5d40df29)


## 3.	 Développer et tester les micro-services discovery-service et gateway-service et config-service

- consul : 

On utilise cette ligne de commande :
consul agent -server -bootstrap-expect=1 -data-dir=consul-data-examen -ui -bind=192.168.90.28

 ![image](https://github.com/salma-SABROU/examen-S3/assets/129564311/ee9d889e-0f85-45e4-90b1-23360f2179aa)

![image](https://github.com/salma-SABROU/examen-S3/assets/129564311/aacc6be7-2a96-4eb8-989c-93f49071b222)

-config-service :
![image](https://github.com/salma-SABROU/examen-S3/assets/129564311/e4609d68-1079-42d7-a81d-b810a9e25392)

Avec le dossier de configuration
 ![image](https://github.com/salma-SABROU/examen-S3/assets/129564311/b4db342f-ea68-4765-bae6-077a61de5136)

![image](https://github.com/salma-SABROU/examen-S3/assets/129564311/7bc3a630-e762-4b80-9840-d589b2cf1604)

-gatway-service :
 ![image](https://github.com/salma-SABROU/examen-S3/assets/129564311/a5eb73e2-34e1-4ee6-b0ea-56fcd286ecfa)

![image](https://github.com/salma-SABROU/examen-S3/assets/129564311/d3384922-ca55-41ef-b3ac-b1c83802f84a)

![image](https://github.com/salma-SABROU/examen-S3/assets/129564311/a233a55c-b043-49f1-af3a-ae899ab71f25)
 
## 4.	Développer et tester le micro-service resources-service 

![image](https://github.com/salma-SABROU/examen-S3/assets/129564311/dce6a852-e914-4305-916f-52f13ffdc34f)

Avec le fichier de configuration : 
 
 ![image](https://github.com/salma-SABROU/examen-S3/assets/129564311/96862471-3f7a-4525-9afb-72f7c12a0b3e)

Le micro service dans consul :

![image](https://github.com/salma-SABROU/examen-S3/assets/129564311/24d6ab8f-1beb-4688-a8b1-15c721ef5763)
 
On teste le micro service dans le navigateur :
 ![image](https://github.com/salma-SABROU/examen-S3/assets/129564311/698a7113-142f-4ba4-9b2f-8bdd9c28c7e7)

On utilise la gatway :
![image](https://github.com/salma-SABROU/examen-S3/assets/129564311/70f63244-897a-4174-9eca-1594a91aad49)
 

## 5.	Développer et tester le micro-service reservation-service 
![image](https://github.com/salma-SABROU/examen-S3/assets/129564311/71dcb441-ac03-4410-a931-b22bbd4a8b0f)

![image](https://github.com/salma-SABROU/examen-S3/assets/129564311/5cfb8d2b-b6cb-4dcf-81d3-b654db665b2b)
 
![image](https://github.com/salma-SABROU/examen-S3/assets/129564311/f7a62400-5e7a-4692-aa91-b787b0a00f2c)

La configuration du micro service :
![image](https://github.com/salma-SABROU/examen-S3/assets/129564311/b02983df-9fa7-4bd4-b6e5-bb6c0010484b)

![image](https://github.com/salma-SABROU/examen-S3/assets/129564311/58800473-b43c-4463-a604-386ccac2d8a9)

Le micro service dans consule :
![image](https://github.com/salma-SABROU/examen-S3/assets/129564311/7d479d53-d105-4e40-8873-89e8a65d2204)

On peut accéder a les ressources depuis le micro service de réservation :
![image](https://github.com/salma-SABROU/examen-S3/assets/129564311/9e98d421-f81f-4388-86c6-c25a7d68678a)
 
On teste le micro service en utilisons la gatway : 
![image](https://github.com/salma-SABROU/examen-S3/assets/129564311/71ed94c2-6754-4089-9bee-8c0b460e9cb6)
 
## 6.	Développer un simple frontend web pour l’application
![image](https://github.com/salma-SABROU/examen-S3/assets/129564311/aa604e7d-451e-44bb-97e5-1fb52c3b7ee5)

Maintenant en vat ajouter nos composant :
 ![image](https://github.com/salma-SABROU/examen-S3/assets/129564311/cac1887f-afa8-4990-b58f-a6fc003b4d40)

On déclare nos routes :
 ![image](https://github.com/salma-SABROU/examen-S3/assets/129564311/032de8e2-7e2a-4610-98b2-40c96f4cef50)

Pour le component RESSOURCE :
![image](https://github.com/salma-SABROU/examen-S3/assets/129564311/f21eccc0-44e1-4ea3-993a-5ce0536be52a)

![image](https://github.com/salma-SABROU/examen-S3/assets/129564311/56b20835-dbb4-44a0-9531-bddbb79685a3)
 
On test : 
![image](https://github.com/salma-SABROU/examen-S3/assets/129564311/be7394ea-afda-4db7-b7d9-18eda094a0c6)

Pour résoudre cette partie je dois modifier le backend pour accepter les requetés d’Angular
![image](https://github.com/salma-SABROU/examen-S3/assets/129564311/4fb1ecb6-13cc-410b-a21d-c3332484bd3f)

J’ai autorisé le micro service du gatway d’accepter tous les requêtes de http://localhost:4200
 ![image](https://github.com/salma-SABROU/examen-S3/assets/129564311/2ea17e99-0a9a-4646-b03f-943a687fbfc9)

Voilà le résultat final de client Angular:
![image](https://github.com/salma-SABROU/examen-S3/assets/129564311/2dc4f94c-dfcc-4c83-9155-c529df0ed5fa)

 ![image](https://github.com/salma-SABROU/examen-S3/assets/129564311/005f218a-c5d8-471e-90e7-4e74afd069dc)

![image](https://github.com/salma-SABROU/examen-S3/assets/129564311/d873f1f7-f16f-41fd-a311-550a00d61a7d)

![image](https://github.com/salma-SABROU/examen-S3/assets/129564311/0170c8a5-7b31-4236-b9ea-606891eec881)
 
 
## 7.	Sécuriser l’application avec une authentification Keycloak

La configuration de Keycloak :
![image](https://github.com/salma-SABROU/examen-S3/assets/129564311/2c221527-78b7-4bc6-aacc-f696eb21d168)

 ![image](https://github.com/salma-SABROU/examen-S3/assets/129564311/2b6862f8-7b56-4079-804e-b6ccab71846a)

On le test avec POSTMAN :
![image](https://github.com/salma-SABROU/examen-S3/assets/129564311/f9c3bf41-3789-4ca4-9038-b321f31c8c72)

#### Configuration de backend :
- ajout de la dépendance suivante
<!-- https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-oauth2-resource-server -->
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-oauth2-resource-server</artifactId>
			<version>3.2.1</version>
		</dependency>

- ajout la configuration :
  ![image](https://github.com/salma-SABROU/examen-S3/assets/129564311/f548f240-d1a8-4204-9759-142608b0128d)

  ![image](https://github.com/salma-SABROU/examen-S3/assets/129564311/a079e1fc-87ed-4183-81d0-d671125a95c7)


En conclusion, ce projet a été une exploration enrichissante et stimulante dans le domaine des systèmes parallèles et distribués. À travers l'utilisation habile de Spring Boot, Spring Security, Angular et Keycloak, nous avons réussi à créer une application qui incarne les principes fondamentaux de la conception orientée vers la distribution, la scalabilité et la sécurité.

L'intégration de Spring Boot a permis la mise en place d'une architecture robuste, favorisant la flexibilité et la gestion efficace des ressources. La combinaison avec Angular a donné naissance à une interface utilisateur dynamique, offrant une expérience utilisateur fluide et moderne. L'implémentation de Spring Security et Keycloak a renforcé la sécurité de notre application, garantissant une authentification et une autorisation fiables, des éléments essentiels dans tout système distribué
