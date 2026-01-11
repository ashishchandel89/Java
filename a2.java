@echo off
setlocal

:: ✅ Set the correct Java JDK path here
set JAVA_HOME=C:\Program Files\Java\jdk-17.0.2

:: ✅ Set the correct PATH using JAVA_HOME
set PATH=%JAVA_HOME%\bin;%PATH%

echo JAVA_HOME set to: %JAVA_HOME%
echo.
echo Checking Java Versions...
java -version
javac -version

pause

