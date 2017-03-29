# Docker with Spring Boot
- Install [docker](https://www.docker.com/)
- Build Package and docker image: `mvn clean package docker:build`
- Run docker container: `docker run -p 8080:8080 -d mguilherme/spring-boot-docker`
- Run `curl localhost:8080 | json_pp` and you should see a list of books in json format

#### Optional (Not Exposing ports to host)
You can run the docker container without exposing the ports to host:

- Run docker container: `docker run -d mguilherme/spring-boot-docker`, this will retrieve the **Container ID**!
- Check Container ID: `docker ps -a` and search for **mguilherme/spring-boot-docker** image
- Check container IP: `docker inspect -f '{{range .NetworkSettings.Networks}}{{.IPAddress}}{{end}}' <CONTAINER_ID>`
- Run `curl <IP>:8080 | json_pp` to get the list of books