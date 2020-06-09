$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/features/CompraEquipo.feature");
formatter.feature({
  "line": 1,
  "name": "Comprar articulo en la plataforma de compras",
  "description": "",
  "id": "comprar-articulo-en-la-plataforma-de-compras",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1475078800,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Comprar articulos",
  "description": "",
  "id": "comprar-articulo-en-la-plataforma-de-compras;comprar-articulos",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "que Juan ingresa a la platorma de compras",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "busque un articulo para comprar",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "llene el formulario y termine la compra",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "la compra sera exitosa",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Juan",
      "offset": 4
    }
  ],
  "location": "StepCompra.queIngresaALaPlatormaDeCompras(String)"
});
formatter.result({
  "duration": 8069290500,
  "status": "passed"
});
formatter.match({
  "location": "StepCompra.busqueUnArticuloParaComprar()"
});
formatter.result({
  "duration": 9452430200,
  "status": "passed"
});
formatter.match({
  "location": "StepCompra.lleneElFormularioYTermineLaCompra()"
});
formatter.result({
  "duration": 1688329100,
  "status": "passed"
});
formatter.match({
  "location": "StepCompra.laCompraSeraExitosa()"
});
formatter.result({
  "duration": 38118500,
  "status": "passed"
});
formatter.after({
  "duration": 756972800,
  "status": "passed"
});
});