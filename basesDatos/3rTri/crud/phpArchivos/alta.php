<?php
//include();
require("../phpArchivos/conexion.php"); // Es normal usar dos archivos distintos.

//echo "PRUEBA 1";
// Vamos a trasladar mediante el uso de variables los valores que nos va a enviar el formulario

$instruccion_SQL = "INSERT INTO privada (nombre, apellido1, apellido2, telefono) VALUES ('" . $_GET['nombre'] . "','" . $_GET['apellido1'] . "','" . $_GET['apellido2'] . "','" . $_GET["telefono"] . "')";

//echo "mysqli_error(mysqli $instruccion_SQL)";

//echo "PRUEBA 2";

$resultado = mysqli_query($conexion, $instruccion_SQL);
if ($resultado == FALSE) {
  echo "error en la consulta.";
} else {
  //header('Location: http://localhost/crud/htmlArchivos/index.html');
  //die();
  echo "<html>";
  echo "<head>";
  echo "<meta http-equiv='Refresh' content=3;url='http://localhost/crud/htmlArchivos/index.html'>";
  echo "</head>";
  echo "<body>";
  echo "<p>Registro guardado correctamente.</p>";
  echo "Serás redirigido a la página principal en 3 segundos...<br><br>";
  echo "</body>";
  echo "</html>";
}

mysqli_close($conexion);
