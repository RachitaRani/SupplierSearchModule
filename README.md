<h1>Supplier Search API</h1>

<p>
  The Supplier Search API is a Spring Boot application that allows users to search for suppliers based on specific criteria, such as location, nature of business, and manufacturing processes.
</p>

<h2>Table of Contents</h2>
<ul>
  <li><a href="#features">Features</a></li>
  <li><a href="#installation">Installation</a></li>
  <li><a href="#usage">Usage</a></li>
  <li><a href="#api-endpoints">API Endpoints</a></li>
  <li><a href="#swagger-ui">Swagger UI</a></li>
  <li><a href="#technologies-used">Technologies Used</a></li>
  <li><a href="#license">License</a></li>
</ul>

<h2 id="features">Features</h2>
<ul>
  <li>Add new suppliers to the database</li>
  <li>Search suppliers by location, nature of business, and manufacturing processes</li>
  <li>Retrieve a list of all suppliers</li>
</ul>

<h2 id="installation">Installation</h2>
<ol>
  <li>Clone the repository: <code>git clone https://github.com/yourusername/suppliersearch.git</code></li>
  <li>Navigate to the project directory: <code>cd suppliersearch</code></li>
  <li>Build the project using Maven: <code>mvn clean install</code></li>
  <li>Run the application: <code>mvn spring-boot:run</code></li>
</ol>

<h2 id="usage">Usage</h2>
<p>
  The Supplier Search API can be accessed via HTTP requests. Use tools like <a href="https://www.postman.com/">Postman</a> or <a href="https://curl.se/">cURL</a> to interact with the API.
</p>

<h2 id="api-endpoints">API Endpoints</h2>
<ul>
  <li><strong>POST /api/supplier/add</strong>: Add a new supplier</li>
  <li><strong>GET /api/supplier/all</strong>: Get a list of all suppliers</li>
  <li><strong>POST /api/supplier/query</strong>: Search suppliers by criteria</li>
</ul>

<h2 id="swagger-ui">Swagger UI</h2>
<p>
  Swagger UI is available for this project, allowing you to interact with the API via a web interface.
</p>
<p>
  Access Swagger UI at: <a href="http://localhost:8080/swagger-ui.html">http://localhost:8080/swagger-ui.html</a>
</p>
<p>
Postman cURL available at : <a href="https://winter-shadow-812294.postman.co/workspace/fa7066f6-2783-4383-87b4-06635ff55d74/documentation/17775344-f16dd50e-4d77-40c8-8d95-438ba32042aa"> OPEN POSTMAN HERE</a>
</p>

<h2 id="technologies-used">Technologies Used</h2>
<ul>
  <li>Spring Boot 3.3.2</li>
  <li>H2 Database (for development)</li>
  <li>PostgreSQL (for production)</li>
  <li>Spring Data JPA</li>
  <li>Swagger (via Springdoc OpenAPI)</li>
</ul>

<h2 id="license">License</h2>
<p>
  This project is licensed under the Apache 2.0 License. See the <a href="LICENSE">LICENSE</a> file for details.
  Created by <a href="https://github.com/RachitaRani">Rachita Rani</a>
</p>
