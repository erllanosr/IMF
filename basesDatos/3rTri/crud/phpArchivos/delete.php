<?php
require("./conexion.php");
$id = $_GET['id'];
$consulta = "DELETE FROM privada WHERE id='$id'";
$resultado = mysqli_query($conexion, $consulta);
//$query = mysqli_query($con, $sql);

if ($resultado) {
  echo "<html>";
  echo "<head>";
  echo "<meta http-equiv='Refresh' content=5;url='http://localhost/crud/htmlArchivos/index.html'>";
  echo "</head>";
  echo "<body>";
  echo "<p>Registro borrado correctamente.</p>";
  echo "Serás redirigido a la página principal en 5 segundos...<br><br>";
  echo "</body>";
  echo "</html>";
}
