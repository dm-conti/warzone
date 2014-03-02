STEP 1 - build project
In rest folder run the following command:

> mvn clean install

STEP2 - run project
In controller folder run the following command:

> mvn jetty:run 

STEP3 - in browser web 
http://{ip}:{port}/controller/entities/{name}

example:
http://localhost:8080/controller/entities/aName