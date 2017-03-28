# Docker with Spring Boot
- Install [docker](https://www.docker.com/)
- Build Package and docker image: `mvn clean package docker:build`
- Run docker container: `docker run -d mguilherme/spring-boot-docker -p 8080:8080`, this will retrieve the **Container ID**
- Check Container ID: `docker ps -a` and search for **mguilherme/spring-boot-docker** image
- Check container IP: `docker inspect -f '{{range .NetworkSettings.Networks}}{{.IPAddress}}{{end}}' <CONTAINER_ID>`