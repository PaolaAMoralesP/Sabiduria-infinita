# Sabiduria Infinita

Sabiduria Infinita is a Java-based application designed to manage a collection of books. It provides functionalities to create, view, search, update, and delete book records.

## Table of Contents

- [Installation](#installation)
- [Usage](#usage)
- [Project Structure](#project-structure)
- [Dependencies](#dependencies)
- [Contributing](#contributing)
- [License](#license)
- [Made with Love](#made-with-love)

## Installation

1. **Clone the repository:**

   ```bash
   git clone https://github.com/PaolaAMoralesP/Sabiduria-infinita
   ```

2. **Navigate to the project directory:**

   ```bash
   cd sabiduria-infinita
   ```

3. **Build the project using Maven:**

   Ensure you have Maven installed. Then run:

   ```bash
   mvn clean install
   ```

## Usage

1. **Run the application:**

   You can run the application using the following command:

   ```bash
   mvn exec:java -Dexec.mainClass="com.mvc.App"
   ```

2. **Interact with the application:**

   Follow the on-screen menu to create, view, search, update, or delete books.

## Project Structure

- **`src/main/java/com/mvc`**: Contains the main application code.
  - **`App.java`**: The entry point of the application.
  - **`config/DBManager.java`**: Manages database connections.
  - **`controller/BookController.java`**: Handles the logic for book operations.
  - **`model/Book.java`**: Represents the Book entity.
  - **`model/BookDAO.java`**: Data Access Object for interacting with the database.
  - **`view/BookView.java`**: Handles user interaction and displays the menu.

- **`src/test/java/com`**: Contains test cases for the application.
  - **`AppTest.java`**: Basic unit tests for the application.

## Dependencies

The project uses the following dependencies:

- **PostgreSQL JDBC Driver**: For database connectivity.
- **Dotenv Java**: For loading environment variables.

Dependencies are managed via Maven and are specified in the `pom.xml` file.

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request for any improvements or bug fixes.

## 📜 License
This project is under the [Feminist Peer Production License 2F2](https://labekka.red/licencia-f2f/).  
<br>
<img src="https://github.com/user-attachments/assets/90acbc07-7ba9-45e1-867b-6d284f4e6288" alt="f2f-license" width="150">
<br>
You can use, modify, and share it freely. 🎉

Made with ❤️ by Alba Riera, Kat Leverton, Larissa Saud, Maria Bongoll and Paola Morales.

## Made with Love

This project is crafted with love for books and technology, aiming to bring the joy of reading and efficient management to everyone. Whether you're a developer or a book enthusiast, we hope you find this tool helpful and inspiring.


## ☎️ Contactos

<table style="border-collapse: collapse; border: none;">
  <tr>
  <td align="center" style="border: none;">
      <img src="https://github.com/user-attachments/assets/bba81df2-5865-44c6-a56b-f4688e67338c" alt="alba-avatar" width="80">
      <br><b>Alba Riera</b>
      <br>
      <a href="https://www.linkedin.com/in/albamar%C3%ADarieravelazquez/">LinkedIn</a> |
      <a href="https://github.com/rieradipe")">GitHub</a>
    </td>
  <td align="center" style="border: none;">
      <img src="https://github.com/user-attachments/assets/6b926678-a291-45ee-ab90-ca1dbfd3dfd3" alt="kat-avatar" width="80">
      <br><b>Kat Leverton</b>
      <br>
      <a href="https://www.linkedin.com/in/kat-leverton/">LinkedIn</a> |
      <a href="https://github.com/Kat-lev/">GitHub</a>
    </td>
    <td align="center" style="border: none;">
      <img src="https://github.com/user-attachments/assets/89108af5-007e-428f-b199-692beac81cc6" alt="larissa-avatar" width="80">
      <br><b>Larissa Saud</b>
      <br>
      <a href="https://www.linkedin.com/in/larissasaud/">LinkedIn</a> |
      <a href="https://github.com/saudlari/">GitHub</a>
    </td>
    <td align="center" style="border: none;">
      <img src="https://github.com/user-attachments/assets/89108af5-007e-428f-b199-692beac81cc6" alt="larissa-avatar" width="80">
      <br><b>Maria Bongoll</b>
      <br>
      <a href="https://www.linkedin.com/in/mariabongoll">LinkedIn</a> |
      <a href="https://github.com/Femcom-Mari">GitHub</a>
    </td>
    <td align="center" style="border: none;">
      <img src="https://github.com/user-attachments/assets/0b122db9-5533-4ec0-8266-cb21d390e9c6" alt="paola-avatar" width="80">
      <br><b>Paola Morales</b>
      <br>
      <a href="https://www.linkedin.com/in/paola-morales">LinkedIn</a> |
      <a href="https://github.com/PaolaAMoralesP">GitHub</a>
    </td>
  </tr>
</table>
