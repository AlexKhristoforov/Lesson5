@>nul MD ".\dist
     @>nul javac -sourcepath ./src -d dist  src/by/itacademy/lessson5/task2/*.java
     java -cp dist by.itacademy.lessson5.task2.Main
     @>nul RD /s/q ".\dist
     pause