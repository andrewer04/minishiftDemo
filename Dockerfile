FROM azul/zulu-openjdk:8

ADD target/minishiftDemo-[0-9].[0-9].[0-9]-SNAPSHOT.jar minishiftDemo.jar

EXPOSE 8080

CMD java -jar minishiftDemo.jar
