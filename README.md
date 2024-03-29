# find-urls-in-files

## Описание

Приложение рекурсивно проходит все файлы в указанной директории и выводит в файл список всех найденных URL-адресов.

Данное приложение было написано для решения одной конкретной задачи, а именно пройтись по более чем 67 000 файлам и найти в них URL-адреса. Поэтому, в нем не предусмотрено никаких настроек, кроме указания директории, в которой необходимо найти URL-адреса и директории, в которой будет создан файл с результатами.

В результат работы приложения записывается не только URL-адрес, а вся строка в файле, в которой этот адрес находится. По-этому, если поиск производится в том числе и по минифицированным файлам, то в конечном файле такие файлы могут быть включены целиком.

## Использование

В директории `<project_path>/docker` в файле `.env` указать абсолютный путь к директории, в которой необходимо найти URL-адреса и абсолютный путь к директории, в которой будет создан файл с результатами.

Там же, в директории `<project_path>/docker` выполнить команду:

```bash
docker-compose up --build
```

## Дополнительные настройки

В файле `<project_path>/src/main/kotlin/scanner/Settigs.kt` можно настроить исключение файлов из поиска:

- В массиве `EXCLUDED_PATHS` указать пути к директориям
- В массиве `EXCLUDED_FILES` указать названия файлов с полным путем к ним
- В массиве `EXCLUDED_EXTENSION` указать расширения файлов
- В массиве `EXCLUDED_PATH_REGEX` указать регулярные выражения для исключения файлов

Все пути и имена файлов указываются относительно директории, указанной в файле `.env` в переменной `FILES_PATH`

После изменения настроек необходимо пересобрать приложение командой:

```bash
docker-compose up --build
```

