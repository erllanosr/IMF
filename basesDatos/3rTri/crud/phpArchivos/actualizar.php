<?php
require("./conexion.php");
$id = $_GET['id'];

$consulta = "SELECT * FROM privada WHERE id='$id'";

$resultado = mysqli_query($conexion, $consulta);
$row = mysqli_fetch_array($resultado);
?>
<!DOCTYPE html>
<html lang="en">

<head>
  <title></title>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="../htmlArchivos/style.css" rel="stylesheet">
  <title>Actualizar | CRUD</title>
</head>

<body>
  <h1>Modificar | CRUD</h1>
  <h3>Modifica los datos de la persona.</h3>
  <form action="../phpArchivos/update.php" method="POST" class="form_Actualizar">
    <fieldset>
      <legend>Modificar</legend>
      <input type="hidden" name="id" value="<?php echo $row['id']  ?>">
      <label for="nombre">Nombre:</label><br />
      <input type="text" name="nombre" required value="<?php echo $row['nombre']  ?>" /><br />
      <label for="apellido1">Apellido Paterno:</label> <br />
      <input type="text" name="apellido1" required value="<?php echo $row['apellido1']  ?>" /><br />
      <label for="apellido2">Apellido Materno:</label><br />
      <input type="text" name="apellido2" required value="<?php echo $row['apellido2']  ?>" /><br />
      <label for="telefono">Teléfono: </label><br />
      <input type="number" name="telefono" minlength="9" maxlength="9" required value="<?php echo $row['telefono']  ?>" />
      <br />
      <br />
      <input type="submit" value="Actualizar" name="Actualizar" />
    </fieldset>
  </form>
</body>
<footer>
  <p>Erick Llanos Ríos | 1º DAW</p>
</footer>

</html>