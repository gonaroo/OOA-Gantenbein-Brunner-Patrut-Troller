# OOA
Projekt HWZ BWI A16

# Requirements
<a href="https://mongodb.com" target="_blank">MongoDB server</a><br>
<a href="http://nginx.org" target="_blank">Nginx</a><br>
 
# Install Prerequisites

```php
brew update
brew install node
brew upgrade node
```

# Test Prerequisities

```php
test: node -v
test: npm -v

cd /Users/michael/Documents/Github
node node.js
```

# Install MongoDB

```php
brew install mongodb
mkdir -p mongo
pwd|pbcopy //<- copy path for later usage
```
# Test MongoDB

```php
brew services list
brew services start mongodb
brew services stop mongodb
brew services restart mongodb
```

# General Configuration MongoDB

<b>The official 10gen Linux packages (Ubuntu/Debian or CentOS/Fedora) ship with a basic con-figuration file which is placed in /etc/mongodb.conf, and the MongoDB service reads this when it starts up.</b>

<b>Store data in /usr/local/var/mongodb instead of the default /data/db</b>

```php
dbpath = /usr/local/var/mongodb
```

<b>Instead we chose to save the DB inside Github for multidevice usage.</b>

```php
cd
mongod --dbpath /Users/michael/Documents/Github/mongo
```

# Install Loopback & Create API's

```php
npm install -g loopback-cli
lb
```

# Install Loopback-MongoDB-Connector

```php
npm install --save loopback-connector-mongodb
lb datasource mongoDS --connector MongoDB
```

# Configuration Loopback

```php
'host' => 'localhost', //<- dont change if mongodb is running on the same machine
'username' => 'SA', //<- Database user
'password' => '', //<- blank Database Password
'mongoDS' => 'mongoDB', //<- Database Name
'protocol' => 'http', //<-pick http or https
'port' => '27017', //<- standard
```

# Usage Node with MongoDB

```php
cd Documents/Github/OOA-Gantenbein-Brunner-Patrut-Troller/Database/mongoDB/mongoProject
node . //<- mit Abstand
```

# Usage HSQL Database Manager

<b>Create Table, Insert Query</b>

```php
CREATE TABLE IF NOT EXISTS KUNDEN (
  ID DECIMAL PRIMARY KEY,
  DATE TIMESTAMP,
  EMAIL VARCHAR(24) NOT NULL,
  WALLET VARCHAR(36) NOT NULL,
  AMOUNT INT NOT NULL,);

INSERT INTO "PUBLIC"."KUNDEN" ( "ID", "DATE", "EMAIL", "WALLET", "AMOUNT" )
VALUES (2, timestamp '2090-07-15 00:00:00', 'info@test.com', '0xeXYZ123', 5000);
```