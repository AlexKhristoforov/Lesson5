@>nul MD ".\dist
     @>nul javac -sourcepath ./src -d dist  src/by/itacademy/lessson5/task3/*.java
     java -cp dist by.itacademy.lessson5.task3.Main
     @>nul RD /s/q ".\dist
     pause