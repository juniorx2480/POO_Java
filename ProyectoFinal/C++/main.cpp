#include <iostream>
#include <vector>
#include "regresion_lineal.h"

int main() {
    RegresionLineal modelo;
    std::vector<double> ventas = {10, 20, 30, 40, 50};
    std::vector<double> precios = {100, 200, 300, 400, 500};

    modelo.entrenar(ventas, precios);

    std::cout << "Precio predicho para 60 ventas: " << modelo.predecir(60) << std::endl;
    std::cout << "MSE: " << modelo.calcularMSE(ventas, precios) << std::endl;

    return 0;
}

