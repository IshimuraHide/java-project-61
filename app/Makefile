run-dist:
	./build/install/app/bin/app
clean:
	./gradlew clean
build:
	./gradlew clean build
run:
	./gradlew run
check-deps:
	./gradlew dependencyUpdates -Drevision=release
install:
	./gradlew clean install
test:
	./gradlew test

build-run: build run

.PHONY: build