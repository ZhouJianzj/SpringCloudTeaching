在Spring中使用远程配置（如Spring Cloud Config Server）时，配置文件的读取顺序通常遵循以下规则：

1. **默认配置文件（`bootstrap.properties`或`bootstrap.yml`）**： Spring Boot在启动时会首先加载`bootstrap.properties`或`bootstrap.yml`文件。这些文件通常用于配置应用程序的一些基本属性，如应用程序的名称、配置服务器的地址等。这些配置会在应用程序的上下文之前加载，以确保应用程序能够连接到配置服务器。

2. **远程配置服务器**：一旦`bootstrap.properties`或`bootstrap.yml`文件加载完毕，Spring Boot会尝试连接配置服务器，并获取应用程序的配置。配置服务器可以存储应用程序的配置信息，通常以`{name}-{profile}.properties`或`{name}-{profile}.yml`的命名约定存储不同配置文件，其中`name`是应用程序的名称，`profile`是Spring的激活配置文件（例如`dev`、`prod`等）。

3. **本地配置文件**：如果应用程序需要，可以在本地（在应用程序的类路径中）提供额外的配置文件，这些文件会在从配置服务器获取的配置之后加载，可以用于覆盖或补充配置。这些本地配置文件通常是`application.properties`或`application.yml`。

4. **命令行参数**：最后，Spring Boot会考虑命令行参数，这些参数可以用于覆盖先前加载的配置。

在这个顺序中，配置服务器提供的配置具有最高的优先级，可以被本地配置文件和命令行参数覆盖。这种优先级顺序允许应用程序在不同环境中使用不同的配置，同时仍然具有一组通用的配置作为基础。

请注意，你可以根据具体的需求和使用情况调整配置文件的加载顺序，以满足应用程序的要求。