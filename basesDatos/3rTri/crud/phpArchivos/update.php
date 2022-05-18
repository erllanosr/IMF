<?php
require("./conexion.php");

$id = $_POST['id'];
$nombre = $_POST['nombre'];
$apellido1 = $_POST['apellido1'];
$apellido2 = $_POST['apellido2'];
$telefono = $_POST['telefono'];


$consulta = "UPDATE privada SET nombre='$nombre',apellido1='$apellido1', apellido2='$apellido2', telefono='$telefono' WHERE id='$id'";

$resultado = mysqli_query($conexion, $consulta);
//echo mysqli_error($link);
//echo "mysqli_error(mysqli $consulta)";

if ($resultado == FALSE) {
  echo "ERROR";
} else {
  echo "<html>";
  echo "<head>";
  echo "<meta http-equiv='Refresh' content=3;url='http://localhost/crud/htmlArchivos/index.html'>";
  echo "</head>";
  echo "<body>";
  echo "<p>Registro modificado correctamente.</p>";
  echo "Serás redirigido a la página principal en 3 segundos...<br><br>";
  echo "</body>";
  echo "</html>";
}
mysqli_close($conexion);
