# Docker Tomcat Java Example

[![Software License][ico-license]](LICENSE.md)

This is a simple example for running a docker container with tomcat and java.

## Get it up and running

- [Install docker on your machine.][install-docker]

- [Install docker-compose on your machine.][install-docker-compose]

- [Install gradle on your machine.][install-gradle]

- Clone this repository.

``` bash
$ git clone https://github.com/mhilker/docker-tomcat-java-example
```

- Switch to the cloned directory.

``` bash
$ cd docker-tomcat-java-example
```

- Build the project.

``` bash
$ gradle build
```

- Start the stack.

``` bash
$ docker-compose up
```

- You should see an output like this.

``` bash
TODO
```

- Visit `localhost:8888` in your browser. You should see an output like this.

![Hello World Output with Docker and Java + Tomcat](./resources/screenshot-01.png)

## License

The MIT License (MIT). Please see [License File](LICENSE.md) for more information.

[ico-license]: https://img.shields.io/badge/license-MIT-brightgreen.svg?style=flat-square
[install-docker]: https://docs.docker.com/engine/installation
[install-docker-compose]: https://docs.docker.com/compose/install
[install-gradle]: https://gradle.org/install
