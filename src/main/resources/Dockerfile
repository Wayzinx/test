# 基于 OpenJDK 11 创建镜像
FROM openjdk:11-jre-slim

# 添加维护者信息（可选）
LABEL maintainer="wayzinx@outlook.com"

# 将编译生成的可执行jar文件复制到容器内
COPY target/*.jar /app.jar

# 暴露容器的8080端口
EXPOSE 8080

# 定义容器启动时执行的命令
ENTRYPOINT ["java", "-jar", "/app.jar"]
