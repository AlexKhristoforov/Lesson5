@>nul MD ".\dist
     @>nul javac -sourcepath ./src -d dist  src/by/itacademy/lessson5/task1/*.java
     java -cp dist by.itacademy.lessson5.task1.Main
     @>nul RD /s/q ".\dist
     pause