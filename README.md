# OOA
Projekt HWZ BWI A16

# Requirements
<a href="https://mongodb.com" target="_blank">MongoDB server</a><br>
<a href="http://nginx.org" target="_blank">Nginx</a><br>
 
# Installation

```php
'brew update
```

```php
'brew install node
'brew upgrade node
'test: node -v
'test: npm -v
'cd /Users/michael/Documents/Github
'node node.js
```

```php
'brew install mongodb
'mkdir -p mongo 
'pwd|pbcopy
```

# Usage

```php
'cd
'mongod --dbpath /Users/michael/Documents/Github/mongo
```

<b>Store data in /usr/local/var/mongodb instead of the default /data/db</b>

```php
'dbpath = /usr/local/var/mongodb
```

<b>The official 10gen Linux packages (Ubuntu/Debian or CentOS/Fedora) ship with a basic con-figuration file which is placed in /etc/mongodb.conf, and the MongoDB service reads this when it starts up.</b>

```php
'brew services list
'brew services start mongodb
'brew services stop mongodb
'brew services restart mongodb
```

```php
'npm install -g loopback-cli
'lb
```

```php
'Documents\Github\OOA-Gantenbein-Brunner-Patrut-Troller\mongoDB
'cd mongoProject
'node . //<- mit Abstand
```

```php
'npm install --save loopback-connector-mongodb
'lb datasource mongoDS --connector MongoDB
```

```php
'host' => 'localhost',    //<- dont change if mongodb is running on the same machine
'username' => 'SA',     //<- Database user
'password' => '',  //<- blank Database Password
'mongoDS' => 'mongoDB',    //<- Database Name
'protocol' => 'http', //<-pick http or https
'port' => '27017', //<- standard
```