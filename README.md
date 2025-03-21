[Quasar.postman_collection.json](https://github.com/user-attachments/files/19397446/Quasar.postman_collection.json)📛 quasar challenge

📝 Esta aplicación calcula la ubicación de una nave por medio de trilateración y triangulación, y decifra el mensaje que llega cortado a estos mismos 3 satelites, puedes enviar peticiones
  de tipo POST parciales a cada satelite para actualizar la información de cada uno y asi mismo peticiónes GET parciales para consultar la misma, pero OJO! porque primero debe enviar una 
  petición POST con un JSON que debe tener la información de los 3 satelites.
  
🚀 Cómo ejecutar el proyecto:

Requisitos previos
- Instalar Java JDK
- Instalar Maven
- Instalar el IDE de su preferencia como por ejemplo VSC, Intellij, etc..

Comandos para correrlo:
- mvn spring-boot:run

Otras opciones para correrlo:
- Dirijase a la aplicacion principal QuasarApplication, en el costado superior derecho puede observar una triangulo que seńala a la derecha y una cucaracha (ambos son figuras verdes)
  puede dar click en el triangulo verde para ejecutar o en la cucaracha para debuggear
  


Documentación adicional

Flujo:

https://whimsical.com/MUjZXv4doGUaddtpWeoGTT

postmanCollection:

[Uploading Quasar{
	"info": {
		"_postman_id": "e8138d9d-9dc3-4f5f-ac1e-be00ae7750fe",
		"name": "Quasar",
		"schema": "https://schema.getpostman.com/json/collection/v2.1.0/collection.json",
		"_exporter_id": "29664026",
		"_collection_link": "https://universal-resonance-434971.postman.co/workspace/New-Team-Workspace~a2c99d28-198c-44e7-97cf-a2e267afed7d/collection/29664026-e8138d9d-9dc3-4f5f-ac1e-be00ae7750fe?action=share&source=collection_link&creator=29664026"
	},
	"item": [
		{
			"name": "Topsecret",
			"request": {
				"auth": {
					"type": "noauth"
				},
				"method": "POST",
				"header": [],
				"body": {
					"mode": "raw",
					"raw": "{\n  \"satellites\": [\n    {\n      \"name\": \"kenobi\",\n      \"distance\": 110.0,\n      \"message\": [\"este\", \"\", \"\", \"mensaje\", \"\"]\n    },\n    {\n      \"name\": \"skywalker\",\n      \"distance\": 130.9,\n      \"message\": [\"\", \"es\", \"\", \"\", \"secreto\"]\n    },\n    {\n      \"name\": \"sato\",\n      \"distance\": null,\n      \"message\": [\"este\", \"\", \"un\", \"\", \"\"]\n    }\n  ]\n}",
					"options": {
						"raw": {
							"language": "json"
						}
					}
				},
				"url": {
					"raw": "http://localhost:8080/topsecret",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"topsecret"
					]
				}
			},
			"response": []
		},
		{
			"name": "Topsecret/split/",
			"protocolProfileBehavior": {
				"disabledSystemHeaders": {
					"accept": true
				}
			},
			"request": {
				"auth": {
					"type": "noauth"
				},
				"method": "GET",
				"header": [
					{
						"key": "Accept",
						"value": "application/json",
						"type": "text"
					},
					{
						"key": "Content-Type",
						"value": "application/json",
						"type": "text"
					}
				],
				"url": {
					"raw": "http://localhost:8080/topsecret/split/skywalker",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"topsecret",
						"split",
						"skywalker"
					]
				}
			},
			"response": []
		},
		{
			"name": "Topsecret/split/",
			"request": {
				"auth": {
					"type": "noauth"
				},
				"method": "POST",
				"header": [],
				"body": {
					"mode": "raw",
					"raw": "{\n\"distance\": 100.0,\n\"message\": [\"este\"\n\"\"\n\"\"\n,\n,\n,\n\"mensaje\"\n,\n\"\"]\n}",
					"options": {
						"raw": {
							"language": "json"
						}
					}
				},
				"url": {
					"raw": "http://localhost:8080/topsecret/split/skywalker",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"topsecret",
						"split",
						"skywalker"
					]
				}
			},
			"response": []
		}
	]
}.postman_collection.json…]()
