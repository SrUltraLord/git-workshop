# Git Workshop - Spring Boot Microservices

Este repositorio contiene un taller práctico diseñado para enseñar conceptos avanzados de Git a través del desarrollo de dos microservicios utilizando Spring Boot. Los participantes aprenderán a manejar ramas, resolver conflictos, utilizar stash y cherry-pick, y más, mientras construyen una aplicación funcional.

## ✅ TODO

Ejercicio 1: Configuración e Inicialización

- [x] ¿Se configuró correctamente el user.name y user.email en Git?
- [x] ¿Se inicializó el repositorio en la carpeta correcta?
- [x] ¿Se renombró la rama principal a main?
- [x] ¿Se verificó el estado con git status?
      Ejercicio 2: Primer Commit y .gitignore
- [x] ¿Se creó el archivo .gitignore con las reglas indicadas (target/, \*.log, .DS_Store, .idea/)?
- [x] ¿Se realizó el primer commit con el mensaje correcto?
- [x] ¿Se verificó el historial con git log --oneline?
      Ejercicio 3: Creación del Service B en nueva rama
- [x] ¿Se creó la rama feature/product-service correctamente?
- [x] ¿Se creó la estructura de carpetas y el archivo ProductManagementApplication.java?
- [x] ¿Se realizó el commit con el mensaje feat: add product service structure?
      Ejercicio 4: Desarrollo del ProductController
- [x] ¿Se creó ProductoController.java con los métodos GET y POST funcionales?
- [x] ¿Se agregó el archivo application.properties con la configuración correcta?
- [x] ¿Se realizó el commit con el mensaje feat: implement product controller with inventory management?
      Ejercicio 5: Merge y Resolución de Conflictos
- [ ] ¿Se creó el conflicto en README.md en ambas ramas?
- [ ] ¿Se intentó el merge y se resolvió el conflicto correctamente?
- [ ] ¿El contenido final del README.md incluye ambas secciones y la lista de servicios?
- [ ] ¿Se realizó el commit con el mensaje merge: integrate product service with conflict resolution?
      Ejercicio 6: Mejoras y Stash
- [ ] ¿Se modificó UsuarioController para agregar validaciones?
- [ ] ¿Se guardaron los cambios con git stash push y mensaje descriptivo?
- [ ] ¿Se creó la rama hotfix/port-configuration y se corrigió la configuración?
- [ ] ¿Se realizó el commit con el mensaje fix: remove database config causing startup issues?
      Ejercicio 7: Aplicar Stash y Cherry-pick
- [ ] ¿Se hizo merge del hotfix a main?
- [ ] ¿Se aplicó el stash y se realizó el commit con el mensaje feat: add input validation to user creation?
- [ ] ¿Se realizó el cherry-pick del hotfix en la rama feature/product-service?
      Ejercicio 8: Testing y Push
- [ ] ¿Se ejecutaron ambos servicios con mvn spring-boot:run?
- [ ] ¿Se probaron los endpoints con curl para crear y listar usuarios/productos?
- [ ] ¿Se verificó el historial con git log --oneline --graph --all?
- [ ] ¿Se listaron las ramas con git branch -a?

## Author

- David Reyes
