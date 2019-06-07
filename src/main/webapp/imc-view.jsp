<!DOCTYPE html>
<html>

<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Exemplo JSP (Java Server Pages) - Maior Menor</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
    integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
  <link href="https://fonts.googleapis.com/css?family=Cinzel&display=swap" rel="stylesheet">
  <style type="text/css">
    body {
      background-image: url("https://c.wallhere.com/photos/22/c1/1600x900_px_General-547992.jpg!d");
      background-size: cover;
      font-family: 'Cinzel', serif;
      display: flex;
      flex-direction: row;
      justify-content: center;
      align-items: center;
    }

    .block {
      display: flex;
      flex-direction: column;
      justify-content: center;
      align-items: center;
      text-align: center;

      background: rgb(134, 59, 5);
      color: white;
      width: 700px;
      padding: 10px;
      margin: 50px;
      border:30px ridge #6b3a09;
    }

    hr.style {
    overflow: visible;
    padding: 0;
    border: none;
    border-top: medium double #333;
    color: #333;
    text-align: center;
    width: 100%;
}
    hr.style:after {
    content: "X";
    display: inline-block;
    position: relative;
    top: -0.7em;
    font-size: 1.5em;
    padding: 0 0.25em;
}
  </style>
</head>
<div class="block">
  <h1>Qual o seu IMC?</h1>
  <h2>Informe seus dados para Vossa Majestade</h2><br>
  <form>
    <fieldset>
      <div class="form-group">
        <div class="form-group">
          <label>Informe sua altura (cm)</label>
          <input class="form-control" placeholder="altura" name="altura" type="text" value="167">
        </div>
        <div class="form-group">
          <label>Informe so seu peso (Kg)</label>
          <input class="form-control" placeholder="peso" name="peso" type="text" value="54">
        </div>
      </div>
      <button class="btn btn-warning" style="color: black">Calcular</button>
    </fieldset>
  </form>
  <hr class="style">
  <h3>
    ${imcNum}
  </h3>
  <h3>
    ${imcText}
  </h3>
</div>
</body>
</html>