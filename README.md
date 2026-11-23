# Calculadora Java y HTML

## Descripción

Aplicación desarrollada utilizando HTML y Java capaz de realizar las siguientes operaciones matemáticas:

- Suma
- Resta
- Multiplicación
- Potencia

Los números introducidos deben estar comprendidos entre -99999 y 99999.

---

## Estructura de ramas

### main
Contiene los merges de las ramas y la documentación del proyecto.

### frontend
Contiene el archivo HTML de la calculadora.

### backend
Contiene el código Java de la aplicación.

---

## Historial de trabajo

### 1. Initial commit

Se creó el repositorio y la estructura inicial del proyecto.

```bash
git init
git add .
git commit -m "Initial commit"
```

---

### 2. Rama frontend

Se creó la rama frontend para desarrollar la interfaz HTML de la calculadora.

```bash
git branch frontend
git checkout frontend
```

Commit realizado:

```bash
git commit -m "creacion_html"
```

---

### 3. Merge de frontend a main

Una vez finalizada la interfaz HTML, se integró en la rama principal.

```bash
git checkout main
git merge frontend
```

---

### 4. Rama backend

Se creó la rama backend para desarrollar la lógica de la aplicación en Java.

```bash
git branch backend
git checkout backend
```

Commit realizado:

```bash
git commit -m "backend_java"
```

---

### 5. Merge de backend a main

Una vez finalizado el desarrollo en Java, se integró en la rama principal.

```bash
git checkout main
git merge backend
```

---

## Publicación en GitHub

Para publicar el proyecto en GitHub se realizaron los siguientes pasos:

1. Crear un repositorio en GitHub.
2. Vincular el repositorio local al repositorio remoto.
3. Subir los commits realizados.
4. Crear las ramas frontend y backend.
5. Realizar los merges correspondientes en main.
6. Publicar el repositorio para su entrega.

Comando utilizado para enviar los cambios al repositorio remoto:

```bash
git push origin main
```

---

## Operaciones implementadas

- Suma
- Resta
- Multiplicación
- Potencia