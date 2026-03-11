all: build run

build:
	 @mvn compile

run:
	 @./mvnw -q spring-boot:run

clean:
	 @rm -rf ./target

#  make script file=test1
script:
	 @bash ./scripts/$(file).sh 

