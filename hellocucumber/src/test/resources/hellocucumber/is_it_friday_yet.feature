# language: es
Característica: ya es viernes?
  Todo el mundo quiere saber cuando es viernes

  Escenario: Domingo no es viernes
    Dado hoy es domingo
    Cuando pregunto si es viernes
    Entonces me dicen que "Nope"

  Escenario: Viernes es viernes
    Dado hoy es viernes
    Cuando pregunto si es viernes
    Entonces me dicen que "Si"


