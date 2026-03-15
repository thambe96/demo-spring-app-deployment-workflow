# Demo Spring Boot CI/CD Deployment

This project is a simple Spring Boot application created to gain hands-on experience with building and deploying applications using a complete CI/CD pipeline.

The project demonstrates how a Spring Boot application can be automatically built, containerized, pushed to a container registry, and deployed to a cloud server whenever code changes are pushed to the repository.

---

## Project Objective

The goal of this project is to understand and implement a basic **CI/CD workflow** using modern DevOps tools.

The workflow includes:

- Building the application
- Creating a Docker image
- Pushing the image to Docker Hub
- Deploying the application to an AWS EC2 instance

---

## Technologies Used

- **Spring Boot** – Backend application framework  
- **GitHub Actions** – CI/CD workflow automation  
- **Docker** – Containerization of the application  
- **Docker Hub** – Container image registry  
- **AWS EC2** – Cloud server used for deployment  
- **GitHub Secrets** – Secure storage of credentials and keys  

---

## CI/CD Workflow

The CI/CD pipeline is defined in:

### Workflow Process

Whenever a push is made to the **main branch**, the following steps are executed automatically:

1. Checkout the source code
2. Set up Java environment
3. Build the Spring Boot application
4. Build a Docker image
5. Push the Docker image to Docker Hub
6. Connect to the AWS EC2 instance via SSH
7. Pull the latest Docker image
8. Run the updated container

This ensures that the latest version of the application is always deployed automatically.

---

## Deployment Architecture


---

## Application Testing

Once deployed, the application can be tested using any HTTP client such as:

- **Postman**
- **curl command**
- **Web browser**

Example:


---

## Security

Sensitive information such as:

- Docker Hub credentials
- AWS SSH keys
- Server access details

are stored securely using **GitHub Secrets**.

---

## Learning Outcome

This project helped in understanding:

- CI/CD automation
- Containerized application deployment
- Cloud-based deployment using AWS
- Secure credential management
- Automated DevOps workflows

---

## Author

Created as a hands-on learning project for understanding modern DevOps and CI/CD practices.
