#!/bin/bash

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