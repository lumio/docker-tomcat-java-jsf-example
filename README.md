# Docker Tomcat Java Example with JSF Support

[![Software License][ico-license]](LICENSE.md)

This repository is based on https://github.com/mhilker/docker-tomcat-java-example

## Get it up and running

- [Install docker on your machine.][install-docker]

- [Install docker-compose on your machine.][install-docker-compose]

- Clone this repository.

``` bash
$ git clone https://github.com/lumio/docker-tomcat-java-jsf-example.git
```

- Switch to the cloned directory.

``` bash
$ cd docker-tomcat-java-jsf-example
```

- Start the stack.

``` bash
$ docker-compose up --build
```

- Visit `localhost:8080` in your browser. You should see an output like this.

**Note that any changes might require a rebuild!** So just <kbd>Ctrl</kbd> + <kbd>C</kbd> and rerun the `docker-compose` command.

## License

The MIT License (MIT). Please see [License File](LICENSE.md) for more information.

[ico-license]: https://img.shields.io/badge/license-MIT-brightgreen.svg?style=flat-square
[install-docker]: https://docs.docker.com/engine/installation
[install-docker-compose]: https://docs.docker.com/compose/install
[install-gradle]: https://gradle.org/install
