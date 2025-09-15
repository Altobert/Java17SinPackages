# Solución de Errores Git - Documentación

## Error: Ramas Divergentes (Divergent Branches)

### Descripción del Error
```
On branch main
Your branch and 'origin/main' have diverged,
and have 2 and 4 different commits each, respectively.
  (use "git pull" to merge the remote branch into yours)
```

### ¿Qué significa este error?
- Tu rama local `main` tiene **2 commits** que no están en el repositorio remoto
- El repositorio remoto `origin/main` tiene **4 commits** que no tienes localmente
- Las ramas han "divergido" - han tomado caminos diferentes

### Causas comunes:
1. **Trabajo en equipo**: Otros desarrolladores subieron cambios mientras trabajabas localmente
2. **Múltiples repositorios**: Trabajaste desde diferentes máquinas
3. **Cambios directos en GitHub**: Editaste archivos directamente en la interfaz web
4. **Rebase o reset**: Operaciones que reescribieron el historial

---

## Solución Paso a Paso

### Paso 1: Verificar el estado
```bash
git status
```
**Resultado esperado**: `working tree clean` (sin cambios pendientes)

### Paso 2: Intentar merge
```bash
git pull --no-rebase origin main
```

### Paso 3: Resolver conflictos (si aparecen)
Si aparecen conflictos en archivos `.class`:
```bash
# Usar versión local para archivos binarios
git checkout --ours archivo.conflicto.class
git add archivo.conflicto.class
```

### Paso 4: Completar el merge
```bash
git commit -m "Merge remote-tracking branch 'origin/main'"
```

### Paso 5: Verificar resultado
```bash
git status
```
**Resultado esperado**: `Your branch is ahead of 'origin/main' by X commits`

---

## Error Adicional: Conflictos en Archivos .class

### Problema
```
CONFLICT (content): Merge conflict in target/classes/algoritmos/Mcd.class
warning: Cannot merge binary files
```

### ¿Por qué ocurre?
- Los archivos `.class` son **archivos binarios** (no texto)
- Git no puede hacer merge automático de archivos binarios
- Los archivos `.class` son generados automáticamente al compilar

### Solución: Configurar .gitignore

#### 1. Verificar .gitignore existente
```bash
cat .gitignore
```

#### 2. Asegurar que contiene:
```
# Compiled class files
*.class

# Maven
target/
```

#### 3. Remover archivos .class del rastreo
```bash
# Remover todos los .class del índice de Git
git rm --cached -r target/classes/
git rm --cached *.class
```

#### 4. Confirmar cambios
```bash
git commit -m "Remove .class files from Git tracking - now properly ignored"
```

---

## Comandos de Emergencia

### Si algo sale mal durante el merge:
```bash
# Abortar merge y volver al estado anterior
git merge --abort
```

### Si quieres empezar de nuevo:
```bash
# Resetear a la última versión del remoto (¡CUIDADO! Perderás cambios locales)
git reset --hard origin/main
```

### Si quieres conservar tus cambios locales:
```bash
# Crear backup de cambios locales
git stash
git pull origin main
git stash pop
```

---

## Prevención Futura

### 1. Configurar estrategia de pull por defecto
```bash
# Para merge (recomendado)
git config pull.rebase false

# Para rebase (historial más limpio)
git config pull.rebase true

# Para fast-forward only (más estricto)
git config pull.ff only
```

### 2. Flujo de trabajo recomendado
```bash
# Antes de empezar a trabajar
git pull origin main

# Después de hacer cambios
git add .
git commit -m "Descripción del cambio"
git push origin main
```

### 3. Verificar estado regularmente
```bash
git status
git log --oneline -5  # Ver últimos 5 commits
```

---

## Resumen de Comandos Útiles

| Comando | Descripción |
|---------|-------------|
| `git status` | Ver estado actual del repositorio |
| `git pull --no-rebase origin main` | Merge con el remoto |
| `git pull --rebase origin main` | Rebase con el remoto |
| `git merge --abort` | Cancelar merge en progreso |
| `git checkout --ours archivo` | Usar versión local en conflicto |
| `git checkout --theirs archivo` | Usar versión remota en conflicto |
| `git rm --cached archivo` | Dejar de rastrear archivo |
| `git stash` | Guardar cambios temporalmente |
| `git stash pop` | Recuperar cambios guardados |

---

## Notas Importantes

⚠️ **Siempre hacer backup** antes de operaciones complejas
⚠️ **Los archivos .class NO deben estar en Git** - son generados automáticamente
⚠️ **Comunicarse con el equipo** si hay conflictos frecuentes
⚠️ **Hacer pull antes de empezar** a trabajar en una nueva sesión

---

*Documentación creada el: alberto san martin mas IA cursor :) $(date)*
*Proyecto: Java17SinPackages*
