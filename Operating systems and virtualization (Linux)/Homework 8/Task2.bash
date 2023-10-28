#!/bin/bash


# Создать скрипт ownersort.sh, который в заданной папке копирует файлы в директории, названные по имени владельца каждого файла. 
# Учтите, что файл должен принадлежать соответствующему владельцу.

dir=$1

if [[ ! -d $dir ]]; then
  echo "Директория $dir не существует"
  exit 1
fi

for file in "$dir"/*; do
  if [[ -f $file ]]; then
    owner=$(stat -c '%U' "$file")
    mkdir -p "$dir/$owner"
    cp "$file" "$dir/$owner/"
    chown "$owner:$owner" "$dir/$owner/$(basename $file)"
  fi
done

echo "Файлы в директории $dir были скопированы в соответствующие директории по имени владельца."