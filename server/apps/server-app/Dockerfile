# docker/dockerfile:1
FROM ghcr.io/graalvm/graalvm-community:21.0.2  AS bytechef-server-base

ARG ARG_APPLICATION_HOME=/opt/bytechef

RUN mkdir ${ARG_APPLICATION_HOME}
RUN mkdir ${ARG_APPLICATION_HOME}/server
RUN mkdir ${ARG_APPLICATION_HOME}/server/tmp
RUN mkdir ${ARG_APPLICATION_HOME}/server/logs

WORKDIR /opt/bytechef

COPY build/libs/server-app*.jar server/server-app.jar

ENTRYPOINT exec \
     java \
     -Dfile.encoding=UTF-8 -Duser.timezone=GMT \
     -Djava.io.tmpdir=/opt/bytechef/server/tmp \
     -Dserver.tomcat.basedir=/opt/bytechef/server \
     -Dserver.tomcat.accesslog.directory=/opt/bytechef/server/logs \
     -jar server/server-app.jar

FROM bytechef-server-base AS bytechef-server
