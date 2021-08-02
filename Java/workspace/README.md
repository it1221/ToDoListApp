# README of java development environment
.

Prepare Java environment is not so easy.

So I use docker and develop java.

When you'd like to write java code, you can do that in this workspace!

If you don't know how to use and run java document file, you read here documents.

Have good development!

.

# How to use 
.

## First, you need to boot docker engine.
Open the Docker Desktop, and start docker engine.

Then,

```
$ cd workspace
```

```
workspace $ docker-compose up -d
```

.

# To Compile Java Document

## Run  `docker-compose exec java bash` at host directory(~/Java/workspace).
.

Then, indicate like `root@6981bd28de06:/usr/src#` as current directory.

So that you can compile with run 
```
$ javac filename1.java
```
 and run file with run 
```
$ java filename1.java
```

You can both of compile and run in Console.

.
# When you make java document file 


## You can make java document file in `server/src` directory.
.

Make `"filename2.java"` and compile, then `"filename2.class"` is created automatically.

You can develop without local environment of java cause using `Docker`.

.
# Finish to work

.
## You need to stop docker container
```
docker-compose stop
```
 so that the container is stopped.

.

---