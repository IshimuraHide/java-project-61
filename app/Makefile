run-dist:
	./build/install/app/bin/app
clean:
	./gradlew clean
build:
	./gradlew clean build
build2:
	./gradlew clean installDist
run:
	./gradlew run
check-deps:
	./gradlew dependencyUpdates -Drevision=release
install:
	./gradlew clean install
test:
	./gradlew test
checkstyle:
	gradle checkstyleMain


build-run: build run

.PHONY: build