# Java Backend Learning Roadmap

这个仓库用于系统复习 Java SE，并逐步学习 Java 后端开发、Spring 生态和企业级项目实践。学习以理解与动手为主：每个主题都要留下代码实验，关键机制要写成 Markdown 笔记。

## 学习路线

1. **Java SE**：面向对象、常用 API、集合、泛型、异常、IO、Java 8+。
2. **Java 基础机制**：反射、注解、代理和常见设计模式。
3. **Spring 学习实验室**：IoC、MVC、AOP、事务和 Spring Boot。
4. **企业项目实践**：黑马点评，先实现业务，再分析源码并做改造。
5. **项目改造与创新**：围绕真实问题探索 AI 能力和工程优化。

具体学习约定见 [AGENT.md](AGENT.md)。

## 开发环境

本仓库当前使用 **JDK 21 LTS** 编写基础实验。JDK 是编译、运行 Java 程序所必需的；IDE 是可选项。

- **操作系统**：Windows 10/11（命令示例使用 PowerShell）。
- **JDK**：Eclipse Temurin 21 LTS（推荐）或其他兼容的 JDK 21 发行版。安装完整的 JDK，而不是单独的 JRE。
- **IDE（可选）**：IntelliJ IDEA 2026.2 或更新的稳定版，创建/打开普通 Java 项目并将 Project SDK 设为 JDK 21。也可以使用 VS Code，并安装 Extension Pack for Java。
- **版本管理**：Git。基础实验阶段不要求安装 Maven 或 Gradle；开始框架项目时再按项目需要引入构建工具。

当前环境检测到 `java` 和 `javac` 均为 21.0.10，Git 为 2.48.1，已满足当前实验需要。

## Windows 安装与检查

### 安装 JDK 21

推荐用 Windows Package Manager 安装 Eclipse Temurin：

```powershell
winget install --exact --id EclipseAdoptium.Temurin.21.JDK
```

如果电脑没有 `winget`，从 [Eclipse Temurin 21 下载页](https://adoptium.net/temurin/releases/?version=21) 下载 Windows x64 的 **JDK MSI** 安装包并按提示安装。安装完成后重新打开 PowerShell。

### 验证 JDK

```powershell
java -version
javac -version
```

两条命令都应显示 21.x。如果提示找不到命令，检查安装器是否已将 JDK 的 `bin` 目录加入 `PATH`；必要时在 Windows“环境变量”中设置 `JAVA_HOME` 为 JDK 安装目录，并将 `%JAVA_HOME%\bin` 加入 `Path`，然后重新打开终端。

### 安装 Git（尚未安装时）

```powershell
winget install --exact --id Git.Git
```

验证：

```powershell
git --version
```

## 第一个实验：面向对象建模

实验目录：[phase-1-java-core/01-object-oriented](phase-1-java-core/01-object-oriented/README.md)。目前从 `User`、`Product`、`OrderItem`、`Order` 四个类开始，练习封装、对象协作和基于接口的折扣策略。

从仓库根目录运行：

```powershell
Set-Location .\phase-1-java-core\01-object-oriented
New-Item -ItemType Directory -Force out | Out-Null
javac -d out (Get-ChildItem -Recurse -Filter *.java | ForEach-Object FullName)
java -cp out com.noviter.learning.oop.OrderDemo
```

完成后按实验说明修改代码，并在笔记里回答对应问题。后续主题沿用“说明 + 可运行实验 + 复盘记录”的组织方式。

## 仓库结构

```text
.
├── AGENT.md
├── README.md
└── phase-1-java-core/
    └── 01-object-oriented/
        ├── README.md
        └── src/main/java/com/noviter/learning/oop/
```

