# Bug in Spring Boot 2

I have a project in Spring Boot 1 that I want to migrate to Spring Boot 2.
It's a bunch of services that share common code. This is just a part of the whole system
and it's become very annoying for people in other areas to start all the services just so
they can run the whole thing on their environment, so I decided to create a mega-service
which includes all other services and it makes their life easier. It runs wonderfully on
Spring Boot 1.5.

It won't compile on Spring Boot 2, because it can't find anything contained in the
other services.

This repo has two directories with the exact same stuff: a library, a service that uses
the library, and another service which uses the library and the first service. The boot1
version runs just fine (just do `gradle bootRun` on  `service2`, but the `boot2` version
won't compile, complaining that it can't find a class that's in `service1`.

I'm publishing this in the hopes that someone can help me figure this out.
