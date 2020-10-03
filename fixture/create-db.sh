#!/bin/sh

selfdir=$(dirname "$0")
sql_file="$selfdir/dump.sql"
current_dir=$(pwd)
cd "$selfdir/../data"
data_path=$(pwd)
cd "$current_dir"
docker run -i --rm -v "$data_path:/data" nouchka/sqlite3 /data/shop.db < "$sql_file"
