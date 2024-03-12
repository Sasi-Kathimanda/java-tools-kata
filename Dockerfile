# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-alpine

# 
# Create a directory named "app" for my application files
RUN mkdir /app

# Print the current directory in the console
RUN echo "Copying source code into the container"

# Copy the current build directory contents into the container at /app
COPY lib/build/classes/java/main/ /app


# Set the working directory to /app
WORKDIR /app


# Run the Java program
CMD ["java", "tools.kata.Library"]
