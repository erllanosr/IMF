<?php
//echo ("<table border=1>");
require("../phpArchivos/conexion.php");
$consulta = "SELECT * FROM privada";
?>
<!DOCTYPE html>
<html lang="es">

<head>
  <meta charset="UTF-8" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <link rel="stylesheet" href="../htmlArchivos/style.css" />
  <title>Mostrar | CRUD</title>
</head>

<body>
  <header>
    <nav class="topnav">
      <a href="../htmlArchivos/index.html">Inicio</a>
      <a href="../htmlArchivos/alta.html" target="_blank">Altas</a>
      <a href="../phpArchivos/baja.php" target="_blank">Bajas</a>
      <a href="../phpArchivos/modificar.php" target="_blank">Modificar</a>
      <a href="../phpArchivos/mostrar.php" class="active" target="_blank">Mostrar</a>
    </nav>
    <main>
      <h1>Mostrar | CRUD</h1>
      <h3>Todos los datos que hay en la base de datos.</h3>
      <table class="tabla_Mostrar">
        <tr>
          <th>id</th>
          <th>NOMBRE</th>
          <th>APELLIDO 1</th>
          <th>APELLIDO 2</th>
          <th>TELÉFONO</th>
        </tr>
        <?php
        if ($resultado = mysqli_query($conexion, $consulta)) {
          while ($row = mysqli_fetch_assoc($resultado)) {
        ?>
            <tr>
              <td><?php echo $row['id'] ?></td>
              <td><?php echo $row['nombre'] ?></td>
              <td><?php echo $row['apellido1'] ?></td>
              <td><?php echo $row['apellido2'] ?></td>
              <td><?php echo $row['telefono'] ?></td>
            </tr>
        <?php
          }
        }
        ?>
      </table>
      <br />
      <br />
    </main>
    <footer>
      <p>Erick Llanos Ríos | 1º DAW</p>
    </footer>
  </header>
</body>

</html>